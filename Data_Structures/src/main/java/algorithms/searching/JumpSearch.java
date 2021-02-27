package algorithms.searching;

public class JumpSearch {

    public  int jumpSearch(int []arr, int x)
    {
        int length = arr.length;
        int step = (int)Math.floor(Math.sqrt(length));
        int prev = 0;
        while(arr[Math.min(step,length)-1]<x)
        {
            prev = step;
            step+=(int)Math.floor(Math.sqrt(length));

            if (prev>=length)
                return -1;

        }
        while (arr[prev]<x)
        {
            prev++;
            if(prev == Math.min(step, length))
            {
                return -1;
            }
        }
        if(arr[prev]==x)
        {
            return prev;
        }
        return -1;

    }
    public  static void main(String []args)
    {

        int arr[]={12,23,34,45,56,78,89};

        JumpSearch js = new JumpSearch();
        int retVal = js.jumpSearch(arr,23);
        if(retVal==-1)
            System.out.println("Value not found");
        else
            System.out.print("Value found");

    }
}
