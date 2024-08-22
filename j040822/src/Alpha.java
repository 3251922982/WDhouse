public class Alpha extends Base {

    public static void main(String[] args) {
        //这是一个匿名对象
        new Alpha();//1
        //调用父类无参的构造方法
        new Base();//2
    }
}


class Base {
    Base() {
        System.out.print("Base");
    }
}
