package Observer_Pattern.ob3;

public class InstaSubcrib implements Observnewz{
    String name;


    public InstaSubcrib(String name){
        this.name = name;
    }
    @Override
    public void update(String news) {
        System.out.println(name+"jdjdj"+news);
    }
}
