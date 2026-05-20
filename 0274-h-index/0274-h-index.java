class Solution {
    public int hIndex(int[] citations) {
        int low = 0;
        int high = citations.length;
        while(low < high){
            int mid = low + (high - low + 1) / 2;
            int count = 0;
            for(int i = 0 ; i < citations.length; i++){
                if(citations[i] >= mid){
                    count++;
                }
            }
            if(count >= mid){
                low = mid;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }
}