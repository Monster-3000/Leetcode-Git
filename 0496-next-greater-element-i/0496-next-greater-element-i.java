class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int u = 0;
        for(int i=0;i<nums1.length;i++){
            boolean found = false;
            for(int j=0;j<nums2.length;j++){
                // int x = j;
                if(nums1[i]==nums2[j]){
                    for(int m = j+1 ; m < nums2.length ; m++){
                        if(nums2[m] > nums2[j]){
                            ans[i] = nums2[m];
                            u++;
                            found = true;
                            break;
                        }
                    }
                        
                    if(found==false){
                        ans[i] = -1;  
                    }
                    break;
                       
                }
            }
        }
        return ans;
    }
}