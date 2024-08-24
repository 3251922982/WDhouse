package Package4;

public class test1 {

    public static void func(Animal animal3){
        animal3.Eat();
    }

    public static Animal   func1(Animal animal4){
        return animal4;
    }
    public static void main(String[] args) {

        //向上转型1
        Animal animal=new Dog("小黑",22,"不知道啥颜色");//向上转型
        //animal.play();
        Animal animal2=new Bird("小飞",22,"不知道啥颜色");
        Animal animal3=new Animal("小黄",22,"不知道啥颜色");
        animal3.Eat();
        //animal2.Eat();
        //向下转型
//        if(animal instanceof  Dog){
//            Dog dog=(Dog) animal;
//            dog.func4();
//        }
//        else{
//            System.out.println("子类不匹配");
//        }
        //多态的运用，避免使用大量if，else,
        Animal[] animals={animal,animal2,animal3};
        for(Animal x:animals){
            x.Eat();
        }

//        Bird dog1=(Bird) animal;
//        dog1.func5();

        //2
//        func(new Dog("小白",22,"不知道啥颜色"));
//        func(new Dog("小黑子",22,"不知道啥颜色"));

        //3
//        func1(new Dog("小灰灰",22,"不知道啥颜色")).Eat();
//        func1(new Dog("大灰灰",22,"不知道啥颜色")).Eat();
    }
}


