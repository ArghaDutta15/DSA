class Solution {
    public int differenceOfSums(int n, int m) {
        int a=n/m;
        int b=0;
        for(int i=1;i<=a;i++)
            b+=(i*m);
        return (n*(n+1))/2 - (2*b);
    }
}