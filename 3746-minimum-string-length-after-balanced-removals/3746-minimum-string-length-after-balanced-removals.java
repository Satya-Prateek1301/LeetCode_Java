class Solution {
    public int minLengthAfterRemovals(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == 'a'){
                if(!stack.isEmpty() && stack.peek() == 'b'){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
            else{
                if(!stack.isEmpty() && stack.peek() == 'a'){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
        }
        return stack.size();
    }
}