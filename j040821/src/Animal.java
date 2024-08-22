public class Animal {

    public String name;
    public  int age;
    public String color;

    public Animal(String name ,int age,String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        System.out.println("Animal构造方法");
    }

    static{
        System.out.println("Animal.static");
    }

    {
        System.out.println("Animal.{}");
    }


    public  void func1(){
        System .out.println("父类方法");
    }
}
