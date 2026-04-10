class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i : nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }

        Map<Integer, Integer> freqCount = new HashMap<>();
        for(int fC : freq.values()){
            freqCount.put(fC, freqCount.getOrDefault(fC,0)+1);
        }

        for(int num : nums){
            int f = freq.get(num);
            if(freqCount.get(f) == 1){
                return num;
            }
        }
        return -1;
    }
}