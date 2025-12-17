

public class main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Observer subscriber1 = new NewsSubscriber("A");
        Observer subscriber2 = new NewsSubscriber("B");

        agency.registerObserver(subscriber1);
        agency.registerObserver(subscriber2);

        agency.setNews("CSK Won Match");
        agency.setNews("Congratulate dhoni");
    }
}