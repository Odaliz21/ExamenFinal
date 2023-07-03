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
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mensualidad.control.jpa.jpaEstudiante;
import mensualidad.modelo.Estudiante;

/**
 * FXML Controller class
 *
 * @author odali
 */
public class agregarEstudianteController implements Initializable {

    @FXML
    private TextField nombre;
    @FXML
    private TextField apellidoPaterno;
    @FXML
    private TextField apellidoMaterno;
    @FXML
    private TextField grado;

    private jpaEstudiante estudianteJpa;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        estudianteJpa = new jpaEstudiante();
    }    

    @FXML
    private void btnAgregarEstudiante(ActionEvent event) {
        // Obtener los valores de los campos de texto
        String nombreValue = nombre.getText();
        String apellidoPaternoValue = apellidoPaterno.getText();
        String apellidoMaternoValue = apellidoMaterno.getText();
        String gradoValue = grado.getText();
        
        // Crear un nuevo objeto Estudiante
        Estudiante nuevoEstudiante = new Estudiante(nombreValue, apellidoPaternoValue, apellidoMaternoValue, gradoValue);
        
        // Insertar el nuevo estudiante en la base de datos
        estudianteJpa.insertarEstudiante(nuevoEstudiante);
        
        // Limpiar los campos de texto después de agregar el estudiante
        nombre.clear();
        apellidoPaterno.clear();
        apellidoMaterno.clear();
        grado.clear();
    }

    @FXML
    private void btnSalir(ActionEvent event) {
        Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        primaryStage.close();
    }
    
}
