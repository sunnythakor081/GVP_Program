public class App {
    public static void main(String[] args) throws Exception {
     
        cpublisher p =new cpublisher();
        Csubscribe c1=new Csubscribe("manish");
        Csubscribe c2=new Csubscribe("praveen");
        p.addnews(c1);
        p.addnews(c2);
        p.published("Tomorrow sdp practical exam..");
    }
}
