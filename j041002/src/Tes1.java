import java.util.*;

public class Tes1 {
    public static List<List<Integer>> func(int cols) {
        List<List<Integer>> lists=new ArrayList<>(cols);
        ArrayList<Integer> arrayList0=new ArrayList<>();
        arrayList0.add(1);
        lists.add(arrayList0);
        ArrayList<Integer> arrayList1=new ArrayList<>(2);
        arrayList1.add(1);
        arrayList1.add(1);
        lists.add(arrayList1);
        for(int i=2;i<cols;i++){
            ArrayList<Integer> tmp=new ArrayList<>(i+1);
            tmp.add(1);
            for(int j=1;j<i;j++){
                int add1=lists.get(i-1).get(j-1);
                int add2=lists.get(i-1).get(j);
                tmp.add(add1+add2);
            }
            tmp.add(1);
            lists.add(tmp);
        }
        return  lists;
        }

    public static void main(String[] args) {
//        ArrayList<String> arrayList=new ArrayList<>();
//        arrayList.add("1");
//        arrayList.add("2");
//        arrayList.add("3");
//        ArrayList<String> arrayList1=new ArrayList<>(arrayList);
//        ArrayList<Integer> arrayList3=new ArrayList<>();
//        arrayList3.add(1);
//        System.out.println(Arrays.toString(arrayList3.toArray()));
//        for(String x:arrayList){
//            System.out.println(x);
//        }

        for(int i=0;i<10;i++) {
            System.out.println(Arrays.toString(func(10).get(i).toArray()));
        }
        }
}

