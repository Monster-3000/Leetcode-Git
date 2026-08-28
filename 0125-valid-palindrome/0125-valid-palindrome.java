class Solution {
    public boolean isPalindrome(String s) {
        String m = s.strip().toLowerCase();
        m = m.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder k = new StringBuilder(m); 
        k=k.reverse();
        String h = k.toString().toLowerCase();
        if(h.equals(m)){
            return true;
        }
        return false;
    }
}