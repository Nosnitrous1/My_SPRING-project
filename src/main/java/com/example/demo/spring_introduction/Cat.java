package com.example.demo.spring_introduction;

public class Cat implements Pet {
  public Cat() {
    System.out.println("Bean Cat is created");
  }

  public void say() {
    System.out.println("Meaw-meaw");
  }
}
