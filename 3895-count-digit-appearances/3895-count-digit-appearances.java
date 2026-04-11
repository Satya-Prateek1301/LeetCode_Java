class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int n = nums[i];
            while(n != 0){
                int rem = n % 10;
                map.put(rem,map.getOrDefault(rem,0)+1);
                n /= 10;
            }
        }
        if(map.containsKey(digit)){
            return map.get(digit);
        }
        return 0;
    }
}