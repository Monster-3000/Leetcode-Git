class Solution {
    public int minMoves(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        int median = nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
            count+=Math.abs(median-nums[i]);
        }
        return count;
    }
}