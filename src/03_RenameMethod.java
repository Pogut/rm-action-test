public class NotificationService {
    public void notifyCustomer(String email, String message) {
        sendEmail(email, message);
    }

    private void sendEmail(String email, String message) {
        System.out.println("Sending to " + email + ": " + message);
    }
}
