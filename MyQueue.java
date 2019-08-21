import java.util.*;
import java.util.Stack;
public class MyQueue {
            private Stack<Integer> stack1=new Stack<>();
            private Stack<Integer>  stack2=new Stack<>();
        /** Initialize your data structure here. */
        public MyQueue() {
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
                stack1.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if(stack2.empty()) {
                while (!stack1.empty()) {
                    int v1 = stack1.pop();
                    stack2.push(v1);
                }
            }
               return stack2.pop();
           }
        }

        /** Get the front element. */
        public int peek() {
            if(stack2.empty()) {
                while (!stack1.empty()) {
                    int v = stack1.pop();
                    stack2.push(v);
                }
            }
            return stack2.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
                return stack1.empty()&&stack2.empty();
    }
}
