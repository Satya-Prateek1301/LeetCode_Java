class Solution {
    // static {
    //     for (int i = 0; i < 150; i++) findDisappearedNumbers(new int[]{3, 2, 1});
    // }
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int[] arr = new int[nums.length + 1];

        for (int i : nums) {
            arr[i]++;
        }

        List<Integer> missing = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {
            if (arr[i] == 0) {
                missing.add(i);
            }
        }

        return missing;

    }
}
        
        
        
        
        
        
        
        // List<Integer> list = new ArrayList<>();
        // Set<Integer> set = new HashSet<>();

        // for (int i = 0; i < nums.length; i++) {
        //     set.add(nums[i]);
        // }

        // for (int i = 1; i <= nums.length; i++) {
        //     if (!set.contains(i)) {
        //         list.add(i);
        //     }
        // }

        // return list;

        // int max = 0;
        // for(int i : nums){
        //     max = Math.max(i,max);
        // }

        // int[] arr = new int[max+1];

        // for(int i : nums){
        //     arr[i]++;
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == 0) {
        //         count++;
        //     }
        // }

        // int[] missing = new int[count];

        // for(int i : nums){
        //     if (arr[i] == 0) {
        //         missing[index++] = i;
        //     }
        // }

        // return missing;
    


        
    
    
