package Package4;

public class Teacher implements Comparable<Teacher> {
    public String name;
    public int age;

    public  Teacher(String name,int age){
        this.name=name;
        this.age=age;
    }
    public int compareTo(Teacher o) {
        return this.age - o.age;
    }
}
