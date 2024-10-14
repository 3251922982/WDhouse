import java.util.ArrayList;
import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int det=0;
        ArrayList<Integer> integers=new ArrayList<>();
        while(in.hasNextInt()){
            det++;
            int int1=in.nextInt();
            integers.add(int1);
            if(det==num) break;
        }
        //0下标
        int sum1=integers.get(1);
        int det1=1;
        while (det1<integers.size()-2){
            int min=integers.get(det1+1)<=integers.get(det1+2)?integers.get(det1+1):integers.get(det1+2);
            det1=integers.get(det1+1)<=integers.get(det1+2)?(det1+1):(det1+2);
            sum1+=min;
        }
        int sum2=integers.get(0);
        int det2=0;
        while (det2<integers.size()-2){
            int min=integers.get(det2+1)<=integers.get(det2+2)?integers.get(det2+1):integers.get(det2+2);
            det2=integers.get(det2+1)<=integers.get(det2+2)?(det2+1):(det2+2);
            sum2+=min;
        }

        System.out.println(sum1>=sum2?sum2:sum1);

    }
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=in.nextInt();
        int det=0;
        String str1=in.next();
        //in.nextLine();
        String str2=in.next();
        if(str1==null||str2==null){
            System.out.println(-1);
            return;
        }
        ArrayList<String> strs=new ArrayList<>();
        in.nextLine();
        while(in.hasNextLine()){
            det++;
            String strN=in.nextLine();
            strs.add(strN);
            if(det==sum) break;
        }
        ArrayList<Integer> arrayList1=new ArrayList<>();
        ArrayList<Integer> arrayList2=new ArrayList<>();
        ArrayList<Integer> arrayList3=new ArrayList<>();

    for(int i=0;i<strs.size();i++){
        if(strs.get(i).equals(str1)){
            arrayList1.add(i);
        }
        if(strs.get(i).equals(str2)){
            arrayList2.add(i);
        }
    }
    if(arrayList1.size()==0||arrayList2.size()==0){
        System.out.println(-1);
        return;
    }
//    int ai=0,bi=0,ci=0;
//    while (ai<arrayList1.size()&&bi<arrayList2.size()) {
//        if (arrayList1.get(ai) < arrayList2.get(bi)) {
//            arrayList3.add(arrayList1.get(ai));
//            ai++;
//        } else {
//            arrayList3.add(arrayList2.get(bi));
//            bi++;
//        }
//    }
//    while (ai<arrayList1.size())  {
//        arrayList3.add(arrayList1.get(ai));
//        ai++;
//    }
//    while (bi<arrayList2.size())  {
//        arrayList3.add(arrayList2.get(bi));
//        bi++;
//    }
//    int dest=10001;
//    for(int i=0;i<(arrayList3.size()-1);i++){
//        int newInt=arrayList3.get(i+1)-arrayList3.get(i);
//        dest=newInt<dest?newInt:dest;
//    }
//    System.out.println(dest);

    int dest=10001;
    for(int i=0;i<arrayList1.size();i++){
        //int newDest = Math.abs(arrayList1.get(i) - arrayList2.get(j));
    }
    System.out.println(dest);

    }
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        // while (in.hasNextInt()) { // 注意 while 处理多个 case
        //     int a = in.nextInt();
        //     int b = in.nextInt();
        //     System.out.println(a + b);
        //}
        float a=in.nextFloat();
        float a1=a-1;
        char b=in.next().charAt(0);
        String str=""+b;
        int money=20;
        while (a1>0){
            money++;
            a1--;
        }
        if(str.equals("y")){
            money+=5;
        }
        System.out.println(money);
    }
}
