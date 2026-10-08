class Solution {
    public String compress(String n) {
        String m = "";
        int count = 1;

        for(int i = 1; i <= n.length(); i++) {
            if(i < n.length() && n.charAt(i - 1) == n.charAt(i)) {
                count++;
            }
            else {
                m += String.valueOf(count);
                m += n.charAt(i - 1);
                count = 1;
            }
        }

        return m;
    }

    public String countAndSay(int n) {
        String s = "1";

        for(int i = 2; i <= n; i++) {
            s = compress(s);
        }

        return s;
    }
}