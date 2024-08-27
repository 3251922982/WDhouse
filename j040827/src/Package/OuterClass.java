package Package;

public class OuterClass {
    public int date1=1;

    //静态内部类
    static class InnerClass{
        public  int date3=3;
        public int date1=1;
        public  void test(){
            System.out.println(date3);
            OuterClass out=new OuterClass();
            System.out.println(out.date1);
        }
    }

    //实例内部类
    class InnerClass1{
        public  int date1=111;
        public void test(){
            System.out.println(OuterClass.this.date1);
            System.out.println(date1);
        }
    }
}
