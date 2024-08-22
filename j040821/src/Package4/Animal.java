package Package4;

public class Animal {

    public String name;
    public int age;
    public String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        //System.out.println("Animal构造方法");
    }

    public void play() {
        System.out.println(name + "在玩耍");
    }
    public void Eat() {
        System.out.println(name+"在。。。。。");
    }
}
