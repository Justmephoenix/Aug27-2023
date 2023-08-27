def checkIfSorted(arr,n):
    if n==0 or n==1:
        return True
    
    return arr[n-2]<arr[n-1] and checkIfSorted(arr,n-1)

arr=list(map(int,input().split()))
print("Is sorted?",checkIfSorted(arr,len(arr)))