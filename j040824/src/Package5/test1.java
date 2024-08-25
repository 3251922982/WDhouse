package Package5;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args)
            throws CloneNotSupportedException{
        Person person=new Person("张三");
        Person person2=(Person) person.clone();
        person.money.money=999;//浅克隆下，两者money都会被改变
        System.out.println(person);
        System.out.println(person2);
        //person.money.money=999;
    }
}
