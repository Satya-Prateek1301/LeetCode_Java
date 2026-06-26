class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < nums.size() ; i++){
            for(int j = 0 ; j < nums.get(i).size() ; j++){
                int key = i + j;
                if(!map.containsKey(key)){
                    map.put(key,new ArrayList<>());
                }
                map.get(key).add(nums.get(i).get(j));
                count++;
            }
        }
        int[] arr = new int[count];
        int idx = 0;
        for(int i = 0 ; i < map.size() ; i++){
            if (!map.containsKey(i)) continue;
            List<Integer> list =map.get(i);
            for(int j = list.size() - 1; j >= 0 ; j--){
                arr[idx++] = list.get(j);
            }
        }
        return arr;
    }
}