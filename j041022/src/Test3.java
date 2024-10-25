import java.util.*;
public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m,s;
        n=sc.nextInt();
        m=sc.nextInt();
        s=Test3.fun(m,n);
        System.out.println(s);
    }
    public   static int fun(int n,int m) {
        int sum =0;
        for (int i =m;i<=n;i++){
            int x=1;
            for (int j =2;j<i;j++){
                if (i%j==0) {
                    x = 0;
                    break;
                }
            }
            if (x==1){
                sum = sum+i;
            }
        }
        return  sum;
    }
}


