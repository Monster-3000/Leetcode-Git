class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int count = 0;
        int area = 0;
        int maxarea = 0;
        while(left<right){
            if(height[left]<height[right]){
                area = Math.min(height[right],height[left])*(right-left);
                left++;
            }
            else{
                area = Math.min(height[right],height[left])*(right-left);
                right--;
            }
            if(area>maxarea){
                maxarea = area;
            }
        }
        return maxarea;
    }
}