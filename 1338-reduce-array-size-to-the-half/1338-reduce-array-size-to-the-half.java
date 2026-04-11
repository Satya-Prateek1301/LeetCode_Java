class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = arr.length;
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int freq : map.values()){
            pq.offer(freq);
        }
        int count = 0;
        int removed = 0;

        while(removed < n/2){
            removed += pq.poll();
            count++;
        }
        return count;
    }
}