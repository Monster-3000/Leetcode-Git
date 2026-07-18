class Solution {
    public String removeKdigits(String num, int k) {

        StringBuilder sb = new StringBuilder();

        for (char ch : num.toCharArray()) {

            while (k > 0 &&
                   sb.length() > 0 &&
                   sb.charAt(sb.length() - 1) > ch) {

                sb.deleteCharAt(sb.length() - 1);
                k--;
            }

            sb.append(ch);
        }

        while (k > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        int i = 0;
        while (i < sb.length() && sb.charAt(i) == '0')
            i++;

        String ans = sb.substring(i);

        if (ans.length() == 0)
            return "0";

        return ans;
    }
}