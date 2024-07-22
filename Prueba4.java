package prueba4;

import java.util.HashMap;
import java.util.Scanner;

public class Prueba4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Programa> programas = new HashMap<>();
        
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Agregar Programa");
            System.out.println("2. Agregar Estudiante a Programa");
            System.out.println("3. Listar Programas");
            System.out.println("4. Listar Estudiantes de un Programa");
            System.out.println("5. Listar Estudiantes");
            System.out.println("6. Salir");
            System.out.println("Ingrese una opcion:");
            int opc = scanner.nextInt();
            scanner.nextLine();
            
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el nombre del Programa:");
                    String nombreP = scanner.nextLine();
                    programas.put(nombreP, new Programa(nombreP));
                    break;
                    
                case 2:
                    System.out.println("Ingrese el nombre del Programa:");
                    nombreP = scanner.nextLine();
                    Programa programa = programas.get(nombreP);
                    if (programa != null) {
                        System.out.println("Ingrese el codigo del estudiante:");
                        int cod = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Ingrese el nombre del Estudiante:");
                        String nombreE = scanner.nextLine();
                        System.out.println("Ingrese el email del estudiante:");
                        String email = scanner.nextLine();
                        Estudiante estudiante = new Estudiante(cod, nombreE, email);
                        programa.agregarEstudiante(estudiante);
                    } else {
                        System.out.println("Programa no encontrado.");
                    }
                    break;
                    
                case 3:
                    System.out.println("Programas Disponibles:");
                    for (String nombre : programas.keySet()) {
                        System.out.println("- " + nombre);
                    }
                    break;
                    
                case 4:
                    System.out.println("Ingrese el nombre del Programa:");
                    nombreP = scanner.nextLine();
                    programa = programas.get(nombreP);
                    if (programa != null) {
                        programa.mostrarEstudiantes();
                    } else {
                        System.out.println("Programa no encontrado.");
                    }
                    break;
                    
                case 5:
                    System.out.println("Lista de todos los estudiantes:");
                    for (Programa prog : programas.values()) {
                        prog.mostrarEstudiantes();
                    }
                    break;
                    
                case 6:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }
    }
}

