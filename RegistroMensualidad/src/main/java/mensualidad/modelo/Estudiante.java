package mensualidad.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
/**
 *
 * @author odali
 */
@Entity
@Table(catalog = "registropago", schema = "dbo")
@NamedQueries({
        @NamedQuery(name = "Estudiante.seleccionaTodos", query = "SELECT e FROM Estudiante e"),
        @NamedQuery(name = "Estudiante.seleccionaPorId", query = "SELECT e FROM Estudiante e WHERE e.idEstudiante = :EstudiantesId")})
public class Estudiante implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEstudiante", nullable = false) 
    private Integer idEstudiante;

    
    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "apellidoPaterno", length = 100)
    private String apellidoPaterno;

    @Column(name = "apellidoMaterno", length = 100)
    private String apellidoMaterno;

    @Column(name = "grado", length = 50)
    private String grado;

    @Column(name = "numeroCuota")
    private Integer numeroCuota;

    
    public Estudiante() {
        this(null, null, null, null);
    }

    public Estudiante(String nombre, String apellidoPaterno, String apellidoMaterno, String grado) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.grado = grado;
        // Datos Tontos
        this.numeroCuota = 9;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public Integer getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(Integer numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    // Propiedades de JavaFX
    public IntegerProperty idProperty() {
        if (idEstudiante != null) {
            return new SimpleIntegerProperty(idEstudiante.intValue());
        } else {
            return new SimpleIntegerProperty(0); // Valor por defecto en caso de que idEstudiante sea nulo
        }        
    }    
    
    public StringProperty nombreProperty() {
        return new SimpleStringProperty(nombre);        
    }

    public StringProperty apellidoPaternoProperty() {
        return new SimpleStringProperty(apellidoPaterno);        
    }

    public StringProperty apellidoMaternoProperty() {
        return new SimpleStringProperty(apellidoMaterno);        
    }

    public StringProperty gradoProperty() {
        return new SimpleStringProperty(grado);        
    }

    public IntegerProperty numeroCuotaProperty() {
        if (numeroCuota != null) {
            return new SimpleIntegerProperty(numeroCuota.intValue());
        } else {
            return new SimpleIntegerProperty(0); // Valor por defecto en caso de que numeroCuota sea nulo
        }   
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstudiante != null ? idEstudiante.hashCode() : 0);
        return hash;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Estudiante other = (Estudiante) object;
        return idEstudiante != null && idEstudiante.equals(other.idEstudiante);
    }


    @Override
    public String toString() {
        return "mensualidad.modelo.Estudiante[ idEstudiante=" + idEstudiante + " ]";
    }   
}
