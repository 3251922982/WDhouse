import  java.math.*;
import java.util.Scanner;

public class Test2 {
    public static int func(int a,int x) {
        int b=a;
        for(int i=1;i<x;i++){
            b+=a*Math.pow(10,i);
        }
        return b;
    }

    public static void main(String[] args) {
        test test1=new test();
       test1.func(2,2);
    }
    public static void main2(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count =0;
        while (count<100) {
        String firstCards=scanner.next();
        String secondCards=scanner.next();
        String str="3456789TJQKA2";
            if (firstCards.length() == secondCards.length()) {
                int det = str.indexOf(firstCards.charAt(0)) - str.indexOf(secondCards.charAt(0));
                if (firstCards.length() == 1) {
                    if (det == 1) {
                        System.out.println(1);
                    } else if (det == 0) {
                        System.out.println(0);
                    } else if (det == -1) {
                        System.out.println(-1);
                    } else {
                        System.out.println(2);
                    }
                } else {
                    if (det < 0) {
                        System.out.println(-1);
                    } else if (det == 0) {
                        System.out.println(0);
                    } else {
                        System.out.println(1);
                    }
                }
            } else {
                int det = firstCards.length() - secondCards.length();
                if (det < 0) {
                    System.out.println(-1);
                } else if (det == 0) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
            }
        }
    }
    public static void main1(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
            int count=a%2==0?2:1;
            int sum=0;
            while (func(a,count)<=func(a,a)){
                sum+=func(a,count);
                if(func(a,count)!=func(a,a)) {
                    System.out.print(func(a,count)+"+");
                }
                else{
                    System.out.print(func(a,count));
                }
                count+=2;
            }
        System.out.print("="+sum);
    }
}
