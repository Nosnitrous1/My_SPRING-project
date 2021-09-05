package com.example.demo.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext2.xml");
    Dog myDog = context.getBean("myPet", Dog.class);
    myDog.setName("Белка");

    Dog yourDog = context.getBean("myPet", Dog.class);
    yourDog.setName("Стрелка");
    System.out.println("myDog= " + myDog.getName());
    System.out.println("yourDog= "+ yourDog.getName());
    System.out.println("Переменные ссфлаются на один и тот же обэект" + (myDog==yourDog));
    System.out.println(myDog);
    System.out.println(yourDog);
    context.close();

  }
}
