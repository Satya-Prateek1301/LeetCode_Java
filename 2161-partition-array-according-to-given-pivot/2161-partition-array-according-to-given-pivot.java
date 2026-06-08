class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> smaller = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> larger = new ArrayList<>();
        for(int i : nums){
            if(i < pivot){
                smaller.add(i);
            }
            else if(i == pivot){
                equal.add(i);
            }
            else if(i > pivot){
                larger.add(i);
            }
        }
        List<Integer> merged = new ArrayList<>();
        merged.addAll(smaller);
        merged.addAll(equal);
        merged.addAll(larger);

        int[] arr = new int[nums.length];
        int idk = 0;
        for(int i = 0; i < merged.size() ; i++){
            arr[i] = merged.get(i);
        }
        return arr;
    }
}