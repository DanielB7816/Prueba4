package prueba4;

public class Estudiante {
    
    private int cod;
    private String nombre;
    private String email;

    public Estudiante(int cod, String nombre, String email) {
        this.cod = cod;
        this.nombre = nombre;
        this.email = email;
    }

    public int getCod() {
        return cod;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}

