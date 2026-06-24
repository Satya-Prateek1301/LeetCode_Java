class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int n = nums.length;
        // int k = n - 1;
        for(int i = 0; i < nums.length ; i++){
            int x = (int)Math.pow(nums[i],2);
            res[i] = x;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : res){
            pq.offer(i);
        }
        for(int i = 0 ; i < n ; i++){
            res[i] = pq.poll();
        }
        return res;
    }
}