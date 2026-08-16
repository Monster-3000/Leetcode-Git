class Solution {
    public int climbStairs(int n) {
        int ans = 0;
        int a = 0;
        int b = 1;
        int c = 0;
        int k = 0;
        while(k<n){
            c=a+b;
            a=b;
            b=c;
            k++;
        }
        

        
    return c;
    }
}