class Solution {
    public Boolean setBit(int num){
        int count = 0;
        while(num > 0){
            int checkBit = num & 1;
            if(checkBit == 1){
                count++;
            }
            num >>= 1; 
        }
        if(count < 2){
            return false;
        }
        for(int i = 2 ; i * i <= count ; i++){
            if(count % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public int countPrimeSetBits(int left, int right) {
        int primeCount = 0;
        for(int i = left ; i <= right ; i++){
            if(setBit(i)){
                primeCount++;
            }
        }
        return primeCount;
    }
}