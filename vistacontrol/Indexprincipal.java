/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.empresa.vistacontrol;

import pe.edu.empresa.utils.Lectura;

public class Indexprincipal {
    public static void main(String[] args) {
        Indexpersona personaCrud = new Indexpersona();
        while (true) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Agregar Persona");
            System.out.println("2. Editar Persona");
            System.out.println("3. Eliminar Persona");
            System.out.println("4. Listar Personas");
            System.out.println("5. Buscar Personas");
            System.out.println("6. Salir");
            int op = Lectura.leerEntero("Seleccione opción: ");
            switch (op) {
                case 1: personaCrud.agregarPersona(); break;
                case 2: personaCrud.editarPersona(); break;
                case 3: personaCrud.eliminarPersona(); break;
                case 4: personaCrud.listarPersonas(); break;
                case 5: personaCrud.buscarPersonas(); break;
                case 6: System.out.println("¡Adiós!"); return;
                default: System.out.println("Opción inválida.");
            }
        }
    }
}
