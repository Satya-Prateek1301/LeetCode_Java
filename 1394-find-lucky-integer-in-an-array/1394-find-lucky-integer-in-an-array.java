class Solution {
    public int findLucky(int[] arr) {
        int maxNum = arr[0];
        for(int i : arr){
            maxNum = Math.max(maxNum,i);
        }

        int[] freq = new int[maxNum + 1];

        for(int i = 0 ; i < arr.length ; i++){
            freq[arr[i]]++;
        }

        int res = -1;
        for(int i = 1 ; i < freq.length; i++){
            if(freq[i] == i){
                res = Math.max(res,i);
            }
        }
        return res;
    }
}