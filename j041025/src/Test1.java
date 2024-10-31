import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
     public static int sum(int a) {
         int sum=0;
         while (a!=0){
             sum+=(a%10)*(a%10);
             a=a/10;
         }
        return sum;
     }

     public static void main2(String[] args) {
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int fast=sum(sum(a));
         int slow=sum(a);
         //System.out.println(sum(100));
         //快慢指针类似于判断循环链表
         while (fast!=slow){
             slow=sum(slow);
             //System.out.print(slow+" ");
             fast=sum(sum(fast));
             //System.out.print(fast);
             //System.out.println();
         }
         if(fast==1&&slow==1)System.out.println("true");
         else System.out.println("false");

     }
    public static void main1(String[] args) {
        int[] arr={0,2,0,5};
        int dest=-1;
        int cur=0;
        int n=arr.length;
        //找到最后一个复写的数
        while(cur!=n){
            if(arr[cur]!=0) dest++;
            else dest+=2;
            if(dest>=n-1) break;
            cur++;
        }
        //无法复写最后一个数0
        if(dest==n){
            arr[n-1]=0;
            cur--;
            dest-=2;
        }
        //复写
        while(cur>=0){
            if(arr[cur]==0) {
                arr[dest]=0;
                arr[dest-1]=0;
                dest-=2;
            }
            else{
                arr[dest]=arr[cur];
                dest--;
            }
            cur--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
