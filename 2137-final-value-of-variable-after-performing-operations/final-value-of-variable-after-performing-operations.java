class Solution {
    public int finalValueAfterOperations(String[] operations) {
       int x =0;
       for(String oops  : operations){
        x += oops.charAt(1) == '+' ? 1 : -1;
       } 
       return x;
    }
}