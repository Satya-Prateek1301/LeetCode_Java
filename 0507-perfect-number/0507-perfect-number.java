class Solution {
    public boolean checkPerfectNumber(int num) {
        int perfectCount = 0;
        boolean flag = false;
        for(int i = 1 ; i <= num/2 ; i++){
            if(num % i == 0){
                perfectCount += i;
            }
        }
        if(perfectCount == num){
            return flag = true;
        }
        else {
            return flag = false;
        }
    }
}