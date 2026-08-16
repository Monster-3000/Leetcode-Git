class Solution {
    public int[] plusOne(int[] digits) {
        int sum = 0;
        for(int i=0;i<digits.length;i++){
            sum+=digits[i];
        }
        if(digits[digits.length-1]<9){
            digits[digits.length-1]++;
        }
        else if(sum<(digits.length*9)){
            int k = digits.length-1;
            while(k>0 && digits[k]==9){
                digits[k] = 0;
                k--;
            }
            
            digits[k] = digits[k]+1;
        }
        else{
            int[] n = new int[digits.length+1];
            n[0]=1;
            return n;

        }
        return digits;
    }
}