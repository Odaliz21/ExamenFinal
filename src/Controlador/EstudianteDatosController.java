package Controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.util.StringConverter;
import java.io.FileWriter;
import java.io.IOException;

public class EstudianteDatosController implements Initializable{

    @FXML
    private Button btnGuardar;

    @FXML
    private ComboBox<String> cbxGrado;

    @FXML
    private ComboBox<String> cbxNivel;

    @FXML
    private ComboBox<String> cbxSeccion;

    @FXML
    private ComboBox<String> cbxSituacion;
      
    @FXML
    private ComboBox<String> cbxgenero;

    @FXML
    private DatePicker dapFechaNacimiento;

    @FXML
    private TextField txtApellidoMaterno;

    @FXML
    private TextField txtApellidoPaterno;

    @FXML
    private TextField txtCiudadNacimiento;

    @FXML
    private TextField txtCodigoEstudiantil;

    @FXML
    private TextField txtColegioProcedente;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtProvinciaNacimiento;
    
    @FXML
    private TextField txtDNI;
    

@FXML
    void Guardar(ActionEvent event) {
        String nombre = txtNombre.getText();
        String apellidoPaterno = txtApellidoPaterno.getText();
        String apellidoMaterno = txtApellidoMaterno.getText();
        String nivel = cbxNivel.getValue();
        String seccion = cbxSeccion.getValue();
        String grado = cbxGrado.getValue();
        String colegioProcedente = txtColegioProcedente.getText();
        LocalDate fechaNacimiento = dapFechaNacimiento.getValue();
        String edad = txtEdad.getText();
        String dni = txtDNI.getText();
        String situacion = cbxSituacion.getValue();
        String genero = cbxgenero.getValue();
    try {
        FileWriter fileWriter = new FileWriter("datos.txt", true); // Abre el archivo en modo de escritura (append=true para agregar al final del archivo)
        fileWriter.write("Nombre: " + nombre + "\n");
        fileWriter.write("Apellido Paterno: " + apellidoPaterno + "\n");
        fileWriter.write("Apellido Materno: " + apellidoMaterno + "\n");
        fileWriter.write("Nivel: " + nivel + "\n");
        fileWriter.write("Sección: " + seccion + "\n");
        fileWriter.write("Grado: " + grado + "\n");
        fileWriter.write("Colegio Procedente: " + colegioProcedente + "\n");
        fileWriter.write("Fecha de Nacimiento: " + fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n");
        fileWriter.write("Edad: " + edad + "\n");
        fileWriter.write("DNI: " + dni + "\n");
        fileWriter.write("Situación: " + situacion + "\n");
        fileWriter.write("Género: " + genero + "\n");
        fileWriter.close(); // Cierra el archivo

        System.out.println("Datos guardados correctamente en el archivo.");
        } 
    catch (IOException e) {
        System.out.println("Error al guardar los datos en el archivo: " + e.getMessage());
        }
    }
    @FXML
    void DateFecha(ActionEvent event) {

    }
    private String[] gradito1 = {null,"1°","2°","3°","4°","5°"};
    private String[] gradito2 = {null,"1°","2°","3°","4°","5°","6°"};
    private String[] nivelito = {null,"Inicial","Primaria","Secundaria"};
    private String[] secshion = {null,"A","B","C","D","E","F"};
    private String[] situasau = {null,"Promovido","Ingresante","Repitiente"};
    private String[] gra = {null,"el niño tiene 3 años","el niño tiene 4 años","el niño tiene 5 años"};
    private String[] gen = {null,"Femenino","Masculino"};
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        cbxNivel.getItems().addAll(nivelito);
        cbxGrado.getItems().addAll(gradito2);
        if (cbxNivel.equals("Primaria")) {
            cbxGrado.getItems().addAll(gradito1);
        } else if (cbxNivel.equals("Secundaria")) {
            cbxGrado.getItems().addAll(gradito2);
        } else if (cbxNivel.equals("Inicial")) {
            cbxGrado.getItems().addAll(gra);
        }
        cbxSeccion.getItems().addAll(secshion);
        cbxSituacion.getItems().addAll(situasau);
        cbxgenero.getItems().addAll(gen);
    }

}