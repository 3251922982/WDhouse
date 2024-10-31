
import java.util.Arrays;
import java.util.Scanner;
public class test {

        public int maxArea(int[] height) {
            int n=height.length;
            int left=0;
            int right=n-1;
            int volume=0;
            // int[] ints=new int[]{1,2,3,4,5};
            while (left<right){
                int tall=height[left]>=height[right]?height[right]:height[left];
                int newV=(right-left)*tall;
                volume=newV>=volume?newV:volume;
                if(tall==height[left]){
                    left++;
                }
                else {
                    right--;
                }
            }
            return volume ;
        }

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int n= scanner.nextInt();
            int target= scanner.nextInt();
            int[] nums=new int[n];
            for(int i=0;i<n;i++){
                nums[i]=scanner.nextInt();
            }
            Arrays.sort(nums);
            int left=0;
            int right=n-1;
            while (left<right){
                int  sum=nums[right]+ nums[left];
                if(sum>target) right--;
                else if (sum<target) left++;
                else{
                    System.out.println("["+nums[left]+","+nums[right]+"]");
                    return;
                }
            }
            System.out.println("null");
        }

        public static void main2(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int n= scanner.nextInt();
            int[] nums=new int[n];
            for(int i=0;i<n;i++){
                nums[i]=scanner.nextInt();
            }
            Arrays.sort(nums);
            int sum=0;
            if(nums.length<=2) {
                System.out.println(-1);
                return;
            }
            for(int i=n-1;i>=2;i--){
                int left=0;
                int right=i-1;
                while (left!=right){
                    if(nums[left]+nums[right]>nums[i]) {
                        sum += right - left;
                        right--;
                    }
                    else {
                        left++;
                    }
                }

            }
            System.out.println(sum);
        }
        public static void main1(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int n= scanner.nextInt();
            int[] height=new int[n];
            for(int i=0;i<n;i++){
                height[i]=scanner.nextInt();
            }
            int left=0;
            int right=n-1;
            int volume=0;
            while (left<right){
                int tall=height[left]>=height[right]?height[right]:height[left];
                int newV=(right-left)*tall;
                volume=newV>=volume?newV:volume;
                if(tall==height[left]){
                    left++;
                }
                else {
                    right--;
                }
            }
            System.out.println(volume);
        }
    }

