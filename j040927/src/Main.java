import java.util.Scanner;
import  java.math.*;
public class Main {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            //在此输入您的代码...
            long a=scan.nextInt();
            long b=scan.nextInt();
            int x=scan.nextInt();
            double pow=Math.pow(a,b);
            double pow2=Math.pow(10,x);
        System.out.println((long) (pow%pow2));

            scan.close();
    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string=scan.nextLine();
        //scan.nextLine();
        String string2=scan.nextLine();
        String newString="";
        int length=string2.length();
        for(int i=0;i<length;i++){
            int ascll=string2.codePointAt(i)-48;
            if(ascll>=0&&ascll<=9){
                newString+=string.charAt(ascll);
            }
            else{
                newString+=string2.charAt(i);
            }
        }
        System.out.println(newString.toString());
        scan.close();
    }
}