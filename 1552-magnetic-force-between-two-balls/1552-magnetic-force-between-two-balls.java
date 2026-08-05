class Solution {
    public boolean isPossible(int[] position, long mid, int m){
        int basket = 1;
        int last = position[0];
        for(int i = 1 ; i < position.length ; i++){
            if(position[i] - last >= mid){
                basket++;
                last = position[i];
            }
            if(basket >= m){
                return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        // int min = Integer.MAX_VALUE;
        // long max = Integer.MIN_VALUE;
        // for(int i : position){
        //     min = Math.min(min, i);
        //     max = Math.max(max, i);
        // }
        Arrays.sort(position);
        long left = 1;
        long right = position[position.length - 1] - position[0];
        while(left <= right){
            long mid = left + (right - left) / 2;
            if(isPossible(position, mid, m)){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return (int)right;
    }
}