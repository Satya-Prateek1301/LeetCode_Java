class Solution {
    public int countDigit(int num){
        int count = 0;
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = lowLimit ; i <= highLimit ; i++){
            int x = i;
            int y = countDigit(x);
            map.put(y,map.getOrDefault(y,0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(int i : map.values()){
            max = Math.max(max,i);
        }
        return max;
    }
}