package Package4;

public class Dog extends Animal {

    public Dog(String name, int age, String color) {
        super(name, age, color);//super必须在第一行，对父类成员进行初始化
        //System.out.println("Dog.构造方法");
    }

    public  void func4(){
        System.out.println(name+"啃骨头");
    }

    @Override
    public void Eat() {
        System.out.println(super.name + "在吃狗粮");
    }

}
