import java.util.Random;
import java.util.Scanner;
public class test1 {


    public static int add(int a,int b) {
    int ret=a+b;
    return ret;
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


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int year = sc.nextInt();
            if (isLeapYear(year) == true) {
                System.out.println("是闰年");
            } else {
                System.out.println("不是闰年");
            }
        }
    }
}




//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        //0000 0010
//        for (int i = 31; i >= 1 ; i-=2) {
//            System.out.print(((n>>>i) & 1) + " " );
//        }
//        System.out.println();
//        for (int i = 30; i >= 0 ; i-=2) {
//            System.out.print(((n>>>i) & 1) + " " );
//        }
//    }
//
//}
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        while(in.hasNextInt()) {//循环输入
//            int det = 1;
//            int a = in.nextInt();
//            int i;
//            for ( i = 2; i <= Math.sqrt(a); i++) {
//                if (a % i == 0) {
//                    break;
//                }
//            }
//            if (i>Math.sqrt(a)) {
//                System.out.println(a + "是素数");
//            }
//            else {
//                System.out.println(a + "不是素数");
//            }
//        }
//    }
//
//}
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        int a=in.nextInt();
//        int count = 0;
//        for (int i = 1; i <=a; i++) {
//            int tmp = i;
//            tmp = i;
//            while (tmp != 0) {
//                if (tmp % 10 == 9) {
//                    count=count+1;
//                }
//                tmp /= 10;
//            }
//        }
//        System.out.println("1到"+a+"一共出现了" + count + "个9");
//    }
//}



//    public static void main(String[] args) {
//        int count=3;
//        Scanner in =new Scanner(System.in);
//        while (count!=0){
//            System.out.println("请输入密码：");
//            String password=in.nextLine();
//            if(password.equals("1234567")) {
//                System.out.println("登录成功！");
//                break;
//            }
//            else{
//                count--;
//                if(count!=0) {
//                    System.out.println("密码错误请重新输入，你还有" + count + "次机会");
//                }
//                else{
//                    System.out.println("登录锁定");
//                }
//            }
//    }
//}



//    public static void main(String[] args) {
//        Scanner in =new Scanner(System.in);
//        while(in.hasNextInt()){//循环输入
//            int n=in.nextInt();
//            for(int i=0;i<=n;i++){
//                for(int j=0;j<=n;j++){
//                    if(i==j||(i+j)==n){
//                        System.out.print("*");
//                    }
//                    else{
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }
//        }
//  }

    //猜数字
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        生成随机数
//        Random random = new Random();
//        int randNum = random.nextInt(100);
//        int i=1;
//        System.out.println("请在0-100输入你猜的数字：");
//        while(true){
//            int n=sc.nextInt();
//            if(n<randNum){
//                System.out.println("猜小了!");
//            }
//            else if(n>randNum){
//                System.out.println("猜大了!");
//            }
//            else{
//                System.out.println("猜对了!");
//                System.out.println("一共猜了"+i+"次");
//                return;
//            }
//            i++;
//        }
//
//    }
//}
//    public static void main(String[ ] args)  {
//        int a=1,b=11;
//        a=a++;,
//        System.out.println(a);
//        int sum=10;
//        sum%=3;
//        System.out.println(sum==1.0&&a==2);
//        System.out.println(a==1 || 10/2==10);
//
//        a=4;
//        System.out.println(~b);
//       System.out.println(b<<2);
//        System.out.println(b>>>1);
//        int max=a>b?a:b;
//        System.out.println(max);

//        判断奇偶
//        Scanner scan =new Scanner(System.in);
//        int a=scan.nextInt();

//        if(a%2==0){
//            System.out.println(a+"是偶数");
//        }
//        else{
//            System.out.println(a+"是奇数");
//        }
//

        //判断闰年
//        Scanner scan1 =new Scanner(System.in);
//        int year= scan1.nextInt();
//        if(year%100==0){
//            if(year%400==0){
//                System.out.println(year+"是闰年");
//            }
//            else{
//                System.out.println(year+"不是闰年");
//            }
//        }
//        else{
//            if(year%4==0){
//                System.out.println(year+"是闰年");
//            }
//            else{
//                System.out.println(year+"不是闰年");
//            }
//        }
//
//
//        switch(year){
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            default:
//                System.out.println("输入有误");
//        }


//求阶乘和
//        int i=1,j=1;
//        int sum=0;
//        int fact=1;
//        while(i<=a){
//            j=1;
//            fact=1;
//            while(j<=i){
//                fact*=j;
//                j++;
//            }
//            sum+=fact;
//            i++;
//        }
//        System.out.println(sum);

//    int i=1;
//    while(i<=100){
//        if(i%6==0){
//            System.out.println(i);
//            i++;
//            continue;
//        }
//        i++;
//    }

//        Scanner sc =new Scanner(System.in);
//        System.out.println("输入年龄：");
//        int age=sc.nextInt();
//        sc.nextLine();
//        System.out.println("输入姓名：");
//        //String name=sc.nextLine();
//        String name=sc.nextLine();
//        System.out.println("输入工资：");
//        float money=sc.nextFloat();
//
//        System.out.println(age);
//        System.out.println(name);
//        System.out.println(money);


        //水仙花
//        Scanner scan =new Scanner(System.in);
//        int a=scan.nextInt();
//        for(int i=1;i<999999;i++){
//            int tmp=i;
//            int count=0;
//            while(tmp!=0){
//                count++;
//                tmp/=10;
//            }
//            int sum=0;
//            tmp=i;
//            while(tmp!=0){
//                sum+=Math.pow(tmp%10,count);
//                tmp/=10;
//            }
//             if(sum==i){
//                 System.out.println(i+"是水仙花数！！");
//             }
//
//        }


//    }
//}
