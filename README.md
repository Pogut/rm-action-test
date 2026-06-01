# rm-action-test

Test repo for [refactoringminer-action](https://github.com/Pogut/refactoringminer-action).

## How to trigger a detection

1. Create a branch off `main`
2. Replace `src/Calculator.java` with `src/Calculator_refactored.java` (rename it)
3. Open a PR — the action will comment with the detected refactorings
