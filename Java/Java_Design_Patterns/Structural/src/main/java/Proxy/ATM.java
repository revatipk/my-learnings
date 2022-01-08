package Proxy;

public class ATM implements  Bank{
    RealBank realBank = new RealBank();
    @Override
    public void withdrawMoney(String clientName) {
        realBank.withdrawMoney(clientName);
    }
}
