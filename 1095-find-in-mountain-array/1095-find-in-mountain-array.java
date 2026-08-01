/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int peakIndexInMountainArray(MountainArray arr) {
        int len = arr.length();
        int left = 0;
        int right = len - 1;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(arr.get(mid) < arr.get(mid + 1)){
                left = mid + 1;
            }

            else{
                right = mid;
            }
        }
        return left;
    }
    public int ascendingBinarySearch(MountainArray arr, int target, int l, int r){
        while(l <= r){
            int mid = l + (r - l) / 2;
            int x = arr.get(mid);
            if(x == target){
                return mid;
            }
            else if(x < target){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return -1;
    }
    public int descendingBinarySearch(MountainArray arr, int target, int l, int r){
        while(l <= r){
            int mid = l + (r - l) / 2;
            int x = arr.get(mid);
            if(x == target){
                return mid;
            }
            else if(x < target){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return -1;
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peek = peakIndexInMountainArray(mountainArr);
        int ans = ascendingBinarySearch(mountainArr, target, 0, peek);
        if(ans != -1){
            return ans;
        }
        return descendingBinarySearch(mountainArr, target, peek + 1, mountainArr.length() - 1);
    }
}