class Solution {
    public boolean isValid(String num) {
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            if (ch == '?') {
                return false;
            }
        }
        return true;
    }
    
    public boolean sumGame(String num) {
        int len = num.length();
        if (isValid(num)) {
            int sum1 = 0;
            int sum2 = 0;
            int count = 1;
            for (int i = 0; i < len; i++) {
                int ch = num.charAt(i) - '0';
                if (count <= len / 2) {
                    sum1 += ch;
                    count++;
                } else {
                    sum2 += ch;
                }
            }
            // System.out.println(sum1 + " " + sum2);
            if (sum1 == sum2) {
                return false;
            }
        } 
        else {
            int qCountL = 0;
            int qCountR = 0;

            int sum1 = 0;
            int sum2 = 0;

            int count = 1;
            for (int i = 0; i < len; i++) {
                char ch = num.charAt(i);
                if (count <= len / 2) {
                    if (ch == '?') {
                        qCountL++;
                    }
                    else{
                        sum1 += ch - '0';
                    }
                    count++;
                } 
                else {
                    if (ch == '?') {
                        qCountR++;
                    }
                    else{
                        sum2 += ch - '0';
                    }
                }
            }
            int sumDiff = sum1 - sum2;
            int qDiff = qCountL - qCountR;
            if(2 * sumDiff == -9 * qDiff){
                return false;
            }
            return true;
            // System.out.println(qCountL + " " + qCountR);
        }
        return true;
    }
}