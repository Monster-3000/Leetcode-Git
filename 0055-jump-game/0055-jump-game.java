class Solution {

    public boolean canJump(int[] nums) {

        int n = nums.length;
        int farthest = 0;
        if(n==1){
            return true;
        }
        for (int i = 0; i < n - 1; i++) {

            if (i > farthest) {
                return false;
            }

            for (int j = 1; j <= nums[i]; j++) {

                if (farthest < i + j) {
                    farthest = i + j;
                }

                if (farthest >= n - 1) {
                    return true;
                }
            }
        }

        return false;
    }
}
