


class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        set.add(k);

        boolean changed = true;

        // Find all suspicious methods
        while (changed) {
            changed = false;

            for (int[] t : invocations) {
                if (set.contains(t[0]) && !set.contains(t[1])) {
                    set.add(t[1]);
                    changed = true;
                }
            }
        }

        // Check outside methods calling suspicious methods
        for (int[] t : invocations) {
            if (!set.contains(t[0]) && set.contains(t[1])) {
                for (int i = 0; i < n; i++) {
                    ans.add(i);
                }
                return ans;
            }
        }

        // Return remaining methods
        for (int i = 0; i < n; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}
