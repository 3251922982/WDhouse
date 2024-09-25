import java.util.Arrays;



public class Main {
    public static int factorial(int n){
        return n>2?factorial(n-1)*n:n;
    }


    public static void main(String[] args) {

        int a=1;
        Integer c=1;//自动装包
        Integer d=new Integer(10);//手动装包
        int b=c.intValue();//拆包
        Integer e=128;//128>127会创建一个新的Integer对象给e
        System.out.println(factorial(4));
        System.out.println(a==b);

        MyArray<Double> myArray=new MyArray<Double>();
        myArray.setMyArray(0,2.1);
        Double[] Doubles=(Double[])myArray.MyArray;
        int[] ints=new int[]{1,2,3,4};
        double double1=Doubles[0].doubleValue();
        System.out.println(double1);
        MyArray<Integer> myArray1=new MyArray<>();


    }

}
