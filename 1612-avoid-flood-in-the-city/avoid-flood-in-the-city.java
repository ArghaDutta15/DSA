class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        TreeSet<Integer> dryDays = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            int rain = rains[i];
            if (rain == 0) {
                dryDays.add(i);
                ans[i] = 1; 
            } else {
                ans[i] = -1;
                if (map.containsKey(rain)) {
                    Integer dryDay = dryDays.higher(map.get(rain));
                    if (dryDay == null) return new int[0]; 
                    ans[dryDay] = rain;
                    dryDays.remove(dryDay);
                }
                map.put(rain, i-1);
            }
        }

        return ans;
    }
}