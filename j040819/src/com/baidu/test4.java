/*
 * Copyright (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.baidu;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        {
            System.out.println("普通代码块");
        }
        Student student1=new Student("zhangSan",20);
        Student student2=new Student("liSi",20);
        Student.classRoom="402";//classRoom由static修饰属于静态变量，所有对象共享，直接用类名.进行访问
        student1.show();
        student2.show();
        student1.staticFunc();
        student2.staticFunc();
        System.out.println(student1.toString());
    }
}
