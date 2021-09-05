package com.example.demo.spring_introduction;

public class Dog implements Pet {
  private String name;

  public Dog() {
    System.out.println("Bean Dog is created");
  }

  @Override
  public void say() {
    System.out.println("Bow-Waw");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
