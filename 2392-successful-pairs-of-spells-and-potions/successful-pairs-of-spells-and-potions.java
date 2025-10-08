class Solution {
    int bs(long curr,int[] arr,long tar){
        int index = -1;
        int n = arr.length - 1;
        int s = 0 , e = n;
        while(s<=e){
            int mid = (s+e) >> 1;
            if((arr[mid] * curr) >= tar){
                index = mid;
                e = mid - 1; 
            }
            else s = mid + 1;
        }
        if(index == -1) return 0;
        return n - index + 1;
    }
    public int[] successfulPairs(int[] arr1, int[] arr2, long tar) {
        int n = arr1.length;
        int[] res = new int[n];
        Arrays.sort(arr2);
        for(int i=0;i<n;i++) res[i] = bs((long)(arr1[i]),arr2,tar);
        return res;
    }
}