package mensualidad.modelo;

import java.io.Serializable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
/**
 *
 * @author odali
 */
@Entity
@Table(catalog = "registropago", schema = "dbo")
@NamedQueries({
        @NamedQuery(name = "Pago.seleccionaTodos", query = "SELECT p FROM Pago p"),
        @NamedQuery(name = "Pago.seleccionaPorId", query = "SELECT p FROM Pago p WHERE p.idPago = :idPago")})

public class Pago implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPago", nullable = false)     
    private Integer idPago;
    @Column(name = "grado", length = 50)    
    private String grado;
    
    @Column(name = "numeroCuota")    
    private Double montoPagar;

    @ManyToOne
    @JoinColumn(name = "idEstudiante") // Ajuste en el nombre de la columna
    private Estudiante estudiante;
    
    public Pago() {
        this(null,null,null);
    }

    public Pago(String grado, Double montoPagar, Estudiante estudiante) {
        this.grado = grado;
        this.montoPagar = montoPagar;
        this.estudiante = estudiante;
    }

    
    public Integer getIdPago() {
        return idPago;
    }

    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public Double getMontoPagar() {
        return montoPagar;
    }

    public void setMontoPagar(Double montoPagar) {
        this.montoPagar = montoPagar;
    }
    public Integer getIdEstudiante() {
        return estudiante != null ? estudiante.getIdEstudiante() : null;
    }

    // Propiedades de JavaFX
    public IntegerProperty idProperty() {
        if (idPago != null) {
            return new SimpleIntegerProperty(idPago.intValue());
        } else {
            return new SimpleIntegerProperty(0); // Valor por defecto en caso de que idEstudiante sea nulo
        }        
    }  
    
    public StringProperty gradoProperty() {
        return new SimpleStringProperty(grado);        
    }    
    
    public DoubleProperty montoPagarProperty(){
        return new SimpleDoubleProperty(montoPagar);                
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPago != null ? idPago.hashCode() : 0);
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
        Pago other = (Pago) object; // Cambio de Estudiante a Pago
        return idPago != null && idPago.equals(other.idPago);
    }

    @Override
    public String toString() {
        return "mensualidad.modelo.Pago[ idPago=" + idPago + " ]";
    } 
}
