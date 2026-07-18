class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        int len = asteroids.length;
        for(int i=0;i<len;i++){
            boolean alive = true;
            while(!s.empty() && s.peek()>0 && asteroids[i]<0){
                if(s.peek()<Math.abs(asteroids[i])){
                    s.pop();
                }
                else if(s.peek()==Math.abs(asteroids[i])){
                    alive = false;
                    s.pop();
                    break;
                }
                else{
                    alive = false;
                    break;
                }
            }
            if(alive){
                s.push(asteroids[i]);
            }
        }
        int[] arr = new int[s.size()];
        for(int i=s.size()-1;i>=0;i--){
            arr[i]=s.pop();
        }
        return arr;

    }
}