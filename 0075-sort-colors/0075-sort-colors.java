class Solution {
    public void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public void sortColors(int[] nums) {
        int low = -1;
        int high = nums.length - 1;
        int mid = 0;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums,low+1,mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
}