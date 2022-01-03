public class IcecreamDecorator implements Icecream{
    Icecream icecream;
    public IcecreamDecorator(Icecream icecream)
    {
        this.icecream=icecream;
    }
    public double cost() {
        return this.icecream.cost();
    }
}
