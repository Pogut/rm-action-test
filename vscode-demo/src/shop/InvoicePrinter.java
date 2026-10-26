package shop;

public class InvoicePrinter {
    public String print(Order order, String customerName) {
        StringBuilder out = new StringBuilder();
        out.append("Invoice for ").append(customerName).append("\n");
        for (OrderLine line : order.getLines()) {
            out.append(line.getProduct())
               .append(" x").append(line.getQuantity())
               .append("  ").append(String.format("%.2f", line.getUnitPrice() * line.getQuantity()))
               .append("\n");
        }
        out.append("Total: ").append(String.format("%.2f", order.total())).append("\n");
        out.append(order.getCustomer().getAddress().mailingLabel());
        return out.toString();
    }
}
