class Solution {
    public int passwordStrength(String password) {
        Set<Character> set = new HashSet<>();
        int ans = 0;
        for(int i = 0 ; i < password.length() ; i++){
            char ch = password.charAt(i);
            if(set.contains(ch)){
                continue;
            }
            set.add(ch);
            if(Character.isLowerCase(ch)){
                ans += 1;
            }
            if(Character.isUpperCase(ch)){
                ans += 2;
            }
            if(Character.isDigit(ch)){
                ans += 3;
            }
            else if(ch == '!' || ch == '@' || ch == '#' || ch == '$'){
                ans += 5;
            }
        }
        return ans;
    }
}