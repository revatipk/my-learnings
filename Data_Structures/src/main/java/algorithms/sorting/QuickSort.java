package algorithms.sorting;

public class QuickSort {

    public void quicksort(int arr[], int low, int high)
    {
        if(low<high) {
            int pivot = partition(arr, low, high);
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }
    }
    public int partition(int []arr, int low, int high)
    {
        int pivot = arr[high];
        int i=low-1;
        for(int j=low;j<=high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    public void swap(int arr[], int x, int y)
    {
        int tmp = arr[x];
        arr[x]=arr[y];
        arr[y]=tmp;
    }
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

       QuickSort ob = new QuickSort();
        ob.quicksort(arr,0,arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}
