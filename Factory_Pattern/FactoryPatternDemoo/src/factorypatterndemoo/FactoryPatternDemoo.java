package factorypatterndemoo;
interface Notification {
    void notifyUser();
}
class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email Notification");
    }
}
class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS Notification");
    }
}
class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending a Push Notification");
    }
}
class NotificationFactory {
    public Notification getNotification(String notificationType) {
        if (notificationType == null) {
            return null;
        }
        if (notificationType.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        } else if (notificationType.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        } else if (notificationType.equalsIgnoreCase("PUSH")) {
            return new PushNotification();
        }
        return null;
    }
}
public class FactoryPatternDemoo {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        Notification notification1 = notificationFactory.getNotification("EMAIL");
        notification1.notifyUser();

        Notification notification2 = notificationFactory.getNotification("SMS");
        notification2.notifyUser();

        Notification notification3 = notificationFactory.getNotification("PUSH");
        notification3.notifyUser();
    }
}

