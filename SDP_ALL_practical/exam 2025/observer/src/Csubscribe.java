public class Csubscribe implements subsciber {
    String name;

    public Csubscribe(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " recived: " + news);
    }
}
