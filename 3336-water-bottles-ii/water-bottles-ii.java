class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        
        return helper(numBottles, numBottles, numExchange);

    }

    private int helper(int empBottle, int bottleDrunk, int exRate){

        if(empBottle < exRate){
            return bottleDrunk;
        }
        return helper(empBottle - exRate + 1, bottleDrunk + 1,
         exRate + 1);
    }
}