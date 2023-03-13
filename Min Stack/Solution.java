class MinStack {

    Stack<Integer> st;
    PriorityQueue<Integer> pq;

    public MinStack() {
        st = new Stack<>();
        pq = new PriorityQueue<>();
    }

    public void push(int val) {
        pq.offer(val);
        st.push(val);
    }

    public void pop() {
        int n = st.peek();
        pq.remove(n);
        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return pq.peek();
    }
}