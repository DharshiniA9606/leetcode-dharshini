// Last updated: 8/12/2026, 8:49:26 AM
class MinStack {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> st = new Stack<>();

    public void push(int val) {
        s.push(val);

        if (st.isEmpty() || val <= st.peek()) {
            st.push(val);
        }
    }

    public void pop() {
        if (s.isEmpty()) return;

        int x = s.pop();

        if (x == st.peek()) {
            st.pop();
        }
    }

    public int top() {
        if (s.isEmpty()) return -1;
        return s.peek();
    }

    public int getMin() {
        if (st.isEmpty()) return -1;
        return st.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */