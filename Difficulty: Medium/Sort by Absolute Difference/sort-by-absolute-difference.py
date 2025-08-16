class Solution:
    def rearrange(self, arr, x):
        # code here
        
        arranged = []
        
        for i in range(len(arr)):
            arranged.append((abs(arr[i]-x),i,arr[i]))
        
        arranged.sort()
        
        i = 0
        
        for diff,index,number in arranged:
            arr[i] = number
            i+=1
        
        return arr