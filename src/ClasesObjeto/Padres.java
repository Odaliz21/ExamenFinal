package ClasesObjeto;

public class Padres extends Persona{
    
    private String Ocupacion;
    private String Telefono;
    private String Emergencia;

    public Padres(String Ocupacion, String Telefono, String Emergencia, int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion, String DNI) {
        super(Edad, Nombre, ApelldioPaterno, ApelldioMaterno, Direccion, DNI);
        this.Ocupacion = Ocupacion;
        this.Telefono = Telefono;
        this.Emergencia = Emergencia;
    }

    public Padres(String Ocupacion, String Emergencia, int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion, String DNI) {
        super(Edad, Nombre, ApelldioPaterno, ApelldioMaterno, Direccion, DNI);
        this.Ocupacion = Ocupacion;
        this.Emergencia = Emergencia;
    }

    public Padres(String Ocupacion, String Telefono, String Emergencia, int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion) {
        super(Edad, Nombre, ApelldioPaterno, ApelldioMaterno, Direccion);
        this.Ocupacion = Ocupacion;
        this.Telefono = Telefono;
        this.Emergencia = Emergencia;
    }

    public Padres(String Ocupacion, String Emergencia, int Edad, String Nombre, String ApelldioPaterno, String ApelldioMaterno, String Direccion) {
        super(Edad, Nombre, ApelldioPaterno, ApelldioMaterno, Direccion);
        this.Ocupacion = Ocupacion;
        this.Emergencia = Emergencia;
    }

    public String getLugarTrabajo() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion =Ocupacion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmergencia() {
        return Emergencia;
    }

    public void setEmergencia(String Emergencia) {
        this.Emergencia = Emergencia;
    }

    
}
