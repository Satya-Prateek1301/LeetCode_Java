class Solution {
    public boolean isUgly(int n) {
        if(n <= 0){
            return false;
        }

        int temp = n;
        
        for(int i = 2 ; i <= 5 ; i++){
            int rem = temp % i;
            while(temp % i == 0){
                temp /= i;
            }
            
        }

        return temp == 1;
    }
}