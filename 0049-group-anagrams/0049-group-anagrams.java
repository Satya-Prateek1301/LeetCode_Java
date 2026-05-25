class Solution {
    public String sortString(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0 ; i < strs.length; i++){
            String str = sortString(strs[i]);
            if(!map.containsKey(str)){
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(str,list);
            }
            else{
                if(map.containsKey(str)){
                    map.get(str).add(strs[i]);
                }
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(List<String> list : map.values()){
            res.add(list);
        }
        return res;
    }
}