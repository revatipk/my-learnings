package algorithms.searching;

import datastructures.binarytree.BinaryTree;

public class BinarySearch {
    public int search(int arr[], int l, int r,int x)
    {
        if(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]>x)
             return search(arr,l,mid-1,x);
            return search(arr,mid+1,r,x);
        }
        return -1;

    }
   /* public int breadthFristSearch(int arr[])
    {
        if(arr.length==0)
        {
            return -1;
        }
    }*/

    public  static void main(String []args)
    {

        int arr[]={12,23,34,45,56,78,89};

        BinarySearch bs = new BinarySearch();
        int retVal = bs.search(arr,0,arr.length-1,87);
        if(retVal==-1)
            System.out.println("Value not found");
        else
            System.out.print("Value found");
    }

}
