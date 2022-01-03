public class VanillaIcecream extends IcecreamDecorator{
    public VanillaIcecream(Icecream icecream) {
        super(icecream);
    }

    @Override
    public double cost() {
        return 10.0+super.cost();
    }
}

