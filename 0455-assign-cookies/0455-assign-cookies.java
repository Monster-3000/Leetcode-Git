class Solution {
    public int findContentChildren(int[] g, int[] s) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        for(int i:g){
            pq1.add(i);
        }
        for(int j:s){
            pq2.add(j);
        }
        int count = 0;
        while(pq1.isEmpty()==false && pq2.isEmpty()==false){
            if(pq2.peek()>=pq1.peek() ){
                pq1.poll();
                pq2.poll();
                count++;
            }
            else{
                pq2.poll();
            }
        }
        return count;
    }
}