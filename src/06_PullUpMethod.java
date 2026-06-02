public class BaseUser {
    protected final String name;

    public BaseUser(String name) {
        this.name = name;
    }
}

class AdminUser extends BaseUser {
    public AdminUser(String name) {
        super(name);
    }

    public String displayName() {
        return name.trim().toUpperCase();
    }
}

class GuestUser extends BaseUser {
    public GuestUser(String name) {
        super(name);
    }

    public String displayName() {
        return name.trim().toUpperCase();
    }
}
