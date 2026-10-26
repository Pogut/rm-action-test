package shop;

public class ReceiptPrinter {
    public String render(Order order, String buyerName) {
        StringBuilder out = new StringBuilder();
        out.append("Receipt for ").append(buyerName).append("\n");
        for (OrderLine line : order.getLines()) {
            out.append(formatLine(line)).append("\n");
        }
        out.append("Total: ").append(String.format("%.2f", order.total())).append("\n");
        out.append(order.getCustomer().getAddress().mailingLabel());
        return out.toString();
    }

    private String formatLine(OrderLine line) {
        return line.getProduct()
               + " x" + line.getQuantity()
               + "  " + String.format("%.2f", line.getUnitPrice() * line.getQuantity());
    }
}
