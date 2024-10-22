import java.math.*;
import java.util.ArrayList;
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
    public static void main5(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = 1;
        int y=3;
        int index = 0;
        for(int k = 1; k<=n; k++){
            for(int j = 1; j<=n; j++){
                int sum=0;
                for(int i=1; i<=n; i++){
                    if(i==x||i==y){
                        sum = sum+(i+1) * i;
                        i++;
                    }else{
                        sum = sum +i;
                    }
                }
                if(sum==m){
                    System.out.println(x+","+y);
                    index++;
                }
                y++;
            }
            x++;
            y = x+2;
        }
        if(index==0){
            System.out.println("0");
        }





    }
    public static void main4(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i = 9; i >0 ; i--) {
            n=(n+1)*2;
        }
        System.out.println(n);
    }

    public static void main6(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        String str=Math.abs(n)+"";
        String str2="02468";
        while (!str.equals("123")){
            int even=0;
            for(int i=0;i<str.length();i++){
                for(int j=0;j<=4;j++){
                    if(str.charAt(i)==str2.charAt(j)){
                        even++;
                        break;
                    }
                }
            }
            sum++;
            str=even+""+(str.length()-even)+""+str.length();
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int sum=0;
        for(int i=m;i>=0;i--){
            for(int j=m;j>=0;j--){
                for(int k=0;k<=m;k+=3){
                    if(((i*5+j*3+k/3)==n)&&((i+k+j)==m)){
                        System.out.println(i+","+j+","+k);
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
    }

    public static void main1(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float h=scanner.nextFloat();
        System.out.printf("%.2f",func(h,1));
        System.out.println();
        System.out.print(String.format("%.2f",h/Math.pow(2,10)));
    }
}
