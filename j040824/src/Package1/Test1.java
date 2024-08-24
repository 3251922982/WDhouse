package Package1;

import java.util.Objects;

public class Test1 {

    public  int  b;
    //public  int  b1;
     Test1(int b) {
        this.b = b;
    }

    public  static   void  func(int b){
        System.out.println(b);
    }


    @Override
    public String toString() {
        return "Test1{" +
                "b=" + b +
                '}';
    }
//@Override
//    public boolean equals(Object obj) {//保证可以接受所有的类
//         //对obj对象进行向下转型取其中的属性
//        Test1 tmp=(Test1) obj;
//        return this.b==tmp.b;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test1 test1 = (Test1) o;
        return b == test1.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(b);
    }
}
