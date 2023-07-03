package mensualidad.control.jpa;

import mensualidad.modelo.Estudiante;

public class PruebaConexionJPA {

    public static void main(String[] args) {
        jpaEstudiante jpa = new jpaEstudiante();

        // Insertar un nuevo estudiante
        Estudiante nuevoEstudiante = new Estudiante();
        nuevoEstudiante.setNombre("Juan");
        nuevoEstudiante.setApellidoPaterno("Pérez");
        nuevoEstudiante.setApellidoMaterno("Gómez");
        nuevoEstudiante.setGrado("10º");


        jpa.insertarEstudiante(nuevoEstudiante);

        // Cargar y mostrar todos los estudiantes en la base de datos
        jpa.cargarEstudiantes().forEach(estudiante -> {
            System.out.println(estudiante.getNombre() + " " + estudiante.getApellidoPaterno() + " " + estudiante.getApellidoMaterno());
        });
    }
}
