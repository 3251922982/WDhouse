import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        int[] arr={0,0,0,0,0,0,0};
        int dest=-1;
        int cur=0;

        while(cur!=arr.length){
            if(arr[cur]==0){
                cur++;
            }
            else{
                int tmp=arr[dest+1];
                arr[dest+1]=arr[cur];
                arr[cur]=tmp;
                dest++;
                cur++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
