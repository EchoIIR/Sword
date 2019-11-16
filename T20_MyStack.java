import java.util.*;
class T20_MyStack {
    public static void main(String[] args) {

        MyStack myStack = new MyStack();
        myStack.push(3);
        myStack.push(4);
        myStack.push(2);
        myStack.push(1);

        System.out.println("min: "+ myStack.min());
        System.out.println("top: "+ myStack.top()); 
        System.out.println("min: "+myStack.m_min); 
        System.out.println(myStack.m_data); 

        myStack.pop();
        myStack.pop();
        System.out.println(myStack.min());
        System.out.println(myStack.top()); 
        System.out.println(myStack.m_min); 
        System.out.println(myStack.m_data); 


    }
}

class MyStack {
    // 数据栈：正常存放数据
    Stack<Integer> m_data = new Stack<Integer>(); 
    // 辅助栈：史上所有最小元素入栈，为了得到min
    Stack<Integer> m_min = new Stack<Integer>(); 

    public void push(int node) {
        m_data.push(node);
   
                if(m_min.empty()){
                    m_min.push(node);
                }else{
                    if(node <= m_min.peek()){
                        m_min.push(node);
                    }else{
                        m_min.push(m_min.peek());
                    }
                }
        /*
        if(m_min.empty()|| node<=m_min.peek()){
            // 当辅助栈为空，或者当前插入值小于辅助栈栈顶元素时
            // 当前插入值也要入辅助栈
            m_min.push(node);
        }else{
            // 否则，辅助栈的栈顶元素< 插入的元素，
            // 此时辅助栈把栈顶元素重复入栈一次。
            m_min.push(m_min.pop()); // 错
            m_min.push(m_min.peek());
        }        
        */

    }

    public void pop() {
            m_data.pop();
            m_min.pop();
    }

    public int top() {
        return m_data.peek();
    }
    
    public int min() {      
        return m_min.peek();
    }
}