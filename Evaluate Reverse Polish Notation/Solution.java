class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String symbol : tokens) {
            switch (symbol) {
                case "+" -> st.add(st.pop() + st.pop());
                case "-" -> {
                    int b = st.pop();
                    int a = st.pop();
                    st.add(a - b);
                }
                case "/" -> {
                    int b = st.pop();
                    int a = st.pop();
                    st.add(a / b);
                }
                case "*" -> st.add(st.pop() * st.pop());
                default -> st.add(Integer.parseInt(symbol));
            }
        }
        return st.peek();
    }
}