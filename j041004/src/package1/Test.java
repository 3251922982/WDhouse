package package1;
import java.math.*;
import java.util.Scanner;

import static java.lang.Math.floorDiv;
import static java.lang.Math.sqrt;

class Test{
//    public static void main(String[] args) {
//            Scanner reader=new Scanner(System.in);
//            while (reader.hasNext())
//            {
//                double a,b,c;
//                a= reader.nextDouble();
//                b= reader.nextDouble();
//                c= reader.nextDouble();
//                if(a+b>c&&a>0&&b>0&&c>0)
//                {
//                    double p=(a+b+c)/2.0;
//                    double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
//                    System.out.printf("%.2f\n",s);
//                }
//                else
//                    System.out.printf("Input Error!\n");
//
//            }
//            reader.close();
//    }
    public static void main6(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        float f=((float)a+(float) b+(float) c)/3;
        System.out.print(a+b+c+" ");
        System.out.print(a*b*c+" ");
        System.out.printf("%.2f",f);
    }
    public static void main4(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        //scanner.nextLine();
        int y=scanner.nextInt();
        int tmp=0;
        tmp=x;
        x=y;
        y=tmp;
        System.out.println(x+" "+y);
    }
    public static void main3(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float F=scanner.nextFloat();
        float C=5*(F-32)/9;
        System.out.printf("%.2f",C);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = 0, b = 0, c = 0;
        while (scanner.hasNext()) {

            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
            //scanner.nextLine();
        boolean det = (a <= 0 || b <= 0 || c <= 0) ? false : true;
        if ((a + b) <= c) det = false;
        else if ((a + c) <= b) det = false;
        else if ((b + c) <= a) det = false;


        if (det == true) {
            double p = (a + b + c) / 2;
            double s = p * (p - a) * (p - b) * (p - c);
            System.out.printf("%.2f\n", sqrt(s));
        } else {
            //System.out.println();
            System.out.printf("Input Error!\n");
        }
    }
    }

    public static void main1(String[] args){
        Scanner scanner=new Scanner(System.in);
        byte byte1=scanner.nextByte();
        short short1=scanner.nextShort();
        int int1=scanner.nextInt();
        long long1=scanner.nextLong();
        float float1=scanner.nextFloat();
        double double1=scanner.nextDouble();
        scanner.nextLine();
        String string1=scanner.nextLine();
        String[] strings={"byte","short","int","long","float","double"};
        System.out.println("byte:"+byte1);
        System.out.println("short:"+short1);
        System.out.println("int:"+int1);
        System.out.println("long:"+long1);
        System.out.println("double:"+double1);
        System.out.println("float:"+float1);
        System.out.println("String:"+string1);


//        System.out.println(1+1.0);
    }
}


