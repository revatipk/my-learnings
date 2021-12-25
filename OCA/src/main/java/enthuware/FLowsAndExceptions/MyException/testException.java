package enthuware.FLowsAndExceptions.MyException;


class MyException extends Exception {}
public class testException {
    /*    public static void main(String[] args){
            testException tc = new testException();
            try{
                tc.m1();
            }
            catch (MyException e){
                tc.m1();
            }
            finally{
                tc.m2();
            }
        }
        public void m1() throws MyException{
            throw new MyException();
        }
        public void m2() throws RuntimeException{
            throw new NullPointerException();
        }*/
    /*public static void main(String args[]){
        try{
            RuntimeException re = null;
            throw re;
        }
        catch(Exception e){
            System.out.println(e);
        }
    }*/
    public static void main(String[] args){
        /*int x = 1;
        int y = 0;
        if( x/y ) System.out.println("Good");
        else  System.out.println("Bad");*/
        Float f = null;
        try{
            f = Float.valueOf("12.3");
            String s = f.toString();
            int i = Integer.parseInt(s);
            System.out.println(""+i);
        }
        catch(Exception e){
            System.out.println("trouble : "+f);
        }
    }
    }

