class Solution {
    public void reverse(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int temp = arr[left];
            arr[left++] = arr[right] ^ 1;
            arr[right--] = temp ^ 1;
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int arr[] : image){
            reverse(arr);
        }
        return image;
    }
}