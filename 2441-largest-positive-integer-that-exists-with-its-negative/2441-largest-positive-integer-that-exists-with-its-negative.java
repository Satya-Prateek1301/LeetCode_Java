class Solution {
    public int findMaxK(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = -1;
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : map.keySet()){
            if(i > 0 && map.containsKey(-i)){
                res = Math.max(res,i);
            }
        }
        return res;
    }
}