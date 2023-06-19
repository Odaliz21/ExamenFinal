
package Controlador;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PadresController implements Initializable {

    @FXML
    private Button btnGuardar;

    @FXML
    private TextField txtApellidoMM;

    @FXML
    private TextField txtApellidoMP;

    @FXML
    private TextField txtApellidoPM;

    @FXML
    private TextField txtApellidoPP;

    @FXML
    private TextField txtDNIMadre;
    
    @FXML
    private TextField txtDNIPadre;

    @FXML
    private TextField txtDireccionMadre;

    @FXML
    private TextField txtDireccionPadre;

    @FXML
    private TextField txtNombreEmegencia;

    @FXML
    private TextField txtNombreMadre;

    @FXML
    private TextField txtNombrePadre;

    @FXML
    private TextField txtTelefonoEmergencia;

    @FXML
    private TextField txtTelefonoMadre;

    @FXML
    private TextField txtTelefonoPadre;

    @FXML
    private TextField txtTrabajoMadre;

    @FXML
    private TextField txtTrabajoPadre;
    

    @FXML
      void Guardar(ActionEvent event) {
        String nombreP = txtNombrePadre.getText();
        String ApellidoPP = txtApellidoPP.getText();
        String ApellidoPM = txtApellidoPM.getText();
        String DireccionPadre= txtDireccionPadre.getText();
        String TelefonoPadre = txtTelefonoPadre.getText();
        String TrabajoPadre = txtTrabajoPadre.getText();
        String nombreM = txtNombreMadre.getText();
        String ApellidoMP = txtApellidoMP.getText();
        String ApellidoMM = txtApellidoMM.getText();
        String DireccionMadre = txtDireccionMadre.getText();
        String TelefonoMadre = txtTelefonoMadre.getText();
        String DNIMadre =   txtDNIMadre.getText();
        String DNIPadre =   txtDNIPadre.getText();
        String TrabajoMadre = txtTrabajoMadre.getText();
        String TelefonoEmergencia=txtTelefonoEmergencia.getText();
        String NombreEmegencia=  txtNombreEmegencia.getText();
        try {
        FileWriter fileWriter = new FileWriter("datos.txt", true); // Abre el archivo en modo de escritura (append=true para agregar al final del archivo)
        fileWriter.write("nombreP: " + nombreP + "\n");
        fileWriter.write("ApellidoPP: " + ApellidoPP + "\n");
        fileWriter.write("ApellidoPM: " + ApellidoPM+ "\n");
        fileWriter.write("DireccionPadre: " + DireccionPadre + "\n");
        fileWriter.write(" TelefonoPadre: " +  TelefonoPadre + "\n");
        fileWriter.write("TrabajoPadre: " + TrabajoPadre + "\n");
        fileWriter.write(" DNIPadre: " +  DNIPadre + "\n");
        fileWriter.write("nombreM : " + nombreM + "\n");
        fileWriter.write(" ApellidoMP: " +  ApellidoMP + "\n");
        fileWriter.write("ApellidoMM: " + ApellidoMM + "\n");
        fileWriter.write("DireccionMadre: " + DireccionMadre + "\n");
        fileWriter.write("TelefonoMadre: " + TelefonoMadre+ "\n");
        fileWriter.write(" DNIMadre: " +  DNIMadre + "\n");
        fileWriter.write("TrabajoMadre: " + TrabajoMadre+ "\n");
        fileWriter.write(" NombreEmegencia: " +  NombreEmegencia + "\n");
        fileWriter.write(" TelefonoEmergencia: " +  TelefonoEmergencia + "\n");
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
