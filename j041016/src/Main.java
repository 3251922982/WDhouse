import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import  java.math.*;

public class Main {
//    public static int func(int n) {
//        if(n==2||n==1) return
//    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        String str=""+a;

        System.out.println(a);
        }
        public static void main4(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int in=scanner.nextInt();
        float sum=0;
        for(int i=1;i<in;i++){
            float tmp=0;
            tmp=tmp+i;
            float f=tmp/(i+1);
            f*=(i%2==0?1:-1);
            sum+=f;
        }
        sum++;
        System.out.printf("%.2f",sum);
    }
    public static void main3(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int in=scanner.nextInt();
        int det=1;
        if(in>1){
            for(int i=2;i<=Math.sqrt(in);i++){
                if(in%i==0){
                    det=0;
                    break;
                }
            }
        }
        else det=0;
        if(det==1) System.out.println("yes");
        else  System.out.println("no");
    }
    public static void main2(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int in=scanner.nextInt();
        for(int i=1;i<=in;i++){
            if(in%i==0){
                if(i!=in) System.out.print(i+",");
                else System.out.print(i);
            }
        }
    }
    public  static int getValue(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        return result;
    }
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str=in.nextLine();
        String strReturn="";
        String[] strings;
        strings=str.split(" ");
        for(String x:strings){
            String str1=x.toUpperCase(Locale.ROOT);
            strReturn+=str1.charAt(0);
        }
//        while (in.hasNextLine()){
//            String str=in.next();
//            if(str=="")break;;
//            String str1=str.toUpperCase(Locale.ROOT);
//            System.out.println(str1);
//            strReturn+=str1.charAt(0);
//        }
        System.out.println(strReturn);
        System.out.println(getValue(2));
    }
}
