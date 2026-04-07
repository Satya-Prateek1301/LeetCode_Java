class Solution {
    public int countOperations(int num1, int num2) {
        int stepCount = 0;
        while(num1!=0 && num2 != 0){
            if(num1 >= num2){
                num1 -= num2;
                stepCount++;
            }
            else{
                num2 -= num1;
                stepCount++;
            }
        }
        return stepCount;
    }
}