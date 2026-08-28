class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {

        if (hand.length % groupSize != 0) {
            return false;
        }

        boolean[] s = new boolean[hand.length];

        for (int i = 0; i < hand.length; i++) {
            s[i] = true;
        }

        for (int x = 0; x < hand.length; x++) {

            // Find the smallest unused card
            int index = -1;

            for (int i = 0; i < hand.length; i++) {
                if (s[i] && (index == -1 || hand[i] < hand[index])) {
                    index = i;
                }
            }

            // All cards are used
            if (index == -1) {
                break;
            }

            int current = hand[index];
            s[index] = false;

            int count = 1;

            while (count < groupSize) {

                boolean found = false;

                for (int j = 0; j < hand.length; j++) {

                    if (s[j] && hand[j] == current + 1) {
                        current++;
                        s[j] = false;
                        count++;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    return false;
                }
            }
        }

        return true;
    }
}