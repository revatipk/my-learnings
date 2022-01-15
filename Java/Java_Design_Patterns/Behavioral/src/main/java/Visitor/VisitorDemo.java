package Visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        TaxVisitor taxVisitor = new TaxVisitor();
        Jacket jacket = new Jacket(22.0);
        Shirt shirt = new Shirt(45.0);
        Tshirt tshirt = new Tshirt(67.0);

        System.out.println(jacket.accept(taxVisitor));
        System.out.println(shirt.accept(taxVisitor));
        System.out.println(tshirt.accept(taxVisitor));

    }
}
