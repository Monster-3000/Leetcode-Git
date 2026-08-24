class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        int s = 0;
        int t = 0;
        while(pq.size()>1){
            s = pq.poll();
            t = pq.poll();
            if(s!=t){
                pq.add((s-t));
            }
        }
        if(pq.size()!=0){
            return pq.peek();
        }
        else{
            return 0;
        }
        }
    }
