package algorithms.sorting;

public class HeapSort {

    public void sort(int []arr)
    {
        int length = arr.length;
        for(int i= length/2-1;i>=0;i--)
        {
            heapify(arr,length,i);

        }
     for(int i=length-1;i>0;i--)
     {
         int tmp = arr[0];
         arr[0] =arr[i];
         arr[i] = tmp;
         heapify(arr,i,0);
     }
    }
    //n-size
    //i - rooted node
    void heapify(int []arr, int n, int i)
    {
        printArray(arr);
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        //if left is greater than root
        if(left < n && arr[left] > arr[largest])
            largest = left;
        if(right < n && arr[right] > arr[largest])
            largest = right;

        //if largest is not root
        if(largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr,n,largest);
        }
       // printArray(arr);


    }
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = { 120, 311, 413, 50, 436, 127 };

        System.out.println("Given Array");
        printArray(arr);

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}
