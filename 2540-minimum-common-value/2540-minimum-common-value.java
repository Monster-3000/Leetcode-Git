class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
    
        int min = Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums1){
            map.put(i,1);
        }
        for(int i:nums2){
            if(map.containsKey(i)){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        for(int j:map.keySet()){
            if(map.get(j)>1 && j<min){
                min=j;
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}