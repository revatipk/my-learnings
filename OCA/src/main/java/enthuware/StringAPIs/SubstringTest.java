package enthuware.StringAPIs;

public class SubstringTest{
    public static void main(String args[]){

        //1
        String String = "string isa string";

        System.out.println(String.substring(3, 6));

        //2
        StringBuilder sb = new StringBuilder("12345678");
        sb.setLength(5);
        sb.setLength(10);
//sb.app
        System.out.println(sb.length());
        System.out.println(sb);

        //3
        System.out.println(" hello world".trim());
        System.out.println(("hello" + new String("world")));
        System.out.println(new StringBuilder("world").insert(0, "hello ").toString());
        System.out.println("hello".concat(" world"));

    }
}