public interface MyStack {
    // 判断这个栈是否为空栈
    boolean empty();
    // 返回栈顶元素，但不出栈
    int peek();
    // 返回栈顶元素，并且出栈
    int pop();
    // 将 item 压入栈中
    void push(int item);
    // 返回元素个数
    int size();
    //1.括号匹配问题
    boolean isValid(String s);
}
