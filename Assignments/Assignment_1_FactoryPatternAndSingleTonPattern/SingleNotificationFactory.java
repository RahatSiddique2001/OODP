public class SingleNotificationFactory {
    
    private static SingleNotificationFactory instance = new SingleNotificationFactory();

    private SingleNotificationFactory() {

    }

    public static SingleNotificationFactory getInstance() {
        return instance;
    }
}
