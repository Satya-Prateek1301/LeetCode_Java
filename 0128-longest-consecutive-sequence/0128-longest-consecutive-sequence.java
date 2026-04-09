class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int longest = 0;

        for(int n : set){
            if(!set.contains(n - 1)){
                int curr = n;
                int count = 1;

                while(set.contains(curr + 1)){
                    curr++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
} 