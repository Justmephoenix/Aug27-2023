class LinearSearch:
    def linearSearch(self,arr,i,n,tar):
        if i>=n:
            return -1
        
        if arr[i]==tar:
            return i
        else:
            return self.linearSearch(arr,i+1,n,tar)
        
if __name__=="__main__":
    n=int(input("Enter the number of elements in array : "))
    arr=list(map(int,input().split()))[:n]
    tar=int(input())
    obj=LinearSearch()
    print(f"{tar} is present at index {obj.linearSearch(arr,0,len(arr),tar)}")