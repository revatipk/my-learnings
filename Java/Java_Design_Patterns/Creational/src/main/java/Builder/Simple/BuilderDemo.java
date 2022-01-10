public class BuilderDemo {
    public static void main(String[] args) {
        User aish = new User.UserBuilder("Aish","Singh").setAge(28).setPhoneNumber("35436").build();
        System.out.println(aish.toString());
    }
}
