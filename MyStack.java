import java.util.*;
public class MyStack {
    /**
     * Initialize your data structure here.
     */
    public MyStack() {
    }
private Queue<Integer> queue=new LinkedList<>();
    /**
     * Push element x onto stack.
     */
    public void push(int x) {
            queue.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */

    public int pop() {
        int size=queue.size();
            for(int i=0;i<size-1;i++){
              int v= queue.poll();
                queue.add(v);
            }
            return queue.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        int size=queue.size();
        for(int i=0;i<size-1;i++){
            int v= queue.poll();
            queue.add(v);
        }
        int v=queue.poll();
        queue.add(v);
        return v;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.isEmpty();
    }
}