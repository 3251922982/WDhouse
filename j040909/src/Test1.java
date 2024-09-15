import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static int onlyOne(int[] nums) {
        if(nums==null) return 0;
        int length=nums.length;
        int i;
        int det=1;
        for(i=0;i<length;i++) {
            if (nums[i] == nums[0]&&i!=0) {
                det = 0;
            }
        }
        if (det == 1) return  nums[0];
        det=1;
        for(i=0;i<length;i++) {
            if (nums[i] == nums[length-1]&&i!=(length-1)) {
                det = 0;
            }
        }
        if (det == 1) return  nums[length-1];
        det=1;
        int det1=1,det2=1;
        for(i=1;i<length-1;i++){
            det1=1;
            det2=1;
            for(int j=0;j<i;j++){
                if(nums[j]==nums[i]){
                    det1=0;
                }
            }
            for(int j=i+1;j<length;j++){
                if(nums[j]==nums[i]){
                    det2=0;
                }
            }
            if(det1==1&&det2==1) return nums[i];
        }



        return 0;
    }


    public static int lostLength(String string){
        if(string==null) return 0;
        String[] strings=string.split(" ");
        int sum=strings.length;
        return strings[sum-1].length();

    }

    public static void main(String[] args) {
        String string1="1&B&C&D&A";

        char ch=string1.charAt(0);
        int sub=string1.indexOf("A",1);
        String string2=new String("1");

        System.out.println(string1.compareTo(string2));
        System.out.println(sub);
        System.out.println(string1.codePointAt(0));
        char char1=string1.charAt(0);//和字符串”1“并不相等
        System.out.println(char1);
        int a=Integer.valueOf(char1);
        System.out.println(string2.equals("1"));

        System.out.println(a+1);
        float float1=Float.parseFloat("1.1");
        System.out.println(float1+1);

        String string3="11122322213421121";//替换
        String temp=string3.replace("12","okkk");
        System.out.println(temp);
        String string4=string3.substring(0);
        System.out.println(string4);

        String[] StringArr=string1.split("&",22);//分割
        for(String x:StringArr){
            System.out.println(x);
        }
        Scanner scanner=new Scanner(System.in);
        Long start=System.currentTimeMillis();
        StringBuilder stringBuilder=new StringBuilder("1");
        String string5=new String("1");
        //Long start=System.currentTimeMillis();
        for(int i=0;i<10;i++){
            string5+="1";//速度慢
        stringBuilder.append("1");//速度快
        }
        Long end=System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println(stringBuilder);
        System.out.println(string5);
        int[] ints=new int[]{1,2,3,4,5};
        System.out.println(ints.length);
        System.out.println(lostLength("aa sss www qqqqqqqq"));
        System.out.println(onlyOne(new int[]{1,2,3,4,1,4,2}));
//        int[] ints1=new int[]{1,2,3,4,5};
//        System.out.println(ints1.length);
//        System.out.println(string1.length());

    }
}