class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        
        StringBuilder res = new StringBuilder();

        // Handle sign
        if ((long) numerator * (long) denominator < 0) {
            res.append("-");
        }

        long absNum = Math.abs((long) numerator);
        long absDen = Math.abs((long) denominator);

        // Integer part
        long d = absNum / absDen;
        res.append(d);

        long rem = absNum % absDen;
        if (rem == 0) return res.toString();
        res.append(".");

        Map<Long, Integer> map = new HashMap<>();

        while (rem != 0) {
            if (map.containsKey(rem)) {
                res.insert(map.get(rem), "(");
                res.append(")");
                return res.toString();
            }

            map.put(rem, res.length());
            rem *= 10;
            d = rem / absDen;          
            res.append(d);
            rem %= absDen;            
        }

        return res.toString();
    }
}