/*
package Lambdas;


public class ThisReferenceExamples {
    public void doProcess(int i, Process p){
        p.process(i);
    }

    public void execute(){
        doProcess(10, i -> {
            System.out.println(i);
            System.out.print(this);
        });
    }
    public static void main(String [] args){
        ThisReferenceExamples thisReferenceExamples = new ThisReferenceExamples();
       */
/* thisReferenceExamples.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i);
                System.out.print(this);
            }
        });*//*

        thisReferenceExamples.doProcess(10, i -> {
            System.out.println(i);
//            System.out.print(this);
        });
        thisReferenceExamples.execute();
    }
}
interface Process{
    public void process(int i);
}*/
