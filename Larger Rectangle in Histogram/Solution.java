class Solution {
    private static ArrayList<Integer> prevSmaller(int[] arr)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i=0;i<arr.length;i++)
        {
            int curr = arr[i];
            while(st.peek() != -1 && arr[st.peek()] >= curr)
                st.pop();
            ans.add(st.peek());
            st.push(i);
        }
        return ans;
    }
    private static ArrayList<Integer> nextSmaller(int[] arr)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i=arr.length-1;i>=0;i--)
        {
            int curr = arr[i];
            while(st.peek() != -1 && arr[st.peek()]>= curr) {
                st.pop();
            }
            ans.add(st.peek());
            st.push(i);
        }
        Collections.reverse(ans);
        return ans;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        ArrayList<Integer> prev = prevSmaller(heights);
        ArrayList<Integer> next = nextSmaller(heights);

        int area = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++)
        {
            int l = heights[i];
            if(next.get(i)==-1)
                next.set(i,n);
            int b = next.get(i)-prev.get(i)-1;
            int curr = l*b;
            area = Math.max(curr,area);
        }
        return area;
    }
}