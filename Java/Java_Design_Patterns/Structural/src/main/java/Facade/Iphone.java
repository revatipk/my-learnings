package Facade;

public class Iphone implements MobileShop{

    @Override
    public void modelNo() {
        System.out.println("Iphone6");
    }

    @Override
    public void price() {
        System.out.println("RS. 65000");
    }
}