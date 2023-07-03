package mensualidad.control.jpa;

import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import mensualidad.modelo.Pago;
/**
 *
 * @author odali
 */
public class jpaPago {
    private ObservableList<Pago> datosPago = FXCollections.observableArrayList();
    private EntityManagerFactory emf;

    public jpaPago() {
        this.emf = Persistence.createEntityManagerFactory("BaseDatos");
    }

    public ObservableList<Pago> cargarPagos() {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Pago> query = em.createQuery("SELECT p FROM Pago p", Pago.class);
            List<Pago> pagos = query.getResultList();

            // Agregar los pagos a la lista observable
            datosPago.clear();
            datosPago.addAll(pagos);

            return datosPago;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return datosPago;
    }

    public void insertarPago(Pago pago) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = null;
        try {
            tx = em.getTransaction();
            tx.begin();
            em.persist(pago);
            tx.commit();
            System.out.println("Pago agregado correctamente con ID: " + pago.getIdPago());
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}

