class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            int flips = k;
            int j = i;
            while(j<nums.length){
                if(nums[j]==0){
                    if(flips==0){
                        break;
                    }
                    flips--;
                }
                j++;
            }
            max = Math.max(max,j-i);
        }
        return max;
    }
}