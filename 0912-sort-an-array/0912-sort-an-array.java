class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : nums){
            pq.offer(i);
        }
        int[] arr = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            arr[i] = pq.poll();
        }
        return arr;
    }
}