package algorithms.sorting;

public class BubbleSort {
    void sort(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++) {
                if (arr[j] < arr[i]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
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

        BubbleSort algo = new BubbleSort();
        algo.sort(arr);
        algo.print(arr);
    }
}
