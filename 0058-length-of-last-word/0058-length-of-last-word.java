class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String[] words = s.split(" ");
        int len = words.length;
        int len1 = words[len-1].length();
        return len1;
    }
}