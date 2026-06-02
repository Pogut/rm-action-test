public class LoginGuard {
    public String accessMessage(boolean locked, boolean verified) {
        if (!locked && verified) {
            return "Access granted";
        } else {
            return "Access denied";
        }
    }
}
