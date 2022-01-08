package Proxy;

public class RealBank implements Bank{
    @Override
    public void withdrawMoney(String clientName) {
        System.out.println("Withdrawing money from : "+clientName);
    }
}
