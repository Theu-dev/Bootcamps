package com.Conceitos.AbstracaocomClassesEEncapsulamento.Records;

public class ModelPerson {

    public static void main(String[] args) {

        var person = new Person("João", 12);

        System.out.println(person);
        System.out.println(person.name());
    }
}
