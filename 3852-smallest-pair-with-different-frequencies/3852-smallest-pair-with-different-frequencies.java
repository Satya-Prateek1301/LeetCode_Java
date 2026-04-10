class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        int[] freq = new int[101];
        for(int num : nums){
            freq[num]++;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i <= 100 ; i++){
            if(freq[i] > 0){
                list.add(i);
            }
        }

        for(int i = 0 ; i < list.size() ; i++){
            for(int j = i + 1 ; j < list.size() ; j++){
                int x = list.get(i);
                int y = list.get(j);

                if(freq[x] != freq[y]){
                    return new int[]{x, y};
                }
            }
        }
        return new int[]{-1, -1};
    }
}