/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.List;

/**
 *
 * @author jprietod
 */
public class Cat {
    private String name;
    private int age;
    private String race;
    private String color;
    private List<String> gustos; 
    private int numeroVidas;

    public Cat(String name, int age, String race, String color, List<String> gustos, int numeroVidas) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.color = color;
        this.gustos = gustos;
        this.numeroVidas = numeroVidas;
    }
    
    
}
