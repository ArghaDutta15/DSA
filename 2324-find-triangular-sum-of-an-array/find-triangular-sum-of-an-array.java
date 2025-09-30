class Solution {
    public int triangularSum(int[] nums) {
        int l = nums.length;
        do{
        if(l == 1){
            return nums[0];
        }
        else{
            for(int i=0;i<l-1;i++){
                nums[i] = (nums[i]+nums[i+1]) % 10;
            }
            l--;
        }
        }while(l>1);

        return nums[0];
    }
}