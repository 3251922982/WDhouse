import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string1=scanner.nextLine();
        ArrayList<String > strings=new ArrayList<>();
        for(int i=97;i<=122;i++){
            char ch=(char)i;
            strings.add(ch+""+ch);
        }
        int det=1;
        while (det==1){
            for(int a=0;a<string1.length();a++){
                if(a==string1.length()-1){
                    det=0;
                    break;
                }
                if(string1.charAt(a)==string1.charAt(a+1)){
                    break;
                }
            }
            if(det==1){
                for(int i=0;i<26;i++){
                    string1=string1.replaceAll(strings.get(i),"");
                }
            }
        }
        System.out.println(string1);

    }
    public static void main2(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> newArrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> RArrayList = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(8);
        arrayList1.add(3);
        arrayList1.add(2);
        arrayList2.add(8);
        arrayList2.add(2);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(8);
        for (int i = 0; i < arrayList1.size(); i++) {
            int det = 1;
            for(int j=0;j<newArrayList1.size();j++){
                if(arrayList1.get(i)==newArrayList1.get(j)){
                    det=0;
                    break;
                }
            }
            if(det==1){
                newArrayList1.add(arrayList1.get(i));
            }
        }

        for (int i = 0; i < newArrayList1.size(); i++) {
            int det=0;
            for(int j=0;j<arrayList2.size();j++){
                if(newArrayList1.get(i)==arrayList2.get(j)){
                    det=1;
                    break;
                }
            }
            if(det==1) {
                RArrayList.add(arrayList1.get(i));
            }
        }
        System.out.println(RArrayList.size());
    }




    public static void main1(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str="";
        int L=scanner.nextInt();
        int R=scanner.nextInt();
        for(int i=L;i<=R;i++){
            str+=i;
        }
        int sum=0;
        for(int i=0;i<str.length();i++){
            if(str.codePointAt(i)==50){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
