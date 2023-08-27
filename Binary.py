class BinSearch:
    def binarySearch(self,arr,begin,end,tar):
        if begin>=end:
            return -1
        mid = (begin+end)//2
        if arr[mid]==tar:
            return mid
        elif arr[mid]<tar:
            return self.binarySearch(arr,mid+1,end,tar)
        else:
            return self.binarySearch(arr,begin,mid-1,tar)
            
        
        
        
if __name__=="__main__":
    obj=BinSearch()
    n=int(input())
    arr=list(map(int,input().split()))[:n]
    tar=int(input())
    print(f"{tar} is present at index  {obj.binarySearch(arr,0,len(arr),tar)} ")
    