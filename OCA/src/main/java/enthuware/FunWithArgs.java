package enthuware;

public class FunWithArgs {
   /* public static void main(String[][] args) {
        System.out.println(args[0][1]);
    }
    public static void main(String[] args) {
        FunWithArgs fwa = new FunWithArgs();
        String[][] newargs = {args};
        fwa.main(newargs);
    }*/
   public static void main(String[] args){
       int i = 4;
       int ia[][][] = new int[i][i = 3][i];
       System.out.println( ia.length + ", " + ia[0].length+", "+ ia[0][0].length);

       int k = 9, s = 5;
       switch(k){
           default :
               if( k == 10) { s = s*2; }
               else{
                   s = s+4;
                   break;
               }
           case 7 : s = s+3;
       }
       System.out.println(s);
   }
}