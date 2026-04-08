class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;

        for(int i = 0 ; i < len; i++){
            if (i == 0) {
                if(len == 1 && flowerbed[i] == 0){
                    flowerbed[i] = 1;
                    n--;
                }
                else if(flowerbed[i] == 0 && flowerbed[i+1] == 0){
                    flowerbed[i] = 1;
                    n--;
                }
            }
            else if(i == len - 1){
                if(flowerbed[i-1] == 0 && flowerbed[i] == 0){
                    n--;
                    flowerbed[i] = 1;
                }
            }
            else if(flowerbed[i] == 0 && flowerbed[i+1] == 0 && flowerbed[i-1] == 0){
                n--;
                flowerbed[i] = 1;
            }
        }
        return n<=0 ? true:false;
    }
}