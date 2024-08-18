import java.util.Arrays;
import java.util.Scanner;

public class text1 {
    public static int add(int a,int b) {;
        return a>b?a:b;
    }

    public  static int add(int a,int b,int c){
        int max=add(a,b);
        return max>c?max:c;
    }

    public static double add(double x,double y){
        return x+y;
    }


    public static boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if (year % 4 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void print(int...k){//可变参数编程
        for(int i=0;i<k.length;i++){
            System.out.println(k[i]+"");
        }
        System.out.println();
    }

    //递归阶乘
    public static int fac(int z){
        if(z==1){
            return 1;
        }
        else{
            return z*fac(z-1);
        }
    }
    //连续n个数阶乘和
    public static int facSum(int z){
        if(z==1){
            return 1;
        }
        else{
            return fac(z)+facSum(z-1);
        }
    }


    //递归顺序打印
    public static void seqPrint(int a){
        if(a/10==0){
            System.out.println(a);
            return;
        }
        else{
            seqPrint(a/10);
            System.out.println(a%10);
        }
    }

    //数字每位和
    public static int sum(int a){
        if(a/10==0){
            return a;
        }
        else{
            return a%10+sum(a/10);
        }
    }

    //斐波拉契数列
    public static int fs(int a){
        if(a==1||a==2){
            return 1;
        }
        else{
            return fs(a-1)+fs(a-2);
        }
    }

    public static int sum1(int a){
        if(a==1){
            return 1;
        }
        else{
            return a+sum1(a-1);
        }
    }


    //汉洛塔
    //模拟移动
    public static void move(char a,char b) {
        System.out.print(a+"->"+b+" ");
    }
    public static void hnt(int n,char pos1,char pos2,char pos3) {
        if(n==1){
            move(pos1,pos3);
        }
        else{
            hnt(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hnt(n-1,pos2,pos1,pos3);
        }
    }


    public  static void arrPrint(int[] arr){
        arr[0]=99;//传入的实参0地址处数值将会被修改
    }


    public  static int[] test(){
        int ret[]=new int[]{1,2,3};
        return ret;
    }

    //我的数组转字符串
    public  static  String myToString(int[] array){
        String str="[";
        for(int i=0;i<array.length;i++){
            if(i!=(array.length)-1){
                str=str+array[i]+',';
            }
            else{
                str=str+array[i]+"]";
            }
        }
        return str;
    }

    //数组copy
    public static int[] copy1(int[] array){
        int[] copy=new int[array.length];
        for(int i=0;i< array.length;i++){
            copy[i]=array[i];
        }
        return copy;
    }

    //二分查找
    public  static  int mybinarysearch(int[] arr,int key){
        int left=0;
        int right=arr.length-1;
        int mid;
        while(left<right){
            mid=(left+right)/2;
            if(key<arr[mid]){
                right=mid-1;
            }
            else if(key>arr[mid]){
                left=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    //冒泡排序
    public static void bubleSort(int[] array){
        for(int i=1;i<array.length;i++){
            for(int j=0;j<array.length-i;j++){
                if(array[j+1]>array[j]){
                    int tmp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=tmp;
                }
            }
        }
    }


    public static void main(String[] args) {
//        int a=1,b=2,c=4;
//        double x=2.0,y=3.0;
//        System.out.println(add(a,b));
//        //System.out.println(add(x,y));
//        System.out.println(add(a,b,c));
//        //print(1,2,3,4,5,6,7,8);
//        System.out.println(fac(c));
//        //seqPrint(123468643);
//        System.out.println(sum(1234));
//        System.out.println(fs(3));
//        System.out.println(sum1(4));
//        System.out.println(facSum(1));
//        hnt(3,'a','b','c');

        int[] arr={1,2,3,4,5,6,10,8,9,7};//int[]相当于是数据类型
        int[]  arr2=new int[]{1,2,3,4,5};//静态初始化
        int[] arr3=new int[10];//动态初始化，默认初始化全为0；

        //非简写形式可分两步进行
        int[] arr4;
        arr4=new int[]{1,8,7,9,5,4,3,2,1};

        int[] arr5;
        arr5=new int[10];

        boolean[] bool;
        bool=new boolean[10];

//        System.out.println(arr[1]);
//        System.out.println(arr.length);
//        //通过下标打印
//        for(int i=0;i<arr.length;i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        //for each遍历
//        for(int x:arr){
//            System.out.print(x+" ");
//        }
//        System.out.println();

        //调用库方法Arrays中的数组打印方法
//        String ret= Arrays.toString(bool);
//        System.out.println(ret);
//        System.out.println(arr);
//        int[] arr7=null;
//        System.out.println(arr7);
//        arrPrint(arr);
//        String ret1=Arrays.toString(arr);
//        System.out.println(ret1);
//

        System.out.println(myToString(arr2));
        int[] copy=copy1(arr);
        System.out.println(myToString(copy));

        //Arrays提供了系列copy方法
        int[] copy2=Arrays.copyOf(arr,2*arr.length);//可扩容
        int[] copy3=Arrays.copyOfRange(arr,0,arr.length);//左闭又开
        int[] copy4=new int[arr.length];
        System.arraycopy(arr,0,copy4,0,arr.length);
        System.out.println(myToString(copy2));
        System.out.println(myToString(copy3));
        System.out.println(myToString(copy4));
        for(int x:arr){
            System.out.println(x);
        }
        System.out.println("5出现在"+"arr"+"下标为"+mybinarysearch(arr,5)+"的位置");
        //排序
        Arrays.sort(arr);
        System.out.println("7出现在"+"arr"+"下标为"+Arrays.binarySearch(arr,7)+"的位置");
        //数组比较
        System.out.println(Arrays.equals(arr,arr2));
        //数组填充不指定就全部填充
        Arrays.fill(arr2,1,3,2);
        System.out.println(Arrays.toString(arr2));
        bubleSort(arr4);
        System.out.println(Arrays.toString(arr4));


        //二维数组
        int[][] ar=new int[][]{{1,2,3,4},{5,6,7,8}};
        System.out.println(ar[0][2]);
    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextInt()) {
//            int year = sc.nextInt();
//            if (isLeapYear(year) == true) {
//                System.out.println("1");
//            } else {
//                System.out.println("0");
//            }
//        }
//    }
}
