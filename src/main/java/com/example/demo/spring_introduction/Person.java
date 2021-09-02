package com.example.demo.spring_introduction;

public class Person {
  private Pet pet;
  private String surname;
  private int age;

  //  public Person(Pet pet) {
//    this.pet = pet;
//    System.out.println("Bean Person is created");
  public Person() {
    System.out.println("Bean Person is created");
  }

  public void setPet(Pet pet) {
    System.out.println("Class Person: set pet");
    this.pet = pet;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
    System.out.println("Class Person: set surname "+ this.surname);
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
    System.out.println("Class Person: set age "+this.age);
  }

  public void callYourPet() {
    System.out.println("Hello, my lovely Pet!");
    pet.say();
  }
}
