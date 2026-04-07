class Solution {
    public int countSeniors(String[] details) {

        int lenD = details.length;
        int maxCount = 0;
        int count = 0;
        for(int i = 0 ; i < lenD ; i++){
            String x = details[i];
            String ageX = x.substring(11,13);
            int ageXx = Integer.parseInt(ageX);
            if(ageXx>60){
                count++;
                // maxCount = Math.max(maxCount,count); 
            }
        }
        // maxCount = Math.max(maxCount,count); 
        return count;
    }
}