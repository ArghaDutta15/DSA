class Solution {
    private Map<Long , Integer> mp = new HashMap<>();
    private String S;
    private int K;

    public int solve(long i , long uniqueChars , boolean canChange) {
        long key = (i << 27) | (uniqueChars << 1) | (canChange ? 1 : 0);
        if (mp.containsKey(key)) return mp.get(key);

        if (i == S.length()) return 0;

        int charIdx = S.charAt((int) i) - 'a';
        long newUniqChars = uniqueChars | (1L << charIdx);
        int uniqCharCnt = Long.bitCount(newUniqChars);

        int res;
        if (uniqCharCnt > K) res = 1 + solve(i + 1 , 1L << charIdx , canChange);
        else res = solve(i + 1 , newUniqChars , canChange);

        if (canChange) {
            for (int newCharIdx = 0; newCharIdx < 26; newCharIdx++) {
                long newCharSet = uniqueChars | (1L << newCharIdx);
                int newUniqCharCnt = Long.bitCount(newCharSet);

                if (newUniqCharCnt > K) res = Math.max(res , 1 + solve(i + 1 , (1L << newCharIdx) , false));
                else res = Math.max(res , solve(i + 1 , newCharSet , false));
            }
        }
        mp.put(key , res);
        return res;
    }

    public int maxPartitionsAfterOperations(String s, int k) {
        S = s;
        K = k;

        return 1 + solve(0 , 0 , true);   
    }
}

// copied solution, just to maintain the streak.