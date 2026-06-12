/*
 * Shared dark-mode controller for the RefactoringMiner web UI.
 *
 * Responsibilities:
 *  - Resolve the active theme (persisted choice > OS preference > light).
 *  - Apply it to <html> via the data-theme attribute as early as possible
 *    (this script is loaded in <head>, so it runs before the body paints,
 *    avoiding a flash of the wrong theme).
 *  - Swap the highlight.js stylesheet and the Monaco editor theme live.
 *  - Expose RMTheme.toggle() for the toolbar button and rmMonacoTheme() so
 *    editors created later pick the right theme at construction time.
 */
(function () {
    const STORAGE_KEY = 'rm-theme';
    const root = document.documentElement;

    function stored() {
        try {
            return localStorage.getItem(STORAGE_KEY);
        } catch (e) {
            return null;
        }
    }

    function systemPrefersDark() {
        return window.matchMedia && window.matchMedia('(prefers-color-scheme: dark)').matches;
    }

    function current() {
        return stored() || (systemPrefersDark() ? 'dark' : 'light');
    }

    function isDark() {
        return current() === 'dark';
    }

    function applyHighlightTheme(dark) {
        const links = document.querySelectorAll('link[rel="stylesheet"]');
        links.forEach(function (link) {
            const href = link.getAttribute('href') || '';
            if (href.indexOf('highlight.js') === -1) {
                return;
            }
            const target = dark ? 'styles/github-dark.min.css' : 'styles/default.min.css';
            link.setAttribute('href', href.replace(/styles\/[^/]+\.min\.css/, target));
        });
    }

    function updateButton(theme) {
        const btn = document.getElementById('theme-toggle');
        if (!btn) {
            return;
        }
        const dark = theme === 'dark';
        btn.textContent = dark ? '☀ Light' : '\u{1F319} Dark';
        btn.setAttribute('title', dark ? 'Switch to light mode' : 'Switch to dark mode');
        btn.setAttribute('aria-pressed', String(dark));
    }

    function apply(theme) {
        root.setAttribute('data-theme', theme);
        root.setAttribute('data-bs-theme', theme);
        applyHighlightTheme(theme === 'dark');
        if (window.monaco && monaco.editor && monaco.editor.setTheme) {
            monaco.editor.setTheme(theme === 'dark' ? 'vs-dark' : 'vs');
        }
        updateButton(theme);
    }

    function set(theme) {
        try {
            localStorage.setItem(STORAGE_KEY, theme);
        } catch (e) {
            /* ignore storage failures (e.g. private mode) */
        }
        apply(theme);
    }

    function toggle() {
        set(isDark() ? 'light' : 'dark');
    }

    window.RMTheme = {get: current, set: set, toggle: toggle, isDark: isDark};
    window.rmMonacoTheme = function () {
        return isDark() ? 'vs-dark' : 'vs';
    };

    // Apply immediately so the page renders in the correct theme from the start.
    apply(current());

    // The toolbar button is part of <body>, so sync its label once it exists.
    document.addEventListener('DOMContentLoaded', function () {
        updateButton(current());
    });
})();
