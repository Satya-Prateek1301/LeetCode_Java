class Solution {
    private int freqCount(String s) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                min = Math.min(min, freq[i]);
                max = Math.max(max, freq[i]);
            }
        }
        return max - min;
    }
    public int beautySum(String s) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                list.add(s.substring(i, j + 1));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            int count = freqCount(str);
            map.put(String.valueOf(i), count);
        }
        int res = 0;
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            res += entry.getValue();
        }
        return res;
    }
}