class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        List<Character> list = new ArrayList<>();
        int len = num.length();
        if(k == len){
            return "0";
        }
        for(int i = 0 ; i < len ; i++){
            char ch = num.charAt(i);
            while(!stack.isEmpty() && k > 0 && ch < stack.peek()){
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
        while(k > 0){
            stack.pop();
            k--;
        }
        if(stack.isEmpty()){
            return "0";
        }
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        Collections.reverse(list);
        StringBuilder sb = new StringBuilder();
        for(Character i : list){
            sb.append(i);
        }
        while(sb.length() > 0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        if(sb.length() == 0){
            return "0";
        }
        return sb.toString();
    }
}