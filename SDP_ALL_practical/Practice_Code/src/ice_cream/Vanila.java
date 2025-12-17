package ice_cream;

public class Vanila implements I_Ice_Cream {
    @Override
    public void getcost() {
        System.out.println("vanila cost");

    }

    @Override
    public double getDescription() {
        System.out.println("vanila description");

        return 0;
    }


}
