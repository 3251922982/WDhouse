import  java.util.Arrays;//Arrays在util包中
import java.util.*;
import java.sql.*;
public class test1 {//test1是类名

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.color="黑色";
        dog.name="小黑";
        int[] arr =new int[2];

        Date day=new Date("04","08","20");
         Date day2=new Date();
        //day.setday("04","08","19");
        //day2.setday("03","08","19");
        System.out.println(day2.day);
        System.out.println(day.moth);
        System.out.println(day.getYear());
    }
}
