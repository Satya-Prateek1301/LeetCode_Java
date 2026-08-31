class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int left = 0;
        int ans = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int right = 0 ; right < n ; right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            while(map.size() > 2){
                int num = fruits[left];
                map.put(num,map.get(num) - 1);
                if(map.get(num) == 0){
                    map.remove(num);
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}