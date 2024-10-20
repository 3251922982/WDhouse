import java.math.*;
import java.util.Scanner;
public class Main {
    public static float func(float h,int count){
        if(count!=10){
            return h+h/2+func(h/2,count+1);
        }
        else {
            return h;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float h=scanner.nextFloat();
        System.out.printf("%.2f",func(h,1));
        System.out.println();
        System.out.print(String.format("%.2f",h/Math.pow(2,10)));
    }
}
