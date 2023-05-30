package ClasesObjeto;

public class Alumno extends Persona{
    
    private String Nivel;
    private String Seccion;
    private String Grado;
    private String CodEstudiantil;
    private String InstProcedente;
    private String Situacion;
    private String FechaNacimiento;
    private String Genero ;

    public Alumno(String Nivel, String Seccion, String Grado, String CodEstudiantil, String InstProcedente, String Situacion, String FechaNacimiento, int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion , String Genero) {
        super(Edad, Nombre, ApelldioPaterno, ApelldioMaterno, Direccion);
        this.Nivel = Nivel;
        this.Seccion = Seccion;
        this.Grado = Grado;
        this.CodEstudiantil = CodEstudiantil;
        this.InstProcedente = InstProcedente;
        this.Situacion = Situacion;
        this.FechaNacimiento = FechaNacimiento;
        this.Genero= Genero;
    }

    public Alumno(String Nivel, String Seccion, String Grado, String CodEstudiantil, String InstProcedente, String Situacion, String FechaNacimiento, int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion, String DNI, String Genero) {
        super(Edad, Nombre, ApelldioPaterno, ApelldioMaterno, Direccion, DNI);
        this.Nivel = Nivel;
        this.Seccion = Seccion;
        this.Grado = Grado;
        this.CodEstudiantil = CodEstudiantil;
        this.InstProcedente = InstProcedente;
        this.Situacion = Situacion;
        this.FechaNacimiento = FechaNacimiento;
        this.Genero= Genero;
    }

    
        public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero= Genero;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String Grado) {
        this.Grado = Grado;
    }

    public String getCodEstudiantil() {
        return CodEstudiantil;
    }

    public void setCodEstudiantil(String CodEstudiantil) {
        this.CodEstudiantil = CodEstudiantil;
    }

    public String getInstProcedente() {
        return InstProcedente;
    }

    public void setInstProcedente(String InstProcedente) {
        this.InstProcedente = InstProcedente;
    }

   
    public String getSituacion() {
        return Situacion;
    }

    public void setSituacion(String Situacion) {
        this.Situacion = Situacion;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }
    
    
}
