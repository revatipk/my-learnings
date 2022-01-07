package Facade;

public class Nokia implements MobileShop{

    @Override
    public void modelNo() {
        System.out.println("Nokia");
    }

    @Override
    public void price() {
        System.out.println("RS. 45000");
    }
}