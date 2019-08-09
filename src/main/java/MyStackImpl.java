public class MyStackImpl implements MyStack {
    private int[] stack;//存放数据元素的
    private int top;//当前可以存放元素的数组下标
    private int usedSize;

    public MyStackImpl(int k) {
        this.stack = new int[k];
        this.top = 0;
        this.usedSize = 0;
    }

    public boolean empty() {
        if(this.top == 0){
            return true;
        }
        return false;
    }

    public int peek() {
        return stack[top-1];
    }

    public int pop() {
        int q = stack[top-1];
        top--;
        usedSize--;
        return q;
    }
    //判断栈是否满
    public boolean isFull(){
        if(this.usedSize == stack.length-1){
            return true;
        }
        return false;
    }

    public void push(int item) {
        if(isFull()){
            System.out.println("栈已满");
        }
        stack[top++] = item;
        usedSize++;
    }

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();

        return false;
    }

    public int size() {
        return this.usedSize;
    }

    public static void main(String[] args) {
        MyStackImpl p = new MyStackImpl(10);
        String str = "({[]})";
        p.isValid(str);
//        p.push(1);
//        p.push(3);
//        p.push(2);
//        p.push(5);
//        p.push(6);
//        p.push(7);
//        System.out.println(p.size());
//        System.out.println(p.empty());
//        System.out.println(p.peek());
//        System.out.println(p.pop());
//        System.out.println(p.size());

    }
}
