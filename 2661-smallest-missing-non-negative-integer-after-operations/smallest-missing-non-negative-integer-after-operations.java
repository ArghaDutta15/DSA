class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int count[] = new int[value];

        for (int num:nums){
            int rem = ((num%value)+value)%value;
            count[rem]++;

        }
        int ans = 0;
        while(true){
            int rem = ans%value;
            if(count[rem]==0) return ans;
            count [rem]--;
            ans++;
        }
    }
}