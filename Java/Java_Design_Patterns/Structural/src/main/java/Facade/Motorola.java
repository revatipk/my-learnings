package Facade;

public class Motorola implements MobileShop{

    @Override
    public void modelNo() {
        System.out.println("Moto");
    }

    @Override
    public void price() {
        System.out.println("RS. 25000");
    }
}
