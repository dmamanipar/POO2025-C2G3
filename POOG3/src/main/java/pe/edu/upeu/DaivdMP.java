/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu;

import java.util.ArrayList;
import java.util.List;

public class DaivdMP {
    
    
    static class Persona{
        String nombre;
        double nota;

        public Persona(String nombre, double nota) {
            this.nombre = nombre;
            this.nota = nota;
        }    
    }
    
    public static void main(String[] args) {
        List<Persona> p=new ArrayList<>();
        p.add(new Persona("David", 15));
        p.add(new Persona("Pedro", 15));
        p.add(new Persona("Juan", 20));
        p.add(new Persona("Raul", 16));
        System.out.println("Holas");
        for (Persona persona : p) {
            System.out.println(persona.nombre+"\t"+persona.nota);
        }
        
    }
}
