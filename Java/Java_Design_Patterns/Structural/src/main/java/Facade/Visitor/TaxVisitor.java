package Facade.Visitor;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor{
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    @Override
    public double visitor(Shirt shirt) {
        System.out.println("Shirt Final Price with Tax : ");
        return Double.parseDouble(decimalFormat.format(shirt.getPrice()*.10+shirt.getPrice()));
    }

    @Override
    public double visitor(Tshirt tshirt) {
        System.out.println("Tshirt Final Price with Tax : ");
        return Double.parseDouble(decimalFormat.format(tshirt.getPrice()*.20+tshirt.getPrice()));
    }

    @Override
    public double visitor(Jacket jacket) {
        System.out.println("Jacket Final Price with Tax : ");
        return Double.parseDouble(decimalFormat.format(jacket.getPrice()*.30+jacket.getPrice()));
    }
}
