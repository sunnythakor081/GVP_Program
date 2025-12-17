package Proxy;

public class O implements I_cal{
    @Override
    public double sumofnum() {

        int A = 20;
        int B = 40;

        int sum = A*B;
        return sum;
    }
}
