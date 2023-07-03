package mensualidad.control;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import mensualidad.modelo.Pago;
import mensualidad.control.jpa.jpaPago;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author odali
 */
public class PagoController implements Initializable {

    @FXML
    private Button btnAgregar;
    @FXML
    private Button btnreporte;
    @FXML
    private TableView<Pago> tablaPagar;
    @FXML
    private TableColumn<Pago, Integer> idPagoColumna;
    @FXML
    private TableColumn<Pago, String> gradoColumna;
    @FXML
    private TableColumn<Pago, Double> montoPagarColumna;
    @FXML
    private TableColumn<Pago, Integer> idEstudianteColumna;

    private jpaPago pagoDAO = new jpaPago();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Inicializar las columnas de la tabla
        idPagoColumna.setCellValueFactory(new PropertyValueFactory<>("idPago"));
        gradoColumna.setCellValueFactory(new PropertyValueFactory<>("grado"));
        montoPagarColumna.setCellValueFactory(new PropertyValueFactory<>("montoPagar"));
        idEstudianteColumna.setCellValueFactory(new PropertyValueFactory<>("idEstudiante"));



        // Cargar los pagos desde la base de datos y asignarlos a la tabla
        cargarPagos();
    }

    private void cargarPagos() {
        // Cargar los pagos desde la base de datos utilizando el método de jpaPago
        ObservableList<Pago> pagos = pagoDAO.cargarPagos();

        // Asignar los pagos a la tabla
        tablaPagar.setItems(pagos);
    }

    @FXML
    private void btnAgregar(ActionEvent event) {
        try {
            // Cargar el archivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/mensualidad/vista/registroPago.fxml"));
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
        // Aquí puedes implementar la lógica para generar un reporte de los pagos
    }
}
