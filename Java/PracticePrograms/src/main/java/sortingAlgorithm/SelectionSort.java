package sortingAlgorithm;

public class SelectionSort {
        public void sort(int arr[])
        {
            int min=0;
            for(int i=0;i<arr.length;i++)
            {
                min = i;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]<arr[min])
                    {
                        min = j;
                    }
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
            }
            print(arr);
        }
        public void print(int arr[])
        {
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }

        public static void main(String ags[])
        {
            SelectionSort selectionSort = new SelectionSort();
            selectionSort.sort(new int[]{23,21,4,56,1,87,45});
        }
}
