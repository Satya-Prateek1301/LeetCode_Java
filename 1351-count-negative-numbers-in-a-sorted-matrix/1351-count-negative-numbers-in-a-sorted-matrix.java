class Solution {
    public int findNegative(int[] arr){
        int len = arr.length;
        if(arr[0] < 0){
            return len;
        }
        if(arr[len - 1] >= 0){
            return 0;
        }

        int start = 0;
        int end = len - 1;
        int index = 0;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] < 0){
                index = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return len - index;
    }
    public int countNegatives(int[][] grid) {


        int result = 0;
        for(int[] arr : grid){
            result += findNegative(arr);
        }
        return result;
    }
}