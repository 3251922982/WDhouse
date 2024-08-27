package Package;

public class Test1 {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass=new OuterClass.InnerClass();
        innerClass.test();


        OuterClass outerClass=new OuterClass();
        OuterClass.InnerClass1 innerClass1=outerClass.new InnerClass1();
        //也可以和并成一个式子
        OuterClass.InnerClass1 innerClass2=new OuterClass().new InnerClass1();
        outerClass.date1=333;
        innerClass1.test();

    }
}
