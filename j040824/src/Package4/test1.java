package Package4;
//import  java.util.Arrays;

import java.util.Arrays;

public class test1 {
    public static  void bubbleSort(Comparable[] o){
        for(int i=0;i<o.length-1;i++){
            for(int j=0;j<o.length-1-i;j++){
                if(o[j].compareTo(o[j+1])>0){
                    Comparable tmp=o[j];
                    o[j]=o[j+1];
                    o[j+1]=tmp;
                }
            }
        }
    }

    public static  void bubbleSort2(Student[] o,AgeComparator ageComparator){//类似于实现sort方法
        for(int i=0;i<o.length-1;i++){
            for(int j=0;j<o.length-1-i;j++){
                if(ageComparator.compare(o[j],o[j+1])>0){
                    Student tmp=o[j];
                    o[j]=o[j+1];
                    o[j+1]=tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Student zhangSan=new Student("张三",20);
        Student liSi=new Student("李四",45);
        Student wangWu=new Student("王五",18);
        AgeComparator ageComparator=new AgeComparator();
        //Teacher teacherWang=new Teacher("王老师",56);
        Student[] students=new Student[]{zhangSan,liSi,wangWu};


//        bubbleSort(students);
//        System.out.println(Arrays.toString(students));
//
//        bubbleSort2(students,ageComparator);
//        System.out.println(Arrays.toString(students));
        Arrays.sort(students,ageComparator);//sort会调用类AgeComputer中的比较方法
        System.out.println(Arrays.toString(students));



    }
}
