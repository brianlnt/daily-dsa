package course.labs.w1d1;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int top;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);
        top = x;
    }

    public int pop() {
        while(q1.size() > 1){
            top = q1.remove();
            q2.add(top);
        }
        int popElement = q1.remove();
        Queue<Integer> tmp = q1;
        q1 = q2;
        q2 = tmp;
        return popElement;
    }

    public int top() {
        if(empty()) return -1;
        return top;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}

public class P1 {
    /*
    225. Implement Stack using Queues (https://leetcode.com/problems/implement-stack-using-queues/description/)
     */
    public static void main(String[] args) {
         MyStack obj = new MyStack();
         obj.push(1);
         int param_2 = obj.pop();
         int param_3 = obj.top();
         boolean param_4 = obj.empty();
         System.out.println(param_2);
         System.out.println(param_3);
         System.out.println(param_4);
    }
}
