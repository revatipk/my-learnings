public class wrapperClasses {
    void go()
    {
        short s=7;
        System.out.print(doX(s,s)+" ");
        System.out.print(doX(7,7)+" ");
    }
    public static void main(String []args)
    {
        boolean a = new Boolean(Boolean.valueOf("TRUE"));
        boolean b= new Boolean(null);

        System.out.println(a+" "+b);
        new wrapperClasses().go();


    }
    int doX(Long x,Long y){ return 1;}
    int doX(long... x){ return 2;}
    int doX(Integer x,Integer y){ return 3;}
    int doX(Number x,Number y){ return 4;}
}
