class Solution {
    public int heightChecker(int[] heights) {
        int len = heights.length;
        int[] exp = new int[len];

        for(int i = 0 ; i < len ; i++){
            exp[i] = heights[i];
        }

        Arrays.sort(exp);

        int count = 0;
        for(int i = 0 ; i < len ; i++){
            if(heights[i] != exp[i]){
                count++;
            }
        }
        return count;
    }
}