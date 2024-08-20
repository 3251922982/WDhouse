/*
 * Copyright (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.baidu;

public class Student {
    public String name;
    public int age;
    public static String classRoom;


    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public Student(int age) {
        this.age = age;
    }


    public  void show(){
        System.out.println("姓名："+name+"  年龄："+age+"  上课教室："+classRoom);
    }

    public  static  void staticFunc(){
        System.out.println(classRoom);
        System.out.println("student");
    }

    {
        System.out.println("构造代码块");
    }

    static {
        System.out.println("静态代码块");
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
