class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int k = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                for (int curr = i; curr < n; curr += k) {
                    result.append(s.charAt(curr));
                }
            }
            else if (i == numRows - 1) {
                for (int curr = i; curr < n; curr += k) {
                    result.append(s.charAt(curr));
                }
            }
            else {
                int front = i;
                int prev;
                while (front < n) {
                    result.append(s.charAt(front));
                    prev = front + k - 2 * i;
                    if (prev < n) {
                        result.append(s.charAt(prev));
                    }
                    front += k;
                }
            }
        }
        return result.toString();
    }
}