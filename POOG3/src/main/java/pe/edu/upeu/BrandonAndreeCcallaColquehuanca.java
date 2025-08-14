/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SOFTWARE
 */
public class BrandonAndreeCcallaColquehuanca {
    
    static class Persona {  // Cambié a mayúscula para seguir la convención de Java
        String nombre;
        double nota;

        // Constructor
        public Persona(String nombre, double nota) {
            this.nombre = nombre;
            this.nota = nota;
        }

        // Método toString para imprimir los detalles
        @Override
        public String toString() {
            return "Nombre: " + nombre + ", Nota: " + nota;
        }
    }
    
    public static void main(String[] args) {
        List<Persona> p = new ArrayList<>();  // Corregido la declaración de la lista

        // Añadiendo personas a la lista
        p.add(new Persona("David", 16));
        p.add(new Persona("Juan", 16));
        p.add(new Persona("Pedro", 20));
        p.add(new Persona("Raul", 16));
                
        // Imprimiendo los datos de cada persona
        for (Persona persona : p) {
            System.out.println(persona);  // Esto imprimirá el resultado del método toString
        }
    }
}
