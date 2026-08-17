class Solution {
    public boolean isPossible(int[] nums, int mid, int maxOperations){
        int operation = 0;
        for(int x : nums){
            if(x > mid){
                operation += ((x + mid - 1) / mid) - 1;
                if(operation > maxOperations){
                    return false;
                }
            }
        }
        return true;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1;
        int right = 0;
        for(int i : nums){
            right = Math.max(right, i);
        }
        while(left < right){
            int mid = left + (right - left) / 2;
            if(isPossible(nums, mid, maxOperations)){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}