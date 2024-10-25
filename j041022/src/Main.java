import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ints=new int[n];
        for(int i=0;i<n;i++){
            ints[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int[] ints2=new int[n-1];
        int sum=0;
        for(int i=0;i<ints.length;i++ ){
            if(ints[i]!=a){
                ints2[sum]=ints[i];
                sum++;
            }
        }
        for(int i=0;i<n-1;i++){
            System.out.print(ints2[i]+" ");
        }
    }

    public static void fun(int[] ints) {
        int length=ints.length;
        for(int i=length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(ints[j]<ints[j+1]){
                    int tmp=ints[j];
                    ints[j]=ints[j+1];
                    ints[j+1]=tmp;
                }
            }
        }
    }


}


