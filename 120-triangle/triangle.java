class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 2; i >= 0; i--) {
            List<Integer> list = triangle.get(i);
            List<Integer> listNext = triangle.get(i + 1);
            for (int j = 0; j < list.size(); j++) {
                int curMin = Math.min(listNext.get(j), listNext.get(j + 1));
                list.set(j, list.get(j) + curMin);
            }
        }

        return triangle.get(0).get(0);
    }
}