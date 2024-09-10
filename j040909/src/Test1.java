import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        String string1="1&B&C&D&A";

        char ch=string1.charAt(0);
        int sub=string1.indexOf("A",1);
        String string2=new String("1");

        System.out.println(string1.compareTo(string2));
        System.out.println(sub);
        System.out.println(string1.codePointAt(0));
        char char1=string1.charAt(0);//和字符串”1“并不相等
        System.out.println(char1);
        int a=Integer.valueOf(char1);
        System.out.println(string2.equals("1"));

        System.out.println(a+1);
        float float1=Float.parseFloat("1.1");
        System.out.println(float1+1);

        String string3="11122322213421121";//替换
        String temp=string3.replace("12","okkk");
        System.out.println(temp);
        String string4=string3.substring(3,8);
        System.out.println(string4);

        String[] StringArr=string1.split("&",22);//分割
        for(String x:StringArr){
            System.out.println(x);
        }
        Scanner scanner=new Scanner(System.in);
    }
}