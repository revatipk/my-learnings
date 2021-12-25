package enthuware;

public class IFExamples {

    public static void main(String []args)
    {
        boolean flag=false;
        if (flag)   //1
            if (flag)   //2
                if (flag)   //3
                    System.out.println("False True");
                else        //4
                    System.out.println("True False");
            else        //5
                System.out.println("True True");
        else        //6
            System.out.println("False False");

        //////
       /* boolean b1 = false;
        boolean b2 = false;
        if (b2 != b1 = !b2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }*/
    }

}
