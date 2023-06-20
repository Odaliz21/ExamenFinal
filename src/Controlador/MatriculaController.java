package Controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.io.FileWriter;

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
    private TextField txtMazo;
    
    @FXML
    private TextField txtAbril;
    
    @FXML
    private TextField txtMayo;
    
    @FXML
    private TextField txtJunio;
    
    @FXML
    private TextField txtJulio;
    
    @FXML
    private TextField txtAgosto;
    
    @FXML
    private TextField txtSeptiembre;
    
    @FXML
    private TextField txtOctubre;
    
    @FXML
    private TextField txtNoviembre;
    
    @FXML
    private TextField txtDiciembre;
    

    @FXML
    void Guardar(ActionEvent event) {
        String Descuento =  txtDescuento.getText();
        String Mensualidad = txtMensualidad.getText();
        String PagoTotal = txtPagoTotal.getText();
        String Matricula = txtMatricula.getText();
        String MensualidadFinal = txtMensualidadFinal.getText();
         String Marzo = txtMazo.getText();
        String Abril= txtAbril.getText();
        String Mayo = txtMayo.getText();
        String Junio =  txtJunio.getText();
        String Julio= txtJulio.getText();
        String Agosto = txtAgosto.getText();
        String Septiembre = txtSeptiembre.getText();
        String Octubre = txtOctubre.getText();
        String Noviembre = txtNoviembre.getText();
        String Diciembre = txtDiciembre.getText();
    try {
        FileWriter fileWriter = new FileWriter("datos.txt", true); // Abre el archivo en modo de escritura (append=true para agregar al final del archivo)
        fileWriter.write("Descuento: " + Descuento + "\n");
        fileWriter.write("Mensualidad: " + Mensualidad + "\n");
        fileWriter.write("PagoTotal : " + PagoTotal + "\n");
        fileWriter.write("Matricula : " + Matricula  + "\n");
        fileWriter.write("txtMensualidadFinal : " + MensualidadFinal  + "\n");
        fileWriter.write("Marzo : " + Marzo  + "\n");
         fileWriter.write("Abril : " + Abril  + "\n");
          fileWriter.write("Mayo  : " + Mayo   + "\n");
           fileWriter.write("Junio : " + Junio  + "\n");
            fileWriter.write("Julio : " + Julio  + "\n"); 
            fileWriter.write("Agosto : " + Agosto  + "\n");
             fileWriter.write("Septiembre : " +Septiembre  + "\n");
              fileWriter.write("Octubre : " + Octubre  + "\n");
               fileWriter.write(" Noviembre: " +  Noviembre  + "\n");
                fileWriter.write("Diciembre : " + Diciembre  + "\n");
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
