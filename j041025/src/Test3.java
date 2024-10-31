import sun.applet.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Test3 {
    public static void fun(int[] ints) {
        int length=ints.length;
        for(int i=length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(ints[j]<ints[j+1]){
                    int tmp=ints[j];
                    ints[j]=ints[j+1];
                    ints[j+1]=tmp;
                }
            }
        }
    }

 static class MyLinked{
        int var;
        MyLinked next;
        MyLinked prev;
     public MyLinked(int var) {
         this.var = var;
     }
 }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int m=scanner.nextInt();
        int[][] ints=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ints[i][j] = scanner.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            int max=ints[i][0];
            int y=-1;
            for(int j=0;j<m;j++){
                if(ints[i][j]>=max) {
                    max=ints[i][j];
                    y=j;
                }
            }
            int det=1;
            for(int k=i;k<n;k++){
                if(ints[k][y]<max) {
                    det=0;
                    break;
                }
            }
            for(int k=i;k>=0;k--){
                if(ints[k][y]<max) {
                    det=0;
                    break;
                }
            }
            if(det==1){
                System.out.println(i+" "+y);
                break;
            }
            if(i==n-1){
                System.out.println(0);
            }
        }
    }

    public static void main11(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[][] ints=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ints[j][i] = scanner.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j!=n-1)
                System.out.print(ints[i][j]+" ");
                else System.out.print(ints[i][j]);
            }
            if(i!=n-1)
            System.out.println();
        }
    }

    public static void main8(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arrayList.add(a);
        }
        int m=sc.nextInt();
        arrayList.add(m);
        int[] ints= new int[arrayList.size()];
        for(int i=0;i<arrayList.size();i++){
            ints[i]=arrayList.get(i);
        }
        Arrays.sort(ints);
        for(int i=0;i<arrayList.size();i++){
            if(i!=arrayList.size()-1)
            System.out.print(ints[i]+" ");
            else System.out.print(ints[i]);
        }
    }
    public static void main10(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int m=sc.nextInt();
            int count=0;
            int s=0;
            int j=1;
            int i=0;
            int [] b=new int [n];
            while(s<n){
                if(b[i]==0) count++;
                if (count == m) {
                    s++;
                    count = 0;
                    b[i]=j++;
                }
                if (i == n - 1) i = -1;
                i++;
            }
            for(i=0;i<n;i++)
                if(i==0)
                    System.out.printf("%d",b[i]);
                else
                    System.out.printf(",%d",b[i]);
    }

    public static void main9(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        int[] ints=new int[n];
        MyLinked myLinked=new MyLinked(1);
        MyLinked head=myLinked;
        MyLinked cur=myLinked;
            for(int i=1;i<=n;i++){
                if(i==1){
                    myLinked.var=i;
                    myLinked.next=myLinked;
                    myLinked.prev=myLinked;
                } else if (i!=1) {
                    cur.next=new MyLinked(i);
                    cur.next.prev=cur;
                    cur=cur.next;
                    if(i==n){
                        cur.next=head;
                        head.prev=cur;
                    }
                }
            }
            MyLinked myLinked1=new MyLinked(666);
            myLinked1.next=head;
            cur=myLinked1;

            int sum=0;
            int det=0;
            while (det<n){
                sum++;
                cur=cur.next;
                if(sum==m){
                    ints[cur.var-1]=det+1;
                    cur.prev.next=cur.next;
                    cur.next.prev=cur.prev;
                    det++;
                    sum=0;
                }
            }
        for (int i = 0; i < ints.length; i++) {
            if(i!=ints.length-1)
            System.out.print(ints[i] + ",");
            else System.out.print(ints[i]);
        }
    }
//6,4,1,3,5,2
    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(i==0) arrayList.add(a);
            else {
                int det = 1;
                for (int j = 0; j < arrayList.size(); j++) {
                    if(a==arrayList.get(j)) {
                        det = 0;
                        break;
                    }
                }
                if(det==1) arrayList.add(a);
            }
        }
        System.out.println();
        for(int i=0;i<arrayList.size();i++){
            if(i!=arrayList.size()-1) {
                System.out.print(arrayList.get(i) + " ");
            }
            else {
                System.out.print(arrayList.get(i));
            }
        }
    }
    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = sc.nextInt();
        }
        int dest=-1;
        int cur=0;
        while (cur!=n){
            if(ints[cur]%2==0){
                cur++;
            }
            else {
                int tmp=ints[dest+1];
                ints[dest+1]=ints[cur];
                ints[cur]=tmp;
                dest++;
                cur++;
            }
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        int[] ints = new int[n];
        int[] ints2 = new int[m];
        int[] ints3 = new int[m+n];
        for (int i = 0; i < n; i++) {
            ints[i] = sc.nextInt();
            ints3[i]=ints[i];
        }
        for (int i = 0; i < m; i++) {
            ints2[i] = sc.nextInt();
            ints3[n+i]=ints2[i];
        }
        Arrays.sort(ints3);
        for (int i = 0; i < ints3.length; i++) {
            System.out.print(ints3[i] + " ");
        }
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList=new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
           linkedList.addLast(a);
        }
        int a= sc.nextInt();
       LinkedList cur=linkedList;
        for(int i=n-1;i>0;i++){


            }


    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = sc.nextInt();
        }
        int a= sc.nextInt();
        String strA = a + "";
        String str = Arrays.toString(ints);
        int[] ints2 = new int[n+1];
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != a) {
                ints2[sum] = ints[i];
                sum++;
            }
        }
        for (int i = 0; i < ints2.length; i++) {
            System.out.print(ints2[i] + " ");
        }
    }
}

