package classContent.wk4;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/implement-stack-using-queues/
 */

public class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        this.q1=new LinkedList();
        this.q2=new LinkedList();
    }

    public void push(int x) {
        if (q2.isEmpty())
            q1.add(x);
        else 
            q2.add(x);
    }

    /**
     * remove the last element and return it
     * @return
     */
    public int pop() {
        if (q2.isEmpty()){
            int size = q1.size();
            for (Integer e:q1
                 ) {
                
            }
            for (int i = 0; i < size; i++) {
                q2.add(q1.remove());
            }
            return (int) q2.remove();
        } else {
            int size = q2.size();
            for (int i = 0; i < size - 1; i++) {
                q1.add(q2.remove());
            }
            return (int) q2.remove();
        }
    }

    /**
     * Returns the element on the top of the stack
     * @return
     */
    public int top() {
        if (q2.isEmpty()){
            int size = q1.size();
            for (int i = 0; i < size - 1; i++) {
                q2.add(q1.remove());
            }
            int top = (int) q1.peek();
            q2.add(q1.remove());
            return (int) top;
        } else {
            int size = q2.size();
            for (int i = 0; i < size - 1; i++) {
                q1.add(q2.remove());
            }
            int top = (int) q2.peek();
            q1.add(q2.remove());
            return (int) top;
        }
    }

    public boolean empty() {
        if (q1.isEmpty() && q2.isEmpty())
            return true;
        else
            return false;
    }
}
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */