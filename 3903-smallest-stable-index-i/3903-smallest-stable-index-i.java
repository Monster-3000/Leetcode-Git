class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int stable = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){

            int maxleft = nums[0];
            int minright = nums[i];

            for(int j=0;j<=i;j++){
                if(nums[j]>maxleft){
                    maxleft = nums[j];
                }
            }
            for(int j=i;j<nums.length;j++){
                if(nums[j]<minright){
                    minright = nums[j];
                }
            }
            if((maxleft-minright)<=k){
                stable = i;
                break;
                
            }
        }
        return (stable==Integer.MAX_VALUE?-1:stable);
    }
}