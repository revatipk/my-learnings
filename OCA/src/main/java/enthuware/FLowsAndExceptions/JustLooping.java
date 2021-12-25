package enthuware.FLowsAndExceptions;

public class JustLooping {
    private int j;
    int a;
//    static int a;

    public int A = 1; //1
    int B = 1;          //2
    static int C = 1;  //3
    final int D = 1; 	 //4
    public static int E = 1; //5
    public final int F = 1;  //6
    static final int G = 1;    //7
    public static final int H = 1; //8
    void showJ(){
        while(j<=a){
            for(int j=1; j <= 5;){
//                System.out.print(j+" ");
                j++;
            }
            j++;
        }
    }
    public static void main(String[] args) {
        new JustLooping().showJ();
        int i;
        int j;
        for (i = 0, j = 0; j < i; ++j, i++){
            System.out.println(i + " " + j);
        }
        System.out.println(i + " " + j);
    }
}