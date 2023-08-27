import java.util.*;
class BinarySearch{
    static int binarySearch(int[] arr,int begin,int end,int tar)
    {
        if (begin>=end)
            return -1;
        int mid=(begin+end)/2;
        if (arr[mid]==tar)
            return mid;
        else if (arr[mid]<tar)
            return binarySearch(arr, mid+1, end, tar);
        else 
            return binarySearch(arr, begin,mid-1,tar);
    
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int [] arr;
        arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        System.out.println(tar+" is prsent at index "+BinarySearch.binarySearch(arr,0,arr.length,tar));
    }
}
