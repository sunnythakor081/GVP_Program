

import java.util.ArrayList;
import java.util.List;

class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String latestNews;


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(latestNews);
        }
    }

    public void setNews(String news) {
        this.latestNews = news;
        notifyObservers();
    }
}
