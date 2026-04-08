class Solution {
    public boolean divideArray(int[] nums) {

        int max=0;
        for(int i : nums){
            if(i > max)
            max = i;
        }
        int[] arr = new int[max + 1];
        for(int i : nums){
            arr[i]++;
        }
        for(int i : arr){
            if(i % 2==1)
                return false;
        }
        return true;

        // HashMap<Integer,Integer> freq = new HashMap<>();

        // int len = nums.length;

        // if(len % 2 != 0) {
        //     return false;
        // }
        
        // for (int num : nums) {
        //     freq.put(num, freq.getOrDefault(num, 0) + 1);
        // }
        
        // for(int count : freq.values()){
        //     if(count % 2 != 0){
        //         return false;
        //     }
        // }
        // return true;
    }
}