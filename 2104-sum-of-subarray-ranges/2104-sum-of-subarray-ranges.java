import java.util.Stack;

class Solution {

    public long subArrayRanges(int[] nums) {

        int n = nums.length;

        long maxSum = 0;
        long minSum = 0;

        // Stores index of Previous Greater Element
        int[] prevGreater = new int[n];

        // Stores index of Next Greater Element
        int[] nextGreater = new int[n];

        // Stores index of Previous Smaller Element
        int[] prevSmaller = new int[n];

        // Stores index of Next Smaller Element
        int[] nextSmaller = new int[n];

        Stack<Integer> stack = new Stack<>();

        // ---------------- Previous Greater ----------------
        // Find the first greater element on the left
        // Stack is maintained in decreasing order
        for (int i = 0; i < n; i++) {

            // Remove all smaller or equal elements
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }

            // If stack is empty, no previous greater exists
            prevGreater[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current index
            stack.push(i);
        }

        stack.clear();

        // ---------------- Next Greater ----------------
        // Find the first greater element on the right
        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Remove all smaller elements
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                stack.pop();
            }

            // If stack is empty, no next greater exists
            nextGreater[i] = stack.isEmpty() ? n : stack.peek();

            stack.push(i);
        }

        stack.clear();

        // ---------------- Previous Smaller ----------------
        // Find the first smaller element on the left
        // Stack is maintained in increasing order
        for (int i = 0; i < n; i++) {

            // Remove all greater or equal elements
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }

            // If stack is empty, no previous smaller exists
            prevSmaller[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(i);
        }

        stack.clear();

        // ---------------- Next Smaller ----------------
        // Find the first smaller element on the right
        for (int i = n - 1; i >= 0; i--) {

            // Remove all greater elements
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                stack.pop();
            }

            // If stack is empty, no next smaller exists
            nextSmaller[i] = stack.isEmpty() ? n : stack.peek();

            stack.push(i);
        }

        // ---------------- Contribution Calculation ----------------
        for (int i = 0; i < n; i++) {

            // Number of choices on the left
            long left = i - prevGreater[i];

            // Number of choices on the right
            long right = nextGreater[i] - i;

            // Contribution of nums[i] as maximum
            maxSum += (long) nums[i] * left * right;

            // Recalculate for minimum contribution
            left = i - prevSmaller[i];
            right = nextSmaller[i] - i;

            // Contribution of nums[i] as minimum
            minSum += (long) nums[i] * left * right;
        }

        // Final answer
        return maxSum - minSum;
    }
}