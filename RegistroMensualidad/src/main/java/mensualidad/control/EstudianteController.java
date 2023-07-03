package mensualidad.control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.concurrent.ScheduledService;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.util.Duration;
import mensualidad.modelo.Estudiante;
import mensualidad.control.jpa.jpaEstudiante;

public class EstudianteController implements Initializable {
   
    @FXML
    private TableView<Estudiante> tablaEstudiante;
    @FXML
    private TableColumn<Estudiante, Integer> idColumna;
    @FXML
    private TableColumn<Estudiante, String> nombreColumna;
    @FXML
    private TableColumn<Estudiante, String> apellidoPaternoColumna;
    @FXML
    private TableColumn<Estudiante, String> apellidoMaternoColumna;
    @FXML
    private TableColumn<Estudiante, String> gradoColumna;
    @FXML
    private TableColumn<Estudiante, Integer> coutaColumna;

    private jpaEstudiante estudianteJpa; // Instancia de la clase jpaEstudiante
    
    private ScheduledService<Void> recargaDatosService; 
    @FXML
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        estudianteJpa = new jpaEstudiante(); // Crear instancia de la clase jpaEstudiante

        // Inicializar la tabla de estudiantes con las columnas correspondientes
        idColumna.setCellValueFactory(new PropertyValueFactory<>("idEstudiante"));
        nombreColumna.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        apellidoPaternoColumna.setCellValueFactory(new PropertyValueFactory<>("apellidoPaterno"));
        apellidoMaternoColumna.setCellValueFactory(new PropertyValueFactory<>("apellidoMaterno"));
        gradoColumna.setCellValueFactory(new PropertyValueFactory<>("grado"));
        coutaColumna.setCellValueFactory(new PropertyValueFactory<>("numeroCuota"));

        // Cargar estudiantes desde la base de datos y configurar la lista en la tabla
        ObservableList<Estudiante> datosEstudiantes = estudianteJpa.cargarEstudiantes();
        tablaEstudiante.setItems(datosEstudiantes);
        // Crear el ScheduledService para recargar los datos cada cierto tiempo
           ScheduledService<Void> recargaDatosService = new ScheduledService<>() {
               protected Task<Void> createTask() {
                   return new Task<>() {
                       @Override
                       protected Void call() throws Exception {
                           // Volver a cargar los datos desde la base de datos y actualizar la tabla
                           ObservableList<Estudiante> nuevosDatosEstudiantes = estudianteJpa.cargarEstudiantes();
                           tablaEstudiante.setItems(nuevosDatosEstudiantes);
                           return null;
                       }
                   };
               }
           };
           recargaDatosService.setPeriod(Duration.seconds(5)); // Configurar el intervalo de tiempo en segundos
           recargaDatosService.start();        
    }    

    @FXML
    private void btnAgregar(ActionEvent event) {
        try {
            // Cargar el archivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/mensualidad/vista/agregarEstudiante.fxml"));
            Parent root = loader.load();

            // Crear una nueva escena
            Scene scene = new Scene(root);

            // Crear una nueva ventana
            Stage newStage = new Stage();
            newStage.setScene(scene);

            // Mostrar la nueva ventana
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void brnReporte(ActionEvent event) {
    }
}
