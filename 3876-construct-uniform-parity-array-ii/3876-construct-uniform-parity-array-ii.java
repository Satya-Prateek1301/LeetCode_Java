class Solution {
    public boolean uniformArray(int[] nums1) {
        int smallOdd = Integer.MAX_VALUE;
        int smallEven = Integer.MAX_VALUE;
        for(int num : nums1){
            if(num % 2 == 0){
                smallEven = Math.min(smallEven, num);
            }
            else{
                smallOdd = Math.min(smallOdd, num);
            }
        }
        if(smallOdd == Integer.MAX_VALUE){
            return true;
        }
        if(smallEven == Integer.MAX_VALUE){
            return true;
        }
        if(smallOdd < smallEven){
            return true;
        }
        return false;
    }
}