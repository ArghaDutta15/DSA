class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;

        while(numBottles>=numExchange){
            int a= numBottles/numExchange;
            ans += a;
            numBottles = (numBottles%numExchange) + a;


        }

        return ans;
    }
}