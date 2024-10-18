import java.util.Stack;

public class Test3 {
    public static void main(String[] args) {
//        Stack<Integer> stack=new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        //弹出顶端元素
//        System.out.println(stack.pop());
//        //System.out.println(stack.pop());
//       // System.out.println(stack.pop());
//
//        //获取顶端元素
//        //System.out.println(stack.peek());
//        System.out.println(stack.empty());


        MyStack myStack=new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        myStack.push(9);
        myStack.push(10);
        myStack.push(11);


        myStack.pop();
        myStack.pop();

        System.out.println(myStack.peek());
        System.out.println(myStack.toString());
    }
}
