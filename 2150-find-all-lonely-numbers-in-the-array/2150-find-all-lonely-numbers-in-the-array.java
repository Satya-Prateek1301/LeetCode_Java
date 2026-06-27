class Solution {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int x : nums){
            if(map.get(x) == 1 && !map.containsKey(x - 1) && !map.containsKey(x + 1)){
                list.add(x);
            }
        }
        return list;
    }
}