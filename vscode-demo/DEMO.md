# RefactoringMiner for VS Code: demo

A small shop project (`src/shop`) with refactorings set up for each of the extension's five modes. Open this repository in VS Code with the extension installed, check out `vscode-demo`, and open the RefactoringMiner view.

```bash
git switch vscode-demo
```

| Mode | What to pick | What it finds |
|---|---|---|
| Working Tree vs HEAD | Apply `working-tree.patch` first (below) | Rename Method, two Extract And Move Method into the new, untracked `LoyaltyPolicy.java` |
| Commit vs Parent… | "Split Order.total into subtotal, discount and tax steps" | Three Extract Method in `Order` |
| Pull Request… | Branch `vscode-demo-feature`, into `vscode-demo` | Rename Class `InvoicePrinter` → `ReceiptPrinter`, Rename Method, Rename Attribute, Rename Parameter |
| Two Files… | `two-files/before/PaymentService.java` and `two-files/after/PaymentService.java` | Extract Method (from two methods), Rename Method, Rename Attribute |
| Compare Range of Commits… | Base `demo-start`, head `demo-end` | 18 refactorings: Extract Class `Address`, Move Attribute, Move Method, Pull Up Method, Extract Method |

## Working tree changes

```bash
git apply vscode-demo/working-tree.patch
```

Undo them after the demo:

```bash
git apply -R vscode-demo/working-tree.patch
```

## History

```
demo-start  Add the VS Code extension demo project
            Split Order.total into subtotal, discount and tax steps
            Extract the customer's address into its own class
demo-end    Pull the shared displayName up into Account
  ├─ vscode-demo-feature: Rename InvoicePrinter to ReceiptPrinter and extract formatLine
  │                       Rename optedIn to emailOptedIn
  └─ vscode-demo:         Add the demo guide and working tree patch
```

The pull request branch forked at `demo-end`. `vscode-demo` moved on after that, and the Pull Request mode still shows only what the branch changed, like GitHub's "Files changed" tab.
