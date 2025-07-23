class Solution {
  public:
    int subarraySum(vector<int>& A) {
        int n = A.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int start = i + 1;
            int end = n - i;
            int contri = start * end;
            sum += A[i] * contri;
        }
        return sum;
    }
};