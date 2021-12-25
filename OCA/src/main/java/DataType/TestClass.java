package DataType;

public class TestClass{
    String s = this.toString();
    float f = 4;
    float f1 = 0x0123;
    float f2 = -1;


    public static int getSwitch(String str){
        return (int) Math.round( Double.parseDouble(str.substring(1, str.length()-1)) );
    }
    public static void main(String args []){
        switch(getSwitch("--0.5")){
            case 0 : System.out.print("Hello ");
            case 1 : System.out.print("World"); break;
            default : System.out.print("Good Bye");
        }
    }
}