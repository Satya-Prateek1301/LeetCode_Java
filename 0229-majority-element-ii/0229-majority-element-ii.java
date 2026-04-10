class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : nums){
            min = Math.min(min,i);
            max = Math.max(max,i);
        }
        int[] freq = new int[max - min + 1];
        for(int i : nums){
            freq[i - min]++;
        }

        for(int i = 0 ; i < freq.length; i++){
            if(freq[i] > n/3){
                list.add(i + min);
            }
        }
        return list;
    }
}