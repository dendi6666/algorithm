package com.test;

import com.pojo.Employee;
import com.pojo.GenericCell;
import com.pojo.Person;
import com.pojo.Student;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {

    public static void main(String[] args) {
//        数组协变型可编译成功
//        Person [] arr = new Employee[10];
//        arr[0] = new Student();
//        System.out.println(arr[0]);


//        数组协变型    集合不具有协变型
//        Person [] arr = new Person[10];
//        Person [] arr2 = new Employee[10];
//        join(arr);
//        join(arr2);
//        ArrayList<Person> people = new ArrayList<>();
//        ArrayList<Student> students = new ArrayList<>();
//        join(people);
//        join(students);


//        因为集合不具有协变型是的灵活性缺少     因此引入通配符
//        ArrayList<Student> students = new ArrayList<>();
//        joinPlus(students);

        //泛型的使用范围
//        基本类型  static语境    泛型实例化   泛型数组实例化   参数化类型的数组(1.8已经不支持泛型数组)
//        GenericCell<String>[] genericCells = new GenericCell<String>[10];


    }

    public static void join(Person[] arr){
        System.out.println("ok");
    }

    public static void join(Collection<Person> list){
        System.out.println("ok");
    }

    public static  void joinPlus(Collection<? extends Person> list){
        System.out.println("ok");
    }


}
