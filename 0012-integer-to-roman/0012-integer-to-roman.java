class Solution {
    public String intToRoman(int num) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"I");
        map.put(5,"V");
        map.put(10,"X");
        map.put(50,"L");
        map.put(100,"C");
        map.put(500,"D");
        map.put(1000,"M");
        String s = "";
        ArrayList<Integer> a = new ArrayList<>();
        int pow = 1;
        while(num>0){
            a.add((num%10)*pow);
            num=num/10;
            pow=pow*10;
        }
        int n = a.size();
        for(int i=n-1;i>=0;i--){
            int x = a.get(i);
            if(x==4) s+= "IV";
            else if(x==9) s+= "IX";
            else if(x==40) s+= "XL";
            else if(x==90) s+= "XC";
            else if(x==400) s+= "CD";
            else if(x==900) s+= "CM";

            else{
                while(x>=1000){
                    s+="M";
                    x-=1000;
                }
                while(x>=500){
                    s+="D";
                    x-=500;
                }
                while(x>=100){
                    s+="C";
                    x-=100;
                }
                while(x>=50){
                    s+="L";
                    x-=50;
                }
                while(x>=10){
                    s+="X";
                    x-=10;
                }
                while(x>=5){
                    s+="V";
                    x-=5;
                }
                while(x>=1){
                    s+="I";
                    x-=1;
                }
            }
        }
        return s;
    }
}