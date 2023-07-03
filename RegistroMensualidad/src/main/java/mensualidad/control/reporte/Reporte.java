package mensualidad.control.reporte;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javafx.event.ActionEvent;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import mensualidad.control.PagoController;
import net.sf.jasperreports.swing.JRViewer;

public class Reporte{

     private String reporte; 
  
     public Reporte(String reporte){ 
         this.reporte = reporte; 
     } 
  
     public void generarReporte(){ 
         try { 
             // Usando la unidad de persistencia "BaseDatos" 
             EntityManager entityManager = Persistence.createEntityManagerFactory("BaseDatos").createEntityManager(); 
        
             Connection conn = entityManager.unwrap(Connection.class); 
  
             // Código para generar el informe utilizando JasperReports 
             String rutaJRXML = "C:\\Users\\Hp\\OneDrive\\Documentos\\NetBeansProjects\\RegistroMensualidad\\src\\main\\java\\mensualidad\\control\\reporte\\Pago.jrxml"; 
             File archivoJRXML = new File(rutaJRXML); 
             InputStream dir = new FileInputStream(archivoJRXML); 
             JasperReport jr = JasperCompileManager.compileReport(dir); 
             JasperPrint jp = JasperFillManager.fillReport(jr, null, conn); 
  
             // Muestra el informe  
             JRViewer viewer = new JRViewer(jp); 
             JFrame frame = new JFrame("Reporte"); 
             frame.getContentPane().add(viewer); 
             frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
             frame.pack(); 
             frame.setVisible(true); 
  
             // Cierre del Entinity  
             entityManager.close(); 
         } catch (Exception ex) { 
             System.out.println("Error al generar el reporte " + this.reporte + ": " + ex); 
         } 
     }     

}