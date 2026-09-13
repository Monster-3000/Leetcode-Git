class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(x,y) -> Integer.compare(x[0],y[0]));
        ArrayList<int[]> a = new ArrayList<>();
        int n = intervals.length;
        int low = intervals[0][0];
        int high = intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]<=high){
                high = Math.max(high,intervals[i][1]);
            }
            else{
                a.add(new int[]{low,high});
                low = intervals[i][0];
                high = intervals[i][1];
            }
        }
        a.add(new int[]{low,high});
        return a.toArray(new int[a.size()][]);
    }
}