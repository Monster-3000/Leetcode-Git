class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int n:score){
            pq.add(n);
        } 
        String[] s = new String[score.length];
        int k = 1;
        while(pq.size()>0){
            int j=pq.poll();
            for(int i=0;i<score.length;i++){
                if(j==score[i]){
                    if(k==1){
                        s[i] = "Gold Medal";
                    }
                    else if(k==2){
                        s[i] = "Silver Medal";
                    }
                    else if(k==3){
                        s[i] = "Bronze Medal";
                    }
                    else{
                        s[i] = String.valueOf(k);
                    }
                    k++;
                }
            }
        }
        return s;
    }
}