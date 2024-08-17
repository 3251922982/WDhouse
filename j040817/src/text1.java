import java.util.Scanner;

public class text1 {
    public static int add(int a,int b) {
        int ret=a+b;
        return ret;
    }

    public  static int add(int a,int b,int c){
        return a+b+c;
    }

    public static double add(double x,double y){
        return x+y;
    }


    public static boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if (year % 4 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        int a=1,b=2,c=4;
        double x=2.0,y=3.0;
        System.out.println(add(a,b));
        System.out.println(add(x,y));
        System.out.println(add(a,b,c));
    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextInt()) {
//            int year = sc.nextInt();
//            if (isLeapYear(year) == true) {
//                System.out.println("1");
//            } else {
//                System.out.println("0");
//            }
//        }
//    }
}
