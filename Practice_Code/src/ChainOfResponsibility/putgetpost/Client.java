package ChainOfResponsibility.putgetpost;

public class Client {
    public static void main(String[] args) {

        Handlermy get = new Get();
        Handlermy post = new Post();
        Handlermy put = new Put();

        get.sethandler(post);
        post.sethandler(put);


        // Test requests
        get.handle("GET");
        get.handle("POST");
        get.handle("PUT");
        get.handle("DELETE");







    }
}
