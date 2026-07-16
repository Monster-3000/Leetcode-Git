class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            boolean found = false;
            for(int j=i;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    ans[i]=nums[j];
                    found = true;
                    break;
                }
            }
            if(found!=true){
                for(int j=0;j<i;j++){
                    if(nums[i]<nums[j]){
                        ans[i] = nums[j];
                        found = true;
                        break;
                    }
                }
            }

            if(found==false){
                ans[i] = -1;
            }
        }
        return ans;
    }
}