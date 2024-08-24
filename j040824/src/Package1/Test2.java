package Package1;

public class Test2 {
    public static void main(String[] args) {
        Test1 test1=new Test1(1);
        Test1 test2=new Test1(2);
        Test1.func(1);
        //Test1.func(2);

        //经过重写的toString
        System.out.println(test1);
        //equals
        String string="字符";
        String string2="字符";
        System.out.println(string2.equals(string));
        System.out.println(test1.equals(test2));

        //hashCode
        System.out.println(test1.hashCode());
        System.out.println(test2.hashCode());
    }
}

