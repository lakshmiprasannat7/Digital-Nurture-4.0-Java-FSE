
public class NotificationService {
    private Messenger messenger;

    public NotificationService(Messenger messenger) {
        this.messenger = messenger;
    }

    public void notifyUser(String user) {
        messenger.send(user, "Hello " + user);
    }
}
