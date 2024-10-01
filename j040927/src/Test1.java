import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4,5,6,7};
        int k=3;
        int length=nums.length;
        int k1=k%length;
        int[] ints=new int[length];
        for(int i=0;i<length;i++){
            ints[(i+k1)%(length)]=nums[i];
        }
        for(int i=0;i<length;i++){
            nums[i]=ints[i];
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main1(String[] args) {
        int[] nums=new int[]{3,0,1,2,5};
        int length=nums.length;
        int sum=0;
        for(int i=0;i<=length;i++){
            if(i!=length){
                sum=sum+i-nums[i];
            }
            else{
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
