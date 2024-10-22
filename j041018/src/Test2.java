import java.util.Scanner;

public class Test2 {
    public static int main(String firstCards,String lastCards) {
        return  1;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Y=scanner.nextInt();
        int M=scanner.nextInt();
        int D=scanner.nextInt();
        int X=scanner.nextInt();
        int February=((Y%4==0&&Y%100!=0)||(Y%400==0))?29:28;
        int sum=0;
        switch(M-1){
            case 11:sum+=30;
            case 10:sum+=31;
            case 9:sum+=30;
            case 8:sum+=31;
            case 7:sum+=31;
            case 6:sum+=30;
            case 5:sum+=31;
            case 4:sum+=30;
            case 3:sum+=31;
            case 2:sum+=February;
            case 1:sum+=31;
            default: sum+=D;
        }
        System.out.println((sum-(8-X))/7+1+((sum-(8-X))%7==0?0:1));
    }
}
