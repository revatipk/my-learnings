public class DecoratorDemo {
    public static void main(String[] args) {
        Icecream icecream = new BaseIcecream();
        System.out.println("Cost of Base icecream : "+icecream.cost());

        ChocolateIcecream chocolateIcecream = new ChocolateIcecream(icecream);
        System.out.println("Cost of Chocolate icecream : "+chocolateIcecream.cost());
    }
}
