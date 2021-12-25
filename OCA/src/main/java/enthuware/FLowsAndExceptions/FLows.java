package enthuware.FLowsAndExceptions;

public class FLows {
    public static void main(String args[]){

/*        while(int k = 5; k<7){
            System.out.println(k++);
        }*/
        int o=10;
        for ( ; o>0 ; o--) { }
        //
        for (int i=0, j=10; i<j; i++, --j) {;}
        //
        int i = 0;
        for (i=1 ;  i<5  ; i++) continue;  //(1)
        for (i=0 ;       ; i++) break;       //(2)
        for (    ; i<5?false:true ;    );     //(3)
        //
        /*for(int i = 0; i< args.length; i++){
            System.out.print("  "+args[i]);
        }*/
        //
       /* boolean b = false;
        int i = 1;
        do{
            i++ ;
        } while (b = !b);
        System.out.println( i );*/

        //2
        Float f = null;
        try{
            f = Float.valueOf("12.3");
            String s = f.toString();
            int j = Integer.parseInt(s);
            System.out.println(""+j);
        }
        catch(Exception e){
            System.out.println("trouble : "+f);
        }

        int sum = 0;
        for (int k = 0, j = 10; sum > 20; ++i, --j)      // 1
        {
            sum = sum+ k + j;
        }
        System.out.println("Sum = " + sum);

        //
        int m = 0, j = 5;
        lab1 : for( ; ; m++){
            for( ; ; --j)  if( m >j ) break lab1;
        }
        System.out.println(" m = "+m+", j = "+j);

        //

    }
    }//2

    //




