class Solution {
    public int removeElement(int[] nums, int val) {

        int len = nums.length;
        int j = 0;

        for(int i = 0 ; i < len ; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
                
            }
        }
        // for(int i = 0 ; i < len ; i++){
        //     System.out.println(nums[i]);
        // }
        return j;

        
        // ArrayList<Integer> list = new ArrayList<>();

        // for (int i = 0; i < nums.length; i++) {
        //     list.add(nums[i]);
        // }

        // for (int i = list.size() - 1; i >= 0; i--) {
        //     if (list.get(i) == val) {
        //         list.remove(i);
        //     }
        // }

        // for (int i = 0; i < list.size(); i++) {
        //     nums[i] = list.get(i);
        // }
        // return list.size();
    }
}