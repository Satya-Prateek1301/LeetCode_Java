class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String str : words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>(
            (a,b) -> {
                if(map.get(a).equals(map.get(b))){
                    return b.compareTo(a);
                }
                return map.get(a) - map.get(b);
            }
        );
        for(String str : map.keySet()){
            pq.offer(str);
            if(pq.size() > k){
                pq.poll();
            }
        }
        List<String> list = new ArrayList<>();
        while(!pq.isEmpty()){
            list.add(pq.poll());
        }
        Collections.reverse(list);
        return list;
    }
}