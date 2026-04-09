class Solution {
    private int numofOne(int num){
        int count = 0;
        while(num!=0){
            int digit = num&1;
            if(digit==1) count++;
            num>>=1;
        }
        return count;
    }
    public int[] countBits(int n) {
    int[] arr = new int[n+1];
    for(int i=0;i<=n;i++){
        arr[i] = numofOne(i);
    }
    return arr;
    }
}