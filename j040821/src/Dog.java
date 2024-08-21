public class Dog extends Animal {
    public String name;
    static {
        System.out.println("Dog.static");
    }

    {
        System.out.println("Dog.{}");
    }




    public  Dog(String name ,int age,String color){
        super(name,age,color);//super必须在第一行，对父类成员进行初始化
        this.name=name;;//对子类成员初始化
        System.out.println("Dog.构造方法");
    }

//    public  Dog() {
//        super();//super必须在第一行，对父类成员进行初始化
//    }

    public void Eat(){
        System.out.println(super.name+"在吃饭");
    }

    public void Eat2(){
        System.out.println(name+"在吃饭");
    }

    public  void func1(){
        System .out.println("子类方法");
    }
    public void method(){
        //super.func1();
    }
}

