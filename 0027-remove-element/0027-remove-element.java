class Solution {
    public int removeElement(int[] nums, int val) {
        int[] ans = new int[nums.length];
        int j=0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                ans[j] = nums[i];
                j++;
                count++;
            }
        }
        for(int i=0;i<count;i++){
            nums[i]=ans[i];
        }
        return count;
    }
}