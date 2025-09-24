class Solution {
    public String convertDateToBinary(String date) {
        String[] str = date.split("-");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            int num = Integer.parseInt(str[i]);
            String res = decimalToBinary(num);  // manual conversion
            sb.append(res);

            if (i != str.length - 1) {
                sb.append('-');
            }
        }
        return sb.toString();
    }

    // Manual formula-based conversion
    private String decimalToBinary(int num) {
        if (num == 0) return "0";
        
        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            int remainder = num % 2;   // take remainder
            binary.append(remainder);  // append remainder
            num /= 2;                  // divide by 2
        }
        return binary.reverse().toString(); // reverse to get correct order
    }
}
