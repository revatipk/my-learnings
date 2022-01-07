package Facade;

public class ShopKeeper {
    private MobileShop iphone;
    private MobileShop moto;
    private MobileShop nokia;

    public ShopKeeper() {
        iphone = new Iphone();
        moto = new Motorola();
        nokia = new Nokia();
    }

    public void iphoneSale() {
        iphone.modelNo();
        iphone.price();
    }

    public void MotoSale()
    {
        moto.modelNo();
        moto.price();
    }
    public void NoikaSale()
    {
        nokia.modelNo();
        nokia.price();

    }
}
