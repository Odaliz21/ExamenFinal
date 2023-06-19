package Controlador;

import java.io.FileWriter;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class MatriculaController implements Initializable {

    @FXML
    private Button btnGuardar;

    @FXML
    private Label lblCodMatricula;

    @FXML
    private Label lblFecha;

    @FXML
    private TextField txtDescuento;

    @FXML
    private TextField txtMatricula;

    @FXML
    private TextField txtMensualidad;

    @FXML
    private TextField txtMensualidadFinal;

    @FXML
    private TextField txtPagoTotal;

    @FXML
        void Guardar(ActionEvent event) {
        String Descuento =  txtDescuento.getText();
        String Mensualidad = txtMensualidad.getText();
        String PagoTotal = txtPagoTotal.getText();
        String Matricula = txtMatricula.getText();
        String MensualidadFinal = txtMensualidadFinal.getText();
        try {
        FileWriter fileWriter = new FileWriter("datos.txt", true); // Abre el archivo en modo de escritura (append=true para agregar al final del archivo)
        fileWriter.write("Descuento: " + Descuento + "\n");
        fileWriter.write("Mensualidad: " + Mensualidad + "\n");
        fileWriter.write("PagoTotal : " + PagoTotal + "\n");
        fileWriter.write("Matricula : " + Matricula  + "\n");
        fileWriter.write("txtMensualidadFinal : " + MensualidadFinal  + "\n");
        fileWriter.close(); // Cierra el archivo

        System.out.println("Datos guardados correctamente en el archivo.");
        } 
        catch (IOException e) {
        System.out.println("Error al guardar los datos en el archivo: " + e.getMessage());

    }
}
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
