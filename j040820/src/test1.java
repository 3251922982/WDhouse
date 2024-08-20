
import java.util.Arrays;
import java.util.Scanner;
public class test1 {
    public  static int[] twoSum(int[] nums, int target) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i< nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int[]  Sum={-1,-1};
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    Sum[0]=i;
                    Sum[1]=j;
                    return Sum;
                }
            }
        }
        return Sum;
    }

    public static void main(String[] args) {
        int[] num=new int[5];
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        //System.out.println(Arrays.toString(twoSum(num,target)));



    }
}
