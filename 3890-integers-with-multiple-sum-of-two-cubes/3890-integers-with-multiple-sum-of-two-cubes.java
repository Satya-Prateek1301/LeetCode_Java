class Solution {
    public List<Integer> findGoodIntegers(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int a = 1 ; a * a * a <= n ; a++){
            for(int b = a ; a * a * a + b * b *b <= n ; b++){
                int sum = a * a * a + b * b *b;
                map.put(sum, map.getOrDefault(sum, 0)+1);
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int x : map.keySet()){
            if(map.get(x) >= 2){
                res.add(x);
            }
        }
        Collections.sort(res);
        return res;
    }
}