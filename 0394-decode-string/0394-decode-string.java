class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num = num * 10 + (ch - '0');
            }
            else if(ch == '['){
                numStack.push(num);
                strStack.push(sb.toString());
                num = 0;
                sb = new StringBuilder();
            }
            else if(ch == ']'){
                int repeat = numStack.pop();
                String prev = strStack.pop();
                StringBuilder temp = new StringBuilder(prev);
                for(int j = 0 ; j < repeat ; j++){
                    temp.append(sb);
                }
                sb = temp;
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}