class Solution {
    public int smallestIndex(int[] nums) {
        int op = -1;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            int k = nums[i];
            while(k>0){
                sum=sum+k%10;
                k=k/10;
            }
            if(sum==i){
                op=i;
                break;
            }
        }
        return op;
    }
}