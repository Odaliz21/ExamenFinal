import java.util.Scanner;

class Estudiante {
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String genero;
    private int mensualidades;
    private double nota;
    
public Estudiante(String nombre, String apellidos, String fechaNacimiento, String genero, int mensualidades, double nota) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.mensualidades = mensualidades;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public int getMensualidades() {
        return mensualidades;
    }

    public double getNota() {
        return nota;
    }

    public String getEstado() {
        if (nota >= 11) {
            return "Aprobado";
        } else {
            return "Desaprobado";
        }
    }
}
