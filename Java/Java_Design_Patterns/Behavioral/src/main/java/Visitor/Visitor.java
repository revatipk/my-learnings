package Visitor;

public interface Visitor {
    double visitor(Shirt shirt);
    double visitor(Tshirt tshirt);
    double visitor(Jacket jacket);
}
