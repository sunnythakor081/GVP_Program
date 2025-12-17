package Facad;

public class ShopKeeper {

    private MobileShop iphone;
    private MobileShop samsung;
    private MobileShop google_pixel;

    public ShopKeeper(){

        iphone = new Iphone();
        samsung = new Samsung();
        google_pixel = new Google_pixel();

    }

    public void iphonesale(){

        iphone.mobilename();
        iphone.price();
    }

    public void samsungsale(){

        samsung.mobilename();
        samsung.price();
    }

    public void google_pixelsale(){

        google_pixel.mobilename();
        google_pixel.price();
    }

}
