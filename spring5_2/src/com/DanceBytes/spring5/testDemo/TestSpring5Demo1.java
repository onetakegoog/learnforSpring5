package com.DanceBytes.spring5.testDemo;

import com.DanceBytes.spring5.autowire.Emp;
import com.DanceBytes.spring5.bean.Orders;
import com.DanceBytes.spring5.collectiontype.Book;
import com.DanceBytes.spring5.collectiontype.Course;
import com.DanceBytes.spring5.collectiontype.Stu;
import com.DanceBytes.spring5.facbean.MyBean;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 孟享广
 * @date 2020-11-09 4:57 下午
 * @description
 */
public class TestSpring5Demo1 {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.show();
    }
    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
//        book.show();
        System.out.println(book1);
        System.out.println(book2);
    }
        @Test
    public void test3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
         Course course = context.getBean("myBean", Course.class);
         System.out.println(course);
    }

    @Test
    public void test4(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("4. 创建bean对象是例子");
        System.out.println(orders);

        context.close();
    }

    @Test
    public void test5(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.show();
    }



}
