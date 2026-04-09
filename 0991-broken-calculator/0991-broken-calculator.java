class Solution {
    public int brokenCalc(int startValue, int target) {
        int step = 0;
        
        while(startValue < target){
            if(target % 2 == 0){
                target /= 2;
            }
            else{
                target++;
            }
            step+=1;
        }
        return step+(startValue - target);
    }
}