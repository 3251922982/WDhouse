import java.sql.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    class InnerClass{
         public static  void func(){
            System.out.println("哈哈哈哈");
        }

    }

    public static void main(String[] args) {

        int[][] a=new int[2][];
        a[0]=new int[1];
        a[1]=new int[]{1,2,3,4,5,6,7,8};
        System.out.println(Arrays.deepToString(a));
        int b=1;
        System.out.println(~b);
        Scanner scan = new Scanner(System.in);
//        int c=scan.nextInt();
//        System.out.println(c);
        String str=scan.nextLine();

        System.out.println(str);

//        while(scan.hasNextLine()){
//
//        }
        Test1.InnerTest innerTest=new Test1().new InnerTest();

    }
}
