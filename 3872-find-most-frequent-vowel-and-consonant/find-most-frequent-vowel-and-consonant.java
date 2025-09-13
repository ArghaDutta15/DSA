class Solution {
    public int maxFreqSum(String s) {
        int [] frequency = new int[26];
        int maxVowel = 0, maxConsonant= 0;
        for(char c : s.toCharArray()){
            int i = c - 'a';
            frequency[i]++;
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                maxVowel = Math.max(maxVowel, frequency[i]);

            } else 
            maxConsonant = Math.max(maxConsonant, frequency[i]);
        } 
        return maxVowel + maxConsonant;
    }
}