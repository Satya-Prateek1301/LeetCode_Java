class Solution {
    public int smallestNumber(int n) {
    int mask = 0;
    int orig = n;
    while(orig!=0){
        mask = mask<<1|1;
        orig>>=1;
    } 
    return mask;   
    }
}