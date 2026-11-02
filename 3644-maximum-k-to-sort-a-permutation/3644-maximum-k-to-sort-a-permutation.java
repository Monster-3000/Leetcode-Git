class Solution {
    public int sortPermutation(int[] nums) {
        int ans = -1;
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){//unsorted
                ans = ans & nums[i];
            }
        }
    return Math.max(0,ans);
    }
}