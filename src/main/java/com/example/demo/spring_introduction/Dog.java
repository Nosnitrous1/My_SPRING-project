package com.example.demo.spring_introduction;

public class Dog implements Pet {
    public Dog() {
    System.out.println("Bean Dog is created");
  }

  @Override
  public void say() {
    System.out.println("Bow-Waw");
  }
}
