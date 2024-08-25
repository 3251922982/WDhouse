package Package5;

import java.util.concurrent.Callable;

public class Person implements Cloneable {
    public  String name;
    public  Money money=new Money(9);

    public  Person(String name){
        this.name=name;
    }

    protected Object clone()//重写实现深克隆
            throws CloneNotSupportedException{//下面有克隆
            Person tmp=(Person) super.clone();//浅克隆
            tmp.money=(Money) this.money.clone();//在浅克隆基础上深克隆
            return tmp;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", money.money=" + money.money +
                '}';
    }

}
