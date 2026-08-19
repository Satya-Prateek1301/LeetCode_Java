class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums.length ; j++){
                if(i != j){
                    int diff = Math.abs(nums[i] - nums[j]);
                    if(diff == k){
                        int a = Math.min(nums[i], nums[j]);
                        int b = Math.max(nums[i], nums[j]);
                        List<Integer> list = new ArrayList<>();
                        list.add(a);
                        list.add(b);
                        set.add(list);      
                    }
                }
            }
        }
        return set.size();
    }
}