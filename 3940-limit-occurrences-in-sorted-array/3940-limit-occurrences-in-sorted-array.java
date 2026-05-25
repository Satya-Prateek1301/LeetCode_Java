class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int[] freq = new int[101];
        List<Integer> list = new ArrayList<>();
        for(int i  : nums){
            if(freq[i] < k){
                list.add(i);
                freq[i]++;
            }
        }
        int[] arr = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}