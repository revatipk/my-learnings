package ExceptionHandling;

public class ExceptionHandling {
    static int a[];
    static{a[0]=2;}

    public static void main(String args[])
    {
       /* try{
            args = null;
            args[0] = "test";
            System.out.print((args[0]));
        }catch(Exception ex){
            System.out.print("Exception");
        }catch (NullPointerException np)
        {

        }*/
       try
       {
           test();
       }
       catch(RuntimeException ex){
           System.out.print("runtime");
       }
       System.out.print("end");
    }
    static void test() throws RuntimeException{
        try{
            System.out.print("test");
            throw new RuntimeException();
        }
        catch (Exception ex){
            System.out.print("exception");
        }
    }
}
