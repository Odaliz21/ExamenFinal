/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mensualidad.control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author odali
 */
public class RegistroPagoController implements Initializable {

    @FXML
    private PasswordField idPagosField;
    @FXML
    private TextField nombreField;
    @FXML
    private TextField apellidoPaternoField;
    @FXML
    private TextField apellidoMaternoField;
    @FXML
    private TextField gradoField;
    @FXML
    private TextField coutaField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnPagar(ActionEvent event) {
    }

    @FXML
    private void btnSalir(ActionEvent event) {
    }

    @FXML
    private void btnBuscar(ActionEvent event) {
    }
    
}
