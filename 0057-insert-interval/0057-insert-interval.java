class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int n = intervals.length;
        int[][] result = new int[n + 1][2];

        int index = 0;
        int i = 0;

        // 1. Add intervals completely before newInterval
        while (i < n && intervals[i][1] < newInterval[0]) {
            result[index++] = intervals[i];
            i++;
        }

        // 2. Merge overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        // Add merged interval
        result[index++] = newInterval;

        // 3. Add intervals completely after newInterval
        while (i < n) {
            result[index++] = intervals[i];
            i++;
        }

        // Remove unused rows
        return java.util.Arrays.copyOf(result, index);
    }
}