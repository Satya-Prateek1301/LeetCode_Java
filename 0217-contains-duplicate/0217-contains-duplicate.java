class Solution {
    static {
        for (int i = 0; i <= 100; i++)
            containsDuplicate(new int[]{0, 1, 0});
    }
    public static boolean containsDuplicate(int[] nums) {

        
        // HashMap<Integer,Integer> map = new HashMap<>();

        // for (Integer i : nums) {
        //     map.put(i, map.getOrDefault(i, 0) + 1);
        // }

        // for(Integer val : map.values()){
        //     if(val>1){
        //         return true;
        //     }
        // }
        // return false;

        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            if(!set.add(nums[i])){
                return true;
            }
            // set.add(nums[i]);
        }
        return false;

        // if(set.size() != nums.length){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        

    }
}