class Solution {
    public int lengthOfLongestSubstring(String s) {
       int count = 0;
       int len = s.length();
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<len;i++){
            HashSet<Character> map = new HashSet<>();
            for(int j=i;j<len;j++){
                if(map.contains(s.charAt(j))){
                    break;
                }
                map.add(s.charAt(j));
                int length = j - i + 1;
                count = Math.max(count,length);
            }
         
        }
        return count;

    }
}