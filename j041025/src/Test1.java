import java.util.Arrays;
 public class Test1 {
    public static void main(String[] args) {
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
