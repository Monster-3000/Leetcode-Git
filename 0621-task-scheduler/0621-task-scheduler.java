class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));
        pq.addAll(map.values());
        while(!pq.isEmpty()){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0;i<=n;i++){
                if(!pq.isEmpty()){
                    int freq = pq.poll();
                    if(freq>1){
                        temp.add(freq-1);
                    }
                }
                count++;
                if(temp.isEmpty() && pq.isEmpty()){
                    break;
                }
            } 
            for(int freq:temp){
                pq.add(freq);
            }
        }
        return count;
    }
}