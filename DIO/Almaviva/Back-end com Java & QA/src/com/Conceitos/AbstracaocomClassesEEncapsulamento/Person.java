package com.Conceitos.AbstracaocomClassesEEncapsulamento;

public class Person {

    public static void main(String[] args) {

        var male = new MoldePerson();

        male.setName("João");
        male.setAge(12);

        var female = new MoldePerson();
        female.setName("Maria");
        female.setAge(10);

        System.out.println("Male name: " + male.getName() + "\nAge: " + male.getAge());
        System.out.println("Female name: " + female.getName() + "\nAge: " + female.getAge());
    }

}