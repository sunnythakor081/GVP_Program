import java.util.ArrayList;

public class cpublisher implements publisher {
    ArrayList<subsciber> news=new ArrayList<>();
    public void addnews(subsciber s)
    {
        news.add(s);
    }
    public void notify(String  s)
    {
        for(subsciber sub : news){
            sub.update(s);
        }
    }
    public void published(String news)
    {
        System.out.println("Publis news :"+news);
        notify(news);
    }

}
