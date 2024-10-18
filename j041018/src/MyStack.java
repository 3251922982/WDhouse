import java.util.Arrays;

public class MyStack {
    public int[] elem;
    public  int usedSize=0;

    public MyStack() {
        elem=new int[10];
        //usedSize=10;
    }


    public  void push(int val) {
        if(isFull()){
            elem=Arrays.copyOf(elem,2*elem.length);
        }
        elem[usedSize]=val;
        usedSize++;
    }

    public  void pop() throws RuntimeException{
        if(isEmpty()){
            throw  new exception("栈空");
        }
        else {
            usedSize--;
        }
    }

    public  int peek() throws RuntimeException{
        if(isEmpty()){
            throw  new exception("栈空");
        }
        else {
            return elem[usedSize-1];
        }
    }


    public  boolean isFull(){
        return usedSize==elem.length;
    }

    public  boolean isEmpty() {
        return usedSize==0;
    }


    @Override
    public String toString() {
        return usedSize+" "+"MyStack{" +
                "elem=" + Arrays.toString(elem) +
                '}';
    }
}
