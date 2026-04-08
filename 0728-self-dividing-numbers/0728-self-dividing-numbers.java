class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = left ; i <= right ; i++){
            int num = i;
            int temp = num;
            boolean flag = true;
            while(num > 0){
                int rem = num % 10;

                if(rem == 0){
                    flag = false;
                    break;
                }
                if(temp % rem != 0){
                        flag = false;
                        break;
                }
                num /= 10;
            }
            if(flag){
                list.add(temp);
            }
        }
            
        return list;
    }
}