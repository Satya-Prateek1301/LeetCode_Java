class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i : asteroids){
            if(i > 0){
                stack.push(i);
            }
            else{
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -i){
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek() < 0){
                    stack.push(i);
                }
                else if(stack.peek() == -i){
                    stack.pop();
                }
            }
        }
        int[] arr = new int[stack.size()];
        int idx = arr.length - 1;
        while(!stack.isEmpty()){
            arr[idx--] = stack.pop();
        }
        return arr;
    }
}