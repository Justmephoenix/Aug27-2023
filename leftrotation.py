def leftRotation(arr):
    arr.append(arr.pop(0))
    return arr

arr=list(map(int,input().split()))
print(leftRotation(arr))