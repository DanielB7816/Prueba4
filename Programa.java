package prueba4;

import java.util.HashMap;

public class Programa {
    
    private String nombre;
    private HashMap<Integer, Estudiante> estudiantes;

    public Programa(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public HashMap<Integer, Estudiante> getEstudiantes() {
        return estudiantes;
    }
    
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.put(estudiante.getCod(), estudiante);
    }
    
    public void mostrarEstudiantes() {
        System.out.println("Estudiantes en el programa " + nombre + ":");
        for (Estudiante estudiante : estudiantes.values()) {
            System.out.println("Codigo: " + estudiante.getCod() + ", Nombre: " + estudiante.getNombre() + ", Email: " + estudiante.getEmail());
        }
    }
}



