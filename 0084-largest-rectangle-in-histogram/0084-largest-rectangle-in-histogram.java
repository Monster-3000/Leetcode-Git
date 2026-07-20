class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        for(int i=0;i<=heights.length;i++){
            while(s.empty()==false && (i==heights.length || heights[s.peek()] >= heights[i])){
                int height = heights[s.pop()];
                int right = i;
                int left ; 

                if(s.isEmpty()){
                    left = -1;
                }
                else{
                    left = s.peek();
                }
                int width = right - left - 1;
                int area = height * width;
                maxArea = Math.max(maxArea,area);
            }
            s.push(i);
        }
        return maxArea;
    }
}