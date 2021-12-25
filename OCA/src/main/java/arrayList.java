/*
import java.util.ArrayList;
import java.util.List;
class Patient{
    String name;
    public Patient(String name)
    {
        this.name = name;
    }
}
public class arrayList {
    public static void main(String[] args)
    {

        //
        ArrayList<Double> al = new ArrayList<>();
//        al.add(111);

        //
        int i = 0 ;
        int[] iA = {10, 20} ;
        iA[i] = i = 30 ;
        System.out.println(""+ iA[ 0 ] + " " + iA[ 1 ] + "  "+i) ;
        List colors = new ArrayList();
        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.remove(2);
        colors.add(3,"cyan");
        colors.add(null);
        colors.remove(null);
        System.out.print(colors);
*/
/*
        int i=10;
        int j=20;
        int k=j+=i/5;
        System.out.println(i+" "+j+" "+k);*//*


        ///
        int data[] = {2010,2013,2014,2015,2014};
        int key=2014;
        int count=0;
        for (int e:data)
        {
            if(e!=key)
            {
//                continue:
                count++;
            }
        }

        //
        List ps = new ArrayList();
//        ps.indexOf(1.0);
        Patient p2 = new Patient("Mike");
        ps.add(p2);

        int f= ps.indexOf(p2);
        if(f>=0) {
            System.out.println("Mike Found");
        }

        //
        int arr[][] = new int[2][4];
        arr[0]=new int[]{1,3,5,7};
        arr[1]=new int[]{1,3};
        for(int[] a:arr){
            for(int l:a){
                System.out.print(l+" ");
            }
            System.out.println();
        }
        //
        String[] elements = {"for","tea", "too"};
        String first = (elements.length>0)?elements[0]:null;
        System.out.println("first : "+first);


        //
        Object obj = new int[]{1, 2,3};
        int[] someArray=(int[])obj;
        for(int sa:someArray)
        {
            System.out.println("sa : "+sa);
        }


        int array[]=new int[-2];
        //
        ArrayList myList = new ArrayList();
        String[] myArray;
        try {
            while (true) {
                myList.add("My String");

            }
        }  catch(RuntimeException re)
            {

            }
        catch(Exception ex){

        }
        System.out.print("Ready to Use");




    }

}
*/
