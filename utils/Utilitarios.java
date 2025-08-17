/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.empresa.utils;

/**
 *
 * @author Paul
 */

import java.util.regex.Pattern;

public class Utilitarios {
    // Busca coincidencias tipo "Car*", "*men", "*al*"
    public static boolean coincideCriterio(String texto, String patron) {
        patron = patron.replace("*", ".*");
        Pattern p = Pattern.compile("^" + patron + "$", Pattern.CASE_INSENSITIVE);
        return p.matcher(texto).find();
    }

    // Formato para reporte alineado
    public static String formatoPersona(String nombre, String apellidos, String dni, int edad, double talla) {
        return String.format("%-12s %-15s %-10s %4d %6.2f", nombre, apellidos, dni, edad, talla);
    }
}
