package Observer2;

public class MainApp {

    public static void main(String[] args) {

        // Subject (Instagram Channel)
        Insta instaChannel = new Insta("CodeWithSunny");

        // Observers (Subscribers)
        Observ user1 = new Subscrib("Rahul");
        Observ user2 = new Subscrib("Amit");
        Observ user3 = new Subscrib("Neha");

        // Register subscribers
        instaChannel.register(user1);
        instaChannel.register(user2);
        instaChannel.register(user3);

        // Upload video
        instaChannel.upload("Observer Pattern Tutorial");

        System.out.println("----- One user unsubscribed -----");

        // Remove one subscriber
        instaChannel.removeregister(user2);

        // Upload another video
        instaChannel.upload("Singleton vs Observer Explained");
    }
}
