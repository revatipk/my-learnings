package enthuware.FLowsAndExceptions;

abstract class abstractClassWithMain{
    abstract void calculate();
    public static void main(String[] args){
        System.out.println("calculating");
        abstractClassWithMain x = null;
        x.calculate();
    }
}