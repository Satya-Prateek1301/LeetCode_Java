class Solution {
    public int differenceOfSums(int n, int m) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1 ; i <= n ; i++){
            if(i%m == 0){
                sum1 += i;
            }
            else{
                sum2 += i;
            }
        }
        return sum2 - sum1;
        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // int[] num1 = new int[n];
        // int[] num2 = new int[n];
        // int sum1 = 0;
        // int sum2 = 0;
        // for(int i = 1 ; i <= n ; i++){
        //     int x = i;
        //     if(x%m != 0){
        //         list1.add(x);
        //     }
        //     else if(x%m == 0){
        //         list2.add(x);
        //     }
        // }

        // for(int i = 0 ; i < list1.size() ; i++){
        //     sum1 += sum1 + list1.get(i);
        // }
        
        // for(int i = 0 ; i < list2.size() ; i++){
        //     sum2 += sum2 + list2.get(i);
        // }
        
        // return sum1 - sum2;
    }
}