#include <stack>
#include <iostream>
using namespace std;

class MyQueue
{
private:
    stack<int> stack1;
    stack<int> stack2;

public:
    MyQueue()
    {
    }

    void push(int x)
    {
        stack1.push(x);
    }

    int pop()
    {
        if (stack2.empty())
        {
            while (!stack1.empty())
            {
                stack2.push(stack1.top());
                stack1.pop();
            }
        }
        if (stack2.empty())
        {
            throw std::runtime_error("Queue is empty");
        }
        int front = stack2.top();
        stack2.pop();
        return front;
    }

    int peek()
    {
        if (stack2.empty())
        {
            while (!stack1.empty())
            {
                stack2.push(stack1.top());
                stack1.pop();
            }
        }
        if (stack2.empty())
        {
            throw std::runtime_error("Queue is empty");
        }
        return stack2.top();
    }

    bool empty()
    {
        return stack1.empty() && stack2.empty();
    }
};

int main()
{
    MyQueue myQ;

    myQ.push(1);
    myQ.push(2);
    cout << myQ.peek() << endl;
    cout << myQ.pop() << endl;
    cout << myQ.empty() << endl;
    cout << myQ.pop() << endl;
    cout << myQ.empty() << endl;
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */