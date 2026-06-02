public class NotificationService {
    public void notifyCustomer(String email, String message) {
        deliverEmail(email, message);
    }

    private void deliverEmail(String email, String message) {
        System.out.println("Sending to " + email + ": " + message);
    }
}
