class Solution {
    public int subsetXORSum(int[] nums) {
        return findXor(nums, 0, 0);
    }
    public int findXor(int nums[], int i, int xor){
        if(i == nums.length){
            return xor;            
        }

        int pic = findXor(nums, i+1, xor ^ nums[i]);
        int npic = findXor(nums, i+1, xor);

        return pic + npic;
    }
}