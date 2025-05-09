public class TestCustomFunctionalInterface {
    public static void main(String []args) {
        CustomFunctionalInterface i = ()->{System.out.print("Custom Functional interface");};
        i.test();
    }
}
