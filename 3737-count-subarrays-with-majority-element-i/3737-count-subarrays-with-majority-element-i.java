class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count = 0;
        // List<Integer> list = new ArrayList<>(); 
        for(int i = 0 ; i < nums.length ; i++){
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int j = i ; j < nums.length ; j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                int len = j - i + 1;
                if((map.containsKey(target)) && (2 * map.get(target) > len)){
                    count++;
                }
            }
        }
        return count;
    }
}