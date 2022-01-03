public class ChocolateIcecream extends IcecreamDecorator{

    public ChocolateIcecream(Icecream icecream) {
        super(icecream);
    }

    @Override
    public double cost() {
        return 20.0+super.cost();
    }
}
