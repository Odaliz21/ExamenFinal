package mensualidad.control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mensualidad.control.jpa.jpaEstudiante;
import mensualidad.control.jpa.jpaPago;
import mensualidad.modelo.Estudiante;
import mensualidad.modelo.Pago;
/**
 * FXML Controller class
 *
 * @author odali
 */

public class RegistroPagoController implements Initializable {

    @FXML
    private TextField idPagosField;
    @FXML
    private TextField gradoField;

    @FXML
    private TextField IdEstudianteField;
    @FXML
    private TextField montoPagarField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void btnPagar(ActionEvent event) {
        String grado = gradoField.getText();
        double montoPagar = Double.parseDouble(montoPagarField.getText());

        int idEstudiante = Integer.parseInt(IdEstudianteField.getText());

        // Obtener el estudiante por su ID
        jpaEstudiante estudianteDAO = new jpaEstudiante();
        estudianteDAO.cargarEstudiantes();

        Estudiante estudiante = null;
        for (Estudiante e : estudianteDAO.getDatoEstudiantes()) {
            if (e.getIdEstudiante() == idEstudiante) {
                estudiante = e;
                break;
            }
        }

        if (estudiante != null) {
            // Crear una instancia de Pago con el estudiante y otros datos
            Pago pago = new Pago(grado, montoPagar, estudiante);

            // Crear una instancia de jpaPago
            jpaPago pagoDAO = new jpaPago();

            // Insertar el pago en la base de datos
            pagoDAO.insertarPago(pago);

            // Mostrar un mensaje de éxito o realizar alguna otra acción
            System.out.println("Pago registrado correctamente.");
        } else {
            System.out.println("No se encontró un estudiante con el ID proporcionado.");
        }        
    }

    @FXML
    private void btnSalir(ActionEvent event) {
        Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        primaryStage.close();
    }

}