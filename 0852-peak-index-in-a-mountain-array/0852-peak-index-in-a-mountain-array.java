class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int len = arr.length;
        int left = 0;
        int right = len - 1;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(arr[mid] < arr[mid + 1]){
                left = mid + 1;
            }

            else{
                right = mid;
            }
        }
        return left;

        // int n = arr.length;
        // int res[] = new int[n];
        // List<Integer> list = new ArrayList<>();

        // for(int i = 0 ; i < n ; i++){
        //     list.add(arr[i]);
        // }

        // Arrays.sort(arr);
        // int max = arr[n - 1];

        // int index = list.indexOf(max); 
        // return index;
    }
}