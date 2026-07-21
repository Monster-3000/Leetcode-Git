class Solution {
    // public int longestOnes(int[] nums, int k) {
    //     int max = 0;
    //     for(int i=0;i<nums.length;i++){
    //         int flips = k;
    //         int j = i;
    //         while(j<nums.length){
    //             if(nums[j]==0){
    //                 if(flips==0){
    //                     break;
    //                 }
    //                 flips--;
    //             }
    //             j++;
    //         }
    //         max = Math.max(max,j-i);
    //     }
    //     return max;
    // }
    public int longestOnes(int[] nums,int k){
        int zero = 0;
        int max = 0;
        int left=0;
        for(int right = 0;right<nums.length;right++){
            if(nums[right]==0){
                zero++;
            }
            while(zero>k){
                if(nums[left]==0){
                    zero--;
                }
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
        
    }
}