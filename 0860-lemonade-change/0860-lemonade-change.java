class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count5 = 0;
        int count10 = 0;
        int sum = 0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                count5++;
                sum+=5;
            }
            if(bills[i]==10){
                if(count5>0){
                    count10++;
                    count5--;
                    sum+=5;
                }
                else{
                    return false;
                }
            }
            if(bills[i]==20){
                if(count10>0 && count5>0){
                    count10--;
                    count5--;
                    sum+=5;
                }
                else if(count10==0 && count5>2){
                    sum+=5;
                    count5-=3;
                }
                else{
                    return false;
                }
            }
        }
        // System.out.println(sum);
        if(sum==bills.length*5){
            return true;
        }
        return false;
    }
}