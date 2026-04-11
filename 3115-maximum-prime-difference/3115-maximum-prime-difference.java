class Solution {
    public boolean isPrime(int n){
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == n){
                return true;
            }
        }
        return false;
    }
    public int maximumPrimeDifference(int[] nums) {
        int firstPrime = 0;
        int secondPrime = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int n = nums[i];
            if(isPrime(n)){
                firstPrime = i;
                break;
            }
        }
        for(int i = nums.length - 1 ; i > firstPrime; i--){
            int n = nums[i];
            if(isPrime(n)){
                secondPrime = i;
                break;
            }
        }
        if(secondPrime == 0){
            return 0;
        }
        return Math.abs(firstPrime - secondPrime);
    }
}