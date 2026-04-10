class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Set<Integer> set = new HashSet<>();

        for(int i : bulbs){
            if(set.contains(i)){
                set.remove(i);
            }
            else{
                set.add(i);
            }
        }
        List<Integer> res = new ArrayList<>(set);
        Collections.sort(res);
        return res;
    }
}