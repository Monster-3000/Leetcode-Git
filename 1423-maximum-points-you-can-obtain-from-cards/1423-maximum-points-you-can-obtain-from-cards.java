class Solution {
    public int maxScore(int[] card, int k) {
        int sum = 0;
        int max = 0;
        int i = 0;
        while (i < k) {
            sum += card[i];
            i++;
        }
        max = sum;
        int left = k - 1;
        int right = card.length - 1;
        int count = 0;
        while (count < k) {
            sum -= card[left];
            sum += card[right];
            if (sum > max) {
                max = sum;
            }
            left--;
            right--;
            count++;
        }
        return max;
    }
}