package algorithms.sorting;

public class SelectionSort {
    void sort(int []arr)
    {
        for(int i=0;i<arr.length-1;i++) {
            int min_index = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }

            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;

            print(arr);

        }

    }

    void print(int arr[])
    {
        for (int i:arr) {
            System.out.print(i+" ");

        }
        System.out.print("\n");
    }

    public static void main(String []args)
    {
        int arr[] = {23,21,345,32,10,75};

        SelectionSort algo = new SelectionSort();
        algo.sort(arr);
//        algo.print(arr);
    }
}
