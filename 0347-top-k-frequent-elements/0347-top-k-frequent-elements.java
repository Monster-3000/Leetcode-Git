class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>( (a, b) -> map.get(b) - map.get(a));
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int j:map.keySet()){
            pq.offer(j);
        }
        int[] n = new int[k];
        int count = 0;
        while(k>0){
            n[count]=pq.poll();
            count++;
            k--;
        }
        
        return n;
    }
}