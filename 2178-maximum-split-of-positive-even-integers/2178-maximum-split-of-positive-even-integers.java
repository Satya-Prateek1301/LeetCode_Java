class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> list = new ArrayList<>();
        if(finalSum % 2 != 0){
            return list;
        }
        long currNum = 2;
        long remainingSum = finalSum;
        while(currNum <= remainingSum){
            list.add(currNum);
            remainingSum -= currNum;
            currNum += 2;
        }
        long last = list.remove(list.size() - 1);
        list.add(last + remainingSum);
        return list;
    }
}