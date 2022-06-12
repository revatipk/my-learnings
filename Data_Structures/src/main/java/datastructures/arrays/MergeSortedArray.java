package datastructures.arrays;

public class MergeSortedArray {
    public static void main(String []args)
    {
        Integer array1 []=  {23,45,56,67};
        Integer array2[] = {12,58,89};
        int index1 =1;
        int index2=1;
        int item1 = array1[0];
        int item2 = array2[0];
        Integer finalArr[]=new Integer[]{};
        while(index1<=array1.length || index2<=array2.length){
            if(item1<item2 && array2.length<0){
                System.out.println(item1);
                if(index1<array1.length)
                item1 = array1[index1++];
            }
            else
            {
                System.out.println(item2);
                item2 = array2[index2++];
            }

        }
    }
}
