package enthuware.Inheritance;

public class Nobs {
    public void m(int a){
        System.out.println("In int ");
    }
    public void m(char c){
        System.out.println("In char ");
    }
    public static void main(String[] args) {
        Nobs n = new Nobs();
        int a = 'a';
        char c = 6;
        n.m(a);
        n.m(c);
    }
}