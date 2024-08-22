package Package4;

public class Bird extends Animal {

    public void Fly() {
        System.out.println(name + "在飞");
    }

    public Bird(String name, int age, String color) {
        super(name, age, color);//super必须在第一行，对父类成员进行初始化
        //System.out.println("Bird.构造方法");
    }

    @Override
    public void Eat() {
        System.out.println(name + "在吃鸟粮");
    }

    public  void func5(){
        System.out.println(name+"飞");
    }
}
