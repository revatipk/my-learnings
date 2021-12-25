package enthuware;

public class PracticeTEst2 {
//    public static void main(String[] args)  {     calculate(2);    }

    public static void calculate(int x) {
        String val;
        switch (x) {
            case 2:
            default:
                val = "def";
        }
        System.out.println(val);
       /* int[] arr = { 1, 2, 3, 4, 5, 6 };
        int counter = 0;
        for (int value : arr) {
            if (counter >= 5) {
                break;
            } else {
                continue;
            }
            if (value > 4) {
                arr[counter] = value + 1;
            }
            counter++;
        }
        System.out.println(arr[counter]);*/

       /* int j = (i*30 - 2)/100;

        POINT1 : for(;j<10; j++){
            boolean flag  = false;
            while(!flag){
                if(Math.random()>0.5) break POINT1;
            }
        }
        while(j>0){
            System.out.println(j--);
            if(j == 4) break POINT1;
        }

    */
    }


        public static Integer wiggler (Integer x){
            Integer y = x + 10;
            x++;
            System.out.println(x);
            return y;
        }

        public static void main (String[]args){
            System.out.println("12345".charAt(6));
            Integer dataWrapper = new Integer(5);
            Integer value = wiggler(dataWrapper);
            System.out.println(dataWrapper + value);

            Integer i = new Integer(1) ;
            Long m = new Long(1);
            if( i.equals(m)) System.out.println("equal");   // 1
            else System.out.println("not equal");
            new Boolean("no");
            if(new Boolean("true") == Boolean.TRUE){

            }
        }

//    }

}
