class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];
        for(int i = 0 ; i < n ; i++){
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a,b)->Integer.compare(a[0],b[0]));
        int minIdx = n - 1;
        int maxWidth = 0;
        for(int i = 0 ; i < n ; i++){
            minIdx = Math.min(minIdx, arr[i][1]);
            maxWidth = Math.max(maxWidth, arr[i][1] - minIdx);
        }
        return maxWidth;
    }
}