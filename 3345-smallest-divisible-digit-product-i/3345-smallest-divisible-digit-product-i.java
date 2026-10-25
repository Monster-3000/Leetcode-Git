class Solution {
    public int smallestNumber(int n, int t) {
        int ans = -1;
        while(ans==-1){
            int  p = n;
            int sum = 1;
            while(p>0){
                sum=sum*(p%10);
                p=p/10;
            }
            if(sum%t==0){
                return n;
            }
            n++;
        }
        return ans;
    }
}