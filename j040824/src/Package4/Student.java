package Package4;

public class Student implements Comparable<Student> {
    public  String name;
    public int age;
    public  int compareTo(Student o){
        return this.age-o.age;
    }

     public  Student(String name,int age){
         this.name=name;
         this.age=age;
     }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



}
