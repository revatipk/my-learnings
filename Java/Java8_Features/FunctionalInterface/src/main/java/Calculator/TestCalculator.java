package Calculator;

public class TestCalculator {
    public static void main(String []args) {
        Calculator c = (a,b) -> {return a+b;};
        System.out.print(c.operation(3,4));
    }
}
