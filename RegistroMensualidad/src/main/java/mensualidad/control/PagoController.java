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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import mensualidad.control.reporte.Reporte;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import mensualidad.modelo.Pago;
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
    private Collection<?> pago;

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
   
private void btnReporte(ActionEvent event) {
    Reporte reporte = new Reporte("Pago");
    reporte.generarReporte();
}

public static void Reporte(Collection<PagoController> pago) {
    // Aquí colocas el código que necesitas ejecutar para generar el reporte
    // Utiliza la colección 'pago' para generar el informe
    // Puedes seguir utilizando las variables y métodos necesarios dentro de este método
}

    
    }


