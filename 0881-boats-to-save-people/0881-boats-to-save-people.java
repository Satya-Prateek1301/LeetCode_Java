class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int count = 0;
        for(int s1 = 0, s2 = n - 1; s2 >= s1;){
            if(people[s1] + people[s2] <= limit){
                s1++;
                s2--;
            }
            else{
                s2--;
            }
            count++;
        }
        return count;
    }
}