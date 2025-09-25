class Solution {
    public String defangIPaddr(String s) {
        StringBuilder b=new StringBuilder();
        System.out.println(b);
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)=='.')
                b.append("[.]");
            else
                b.append(s.charAt(i));

        }
        return b.toString();
    }
}