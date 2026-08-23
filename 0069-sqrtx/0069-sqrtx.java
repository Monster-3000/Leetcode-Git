class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1 || x == 2) {
            return x == 2 ? 1 : x;
        }

        for (int i = 1; i < x; i++) {
            if (i > x / i) {
                return i - 1;
            }
        }

        return 0;
    }
}