package com.example.demo.spring_introduction;

public class Person {
  private  Pet pet;

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

  public void callYourPet() {
    System.out.println("Hello, my lovely Pet!");
    pet.say();
  }
}
