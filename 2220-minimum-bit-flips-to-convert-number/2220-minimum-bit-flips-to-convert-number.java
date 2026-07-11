class Solution {
    public int minBitFlips(int start, int goal) {
        int s = start^goal;
        String binary = Integer.toBinaryString(s);
        int count =0;
        for(char ch:binary.toCharArray()){
            if(ch=='1'){
                count++;
            }
        }
        return count;
    }
}