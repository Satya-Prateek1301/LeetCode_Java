class Solution {
    public char findTheDifference(String s, String t) {
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        Arrays.sort(arrS);
        Arrays.sort(arrT);

        int lenS = arrS.length;
        int lenT = arrT.length;

        int i = 0;
        int j = 0;

        while(i < lenS && j < lenT){
            if(arrS[i] == arrT[j]){
                i++;
                j++;
            }
            else{
                return arrT[i];
            }
        }

        return arrT[j];
    }
}