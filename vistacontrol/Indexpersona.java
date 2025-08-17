/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.empresa.vistacontrol;

import java.util.LinkedHashMap;
import java.util.Map;
import pe.edu.empresa.utils.Persona;
import pe.edu.empresa.utils.Lectura;
import pe.edu.empresa.utils.Utilitarios;

public class Indexpersona {
    private Map<String, Persona> personas = new LinkedHashMap<>();

    public void agregarPersona() {
        do {
            String dni = Lectura.leerCadena("DNI: ");
            if (personas.containsKey(dni)) {
                System.out.println("¡DNI ya registrado!");
                continue;
            }
            String nombre = Lectura.leerCadena("Nombre: ");
            String apellidos = Lectura.leerCadena("Apellidos: ");
            int edad = Lectura.leerEntero("Edad: ");
            double talla = Lectura.leerDouble("Talla: ");
            personas.put(dni, new Persona(nombre, apellidos, dni, edad, talla));
            System.out.println("Persona agregada.");
        } while (continuar("¿Agregar otra persona? (s/n): "));
    }

    public void eliminarPersona() {
        do {
            String dni = Lectura.leerCadena("DNI a eliminar: ");
            if (personas.remove(dni) != null)
                System.out.println("Persona eliminada.");
            else
                System.out.println("No encontrada.");
        } while (continuar("¿Eliminar otra? (s/n): "));
    }

    public void editarPersona() {
        do {
            String dni = Lectura.leerCadena("DNI a editar: ");
            Persona p = personas.get(dni);
            if (p != null) {
                String nombre = Lectura.leerCadena("Nuevo nombre ("+p.getNombre()+"): ");
                String apellidos = Lectura.leerCadena("Nuevos apellidos ("+p.getApellidos()+"): ");
                int edad = Lectura.leerEntero("Nueva edad ("+p.getEdad()+"): ");
                double talla = Lectura.leerDouble("Nueva talla ("+p.getTalla()+"): ");
                if(!nombre.isEmpty()) p.setNombre(nombre);
                if(!apellidos.isEmpty()) p.setApellidos(apellidos);
                p.setEdad(edad);
                p.setTalla(talla);
                System.out.println("Persona actualizada.");
            } else {
                System.out.println("No encontrada.");
            }
        } while (continuar("¿Editar otra? (s/n): "));
    }

    public void listarPersonas() {
        System.out.printf("%-12s %-15s %-10s %4s %6s\n", "NOMBRE", "APELLIDOS", "DNI", "EDAD", "TALLA");
        System.out.println("----------------------------------------------------------");
        for (Persona p : personas.values()) {
            System.out.println(Utilitarios.formatoPersona(
                p.getNombre(), p.getApellidos(), p.getDni(), p.getEdad(), p.getTalla()));
        }
    }

    public void buscarPersonas() {
        String criterio = Lectura.leerCadena("Buscar por patrón (* para comodín): ");
        System.out.printf("%-12s %-15s %-10s %4s %6s\n", "NOMBRE", "APELLIDOS", "DNI", "EDAD", "TALLA");
        System.out.println("----------------------------------------------------------");
        for (Persona p : personas.values()) {
            if (Utilitarios.coincideCriterio(p.getNombre(), criterio) ||
                Utilitarios.coincideCriterio(p.getApellidos(), criterio) ||
                Utilitarios.coincideCriterio(p.getDni(), criterio)) {
                System.out.println(Utilitarios.formatoPersona(
                    p.getNombre(), p.getApellidos(), p.getDni(), p.getEdad(), p.getTalla()));
            }
        }
    }

    private boolean continuar(String msg) {
        String r = Lectura.leerCadena(msg);
        return r.equalsIgnoreCase("s");
    }
}
