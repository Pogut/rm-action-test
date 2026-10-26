package shop;

public abstract class Account {
    protected final String id;
    protected final String name;

    protected Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String displayName() {
        if (name == null || name.isBlank()) {
            return "Customer " + id;
        }
        return name.trim();
    }

    public abstract double discountRate();
}
