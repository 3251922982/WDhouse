package Package;

class Student{
    public   void method1(){
        System.out.println("未重写");
    }
}

interface IA{
    void test();
}
public class Test1 {
    public static void func1() {
        Test2 test2=new Test2(){
            public void func1(){
                System.out.println("Test2匿名重写");
            }
            public static void  func3(){
                System.out.println("idea");
            }
        };
        test2.func2();



        new Student(){
            public   void method1(){
                System.out.println("学生重写");
            }
        }.method1();//第一种引用


        IA ia =new IA() {
            @Override
            public void test() {
                System.out.println("接口被重写");
            }
        };
        ia.test();//第二种引用
    }


    public static void method(){
        class Inner{//局部内部类
            public int a=1;
            public  int b=2;
        }
        Inner inner=new Inner();
        System.out.println(inner.a);
    }


    public static void main(String[] args) {
        OuterClass.InnerClass innerClass=new OuterClass.InnerClass();
        innerClass.test();


        OuterClass outerClass=new OuterClass(){
            public void func3(){
                System.out.println("00000");
            }
        };
        outerClass.func3();
        OuterClass.InnerClass1 innerClass1=outerClass.new InnerClass1();
        //也可以和并成一个式子
        OuterClass.InnerClass1 innerClass2=new OuterClass().new InnerClass1();
        outerClass.date1=333;
        innerClass1.test();
        innerClass2.test();
        method();
        func1();
    }

}
