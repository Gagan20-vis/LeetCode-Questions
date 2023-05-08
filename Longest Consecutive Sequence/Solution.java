class Solution {
    public int longestConsecutive(int[] nums) {
        try{Set<Integer> st = new HashSet<>();
            for(int i:nums)st.add(i);
            int ans = 0;
            for(int i:st){
                if(!st.contains(i-1)){
                    int curr_num = i;
                    int currStreak = 1;
                    while(st.contains(curr_num+1)){
                        curr_num += 1;
                        currStreak++;
                    }
                    ans = Math.max(ans,currStreak);
                }
            }
            return ans;}finally{System.gc();}
    }
}