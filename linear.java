import java.util.*;
class LinearSearch{
    static int linearSeacrh(int arr[],int i,int n,int tar)
    {
        if(i>=n)
            return -1;
        
        if (arr[i]==tar)
            return i;
        else{
            return linearSeacrh(arr,i+1,n,tar);
        }
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
        System.out.println(tar+" is prsent at index "+LinearSearch.linearSeacrh(arr,0,arr.length,tar));
    }
}