class MedianFinder {

    PriorityQueue<Integer> left = new PriorityQueue<>((a, b) -> b - a); // Max Heap

    PriorityQueue<Integer> right = new PriorityQueue<>();                // Min Heap

    public MedianFinder() {
    }

    public void addNum(int num) {

        // Put number into left first
        // if (left.isEmpty() || num <= left.peek()) {
        //     left.add(num);
        // } else {
        //     right.add(num);
        // }

        // // Balance the heaps
        // if (left.size() > right.size() + 1) {
        //     right.add(left.poll());
        // }

        // if (right.size() > left.size()) {
        //     left.add(right.poll());
        // }
        if(left.isEmpty() || num <= left.peek()){
            left.add(num);
        }
        else{
            right.add(num);
        }

        //balanacing
        if(left.size()>right.size()+1){
            right.add(left.poll());
        }
        if(right.size()>left.size()){
            left.add(right.poll());
        }
        }

    public double findMedian() {

        if (left.size() > right.size()) {
            return left.peek();
        }

        return (left.peek() + right.peek()) / 2.0;
    }
}