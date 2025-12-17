package Stratagy2;

public class kingcobra implements Snak{
    private Bitebihv bitebihv = new Nonpois();;

    @Override
    public String display() {
        return "i am kingcobra";
    }

    @Override
    public String setbite() {
        return bitebihv.bite();
    }

    @Override
    public void permonce(Bitebihv bitebihv) {

        this.bitebihv = bitebihv;
    }
}
