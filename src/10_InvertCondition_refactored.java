public class LoginGuard {
    public String accessMessage(boolean locked, boolean verified) {
        if (locked || !verified) {
            return "Access denied";
        } else {
            return "Access granted";
        }
    }
}
