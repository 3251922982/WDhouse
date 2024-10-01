import java.util.*;

public class Main {
    public static void main(String[] args) {
        //模拟顺序表
//        MyArrayList myArrayList=new MyArrayList();
//        myArrayList.add(1);
//        myArrayList.add(2);
//        myArrayList.add(3);
//        myArrayList.add(2,666);
//        System.out.println(Arrays.toString(myArrayList.ints));
//        myArrayList.add(3,1);
//        System.out.println(Arrays.toString(myArrayList.ints));
//        myArrayList.remove(1);
//        System.out.println(Arrays.toString(myArrayList.ints));
//       //myArrayList.clear();
//        System.out.println(myArrayList);
        ArrayList<Integer> integers=new ArrayList<>(10);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println(integers.get(1));
        for(Integer x:integers){
            System.out.print(x+" ");
        }
        System.out.println();
        //迭代器1
        Iterator<Integer> It=integers.iterator();
        while (It.hasNext()){
            System.out.print(It.next()+" ");
        }
        System.out.println();
        //list迭代器
        ListIterator<Integer> integerListIterator=integers.listIterator();
        while (integerListIterator.hasNext()){
            System.out.print(integerListIterator.next()+" ");
        }
//        ArrayList<Long> longs=new ArrayList<>();
//        ArrayList<Character> characters=new ArrayList<>();
    }
    public static void main3(String[] args) {
        Scanner scan=new Scanner(System.in);
        long n=scan.nextLong();
        long sum=0;
        for(int i=1;i<n;i++){
            if((i&(n-i))==0){
                System.out.println(i);
                sum++;
            }
        }

        System.out.println(sum);

    }
    public static void main2(String[] args) {

        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        long a=scan.nextInt();
        long b=scan.nextInt();
        int x=scan.nextInt();
        long pow1=1;
        double pow2=Math.pow(10,x);
        for(int i=1;i<b;i++){
            pow1*=a;
            pow1=pow1%10000;
        }
        System.out.println((int) (pow1%pow2));

        scan.close();
    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string=scan.nextLine();
        //scan.nextLine();
        String string2=scan.nextLine();
        String newString="";
        int length=string2.length();
        for(int i=0;i<length;i++){
            int ascll=string2.codePointAt(i)-48;
            if(ascll>=0&&ascll<=9){
                newString+=string.charAt(ascll);
            }
            else{
                newString+=string2.charAt(i);
            }
        }
        System.out.println(newString.toString());
        scan.close();
    }
}