public class BaseUser {
    protected final String name;

    public BaseUser(String name) {
        this.name = name;
    }

    public String displayName() {
        return name.trim().toUpperCase();
    }
}

class AdminUser extends BaseUser {
    public AdminUser(String name) {
        super(name);
    }
}

class GuestUser extends BaseUser {
    public GuestUser(String name) {
        super(name);
    }
}
