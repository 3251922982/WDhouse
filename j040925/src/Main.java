import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static int factorial(int n){
        return n>2?factorial(n-1)*n:n;
    }


    public static void main(String[] args) {

        int a = 1;
        Integer c = 1;//自动装包
        Integer d = new Integer(10);//手动装包
        int b = c.intValue();//拆包
        Integer e = 128;//128>127会创建一个新的Integer对象给e
        System.out.println(factorial(4));
        System.out.println(a == b);
        Double[] doubles=new Double[]{1.0,2.2,3.3,4.3,6.2};
        MyArray<Double> myArray=new MyArray<Double>(new Double[]{1.0,2.2,3.3,4.3,6.2});
        myArray.setMyArray(0,2.1);
        //Double[] Doubles=(Double[])myArray.MyArray;
//        int[] ints=new int[]{1,2,3,4};
//        double double1=Doubles[0].doubleValue();
            System.out.println(myArray.MyArray1[0]);
//        MyArray<Integer> myArray1=new MyArray<>();
        String string = new String("6666");
        String string2 = new String("6666");
        //System.out.println(string.equals(string2));//比较相同,如果比较compareTo


        Student student1 = new Student("张三", 12);
        Student student2 = new Student("李四", 13);
        Student student3 = new Student("王五", 14);
        Student[] students = new Student[]{student1, student2, student3};
        //find find = new find();
        Student student4 = find.<Student>findMin(students);
        System.out.println(student4.toString());
    }
}
