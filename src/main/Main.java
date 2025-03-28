/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.Dog;
import core.Cat;
import core.Person;

/**
 *
 * @author jprietod
 */
public class Main {

    public static void main(String[] args) {
        Person persona1 = new Person(1, "Juan",19);
        System.out.println(persona1);
        
        Dog dog = new Dog("Oscar", 2, "Canino", "Juan");
        System.out.println(dog);

        Cat cat = new Cat("Rayas", 2, "Felino", "Oscuro", null, 0);
        System.out.println(cat);
    }

}
