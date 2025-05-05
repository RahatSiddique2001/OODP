public class NotificationFactory {

    // only for singleton pattern

    private static NotificationFactory instance = new NotificationFactory();

    private NotificationFactory() {}

    public static NotificationFactory getInstance() {
        return instance;
    }
    

    // both for singleton and factory

    public Notification createNotification(String notificationType) {

        if(notificationType == null) {
            return null;
        }

        if(notificationType.equalsIgnoreCase("email")) {
            return new EmailNotification();
        } else if(notificationType.equalsIgnoreCase("sms")) {
            return new SMSNotification();
        } else if(notificationType.equalsIgnoreCase("push")) {
            return new PushNotification();
        }
        return null;
    }
}
