class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele : stones){
            pq.add(ele);
        }

        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            if(second != first){
                pq.offer(first - second);
            }
        }

        return pq.isEmpty()?0:pq.peek();
    }
}