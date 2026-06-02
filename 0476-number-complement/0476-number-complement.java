class Solution {
    public int complement(String binNum){
        String str = "";
        for(int i = 0 ; i < binNum.length() ; i++){
            char ch = binNum.charAt(i);
            if(ch == '0'){
                str += '1';
            }
            else{
                str += '0';
            }
        }
        return Integer.parseInt(str,2);
    }
    public int findComplement(int num) {
        String binNum = Integer.toBinaryString(num);
        int comp = complement(binNum);
        return comp;
    }
}