class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subs = new ArrayList<>();
        subs.add(new ArrayList<>());
        for(int num:nums){
            int size = subs.size();
            for(int i=0;i<size;i++){
                List<Integer> temp = new ArrayList<>(subs.get(i));
                temp.add(num);
                subs.add(temp);
            }
        }
        return subs;
    }
}