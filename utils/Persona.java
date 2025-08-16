/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.empresa.utils;

public class Persona {
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    private double talla;

    public Persona(String nombre, String apellidos, String dni, int edad, double talla) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.talla = talla;
    }

    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public String getDni() { return dni; }
    public int getEdad() { return edad; }
    public double getTalla() { return talla; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    public void setDni(String dni) { this.dni = dni; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setTalla(double talla) { this.talla = talla; }
}