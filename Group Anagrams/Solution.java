class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mpp = new HashMap<>();
        for(int i =0;i<strs.length;i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String s = new String(temp);
            if (!mpp.containsKey(s))
                mpp.put(s, new ArrayList<>());
            mpp.get(s).add(strs[i]);
        }
        List<List<String>> ans  = new ArrayList<>(mpp.values());
        return ans;
    }
}