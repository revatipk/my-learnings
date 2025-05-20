package Facade.Visitor;

public class Tshirt implements Visitable{

    double price;

    public Tshirt(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visitor(this);
    }
}
