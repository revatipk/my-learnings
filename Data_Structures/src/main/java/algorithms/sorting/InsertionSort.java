package algorithms.sorting;

public class InsertionSort {
    void sort(int []arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int key = arr[i];
            int j=i-1;
           while(j>=0 && arr[j]>key){
               arr[j+1] = arr[j];
               j=j-1;
           }
           arr[j+1]=key;
        }
    }
    void print(int arr[])
    {
        System.out.println("Sorted Array:");
        for (int i:arr) {
            System.out.println(i);

        }
    }

    public static void main(String []args)
    {
        int arr[] = {23,21,345,32,75};

        InsertionSort algo = new InsertionSort();
        algo.sort(arr);
        algo.print(arr);
    }
}
