import classContent.wk4.MyStack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyStack mStack = new MyStack();
        mStack.push(1);
        mStack.push(2);
        mStack.push(3);
        mStack.push(4);
        mStack.push(2);
        System.out.println(mStack.top());
        System.out.println(mStack.pop());
        System.out.println(mStack.top());
    }
}