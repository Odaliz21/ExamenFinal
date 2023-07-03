package mensualidad.control.jpa;

import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import mensualidad.modelo.Estudiante;

public class jpaEstudiante {
    private ObservableList<Estudiante> datoEstudiante = FXCollections.observableArrayList();

    public ObservableList<Estudiante> getDatoEstudiantes() {
        return datoEstudiante;
    }

    private EntityManagerFactory emf;

    public jpaEstudiante() {
        this.emf = Persistence.createEntityManagerFactory("BaseDatos");
    }

    public ObservableList<Estudiante> cargarEstudiantes() {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Estudiante> query = em.createQuery("SELECT e FROM Estudiante e", Estudiante.class);
            List<Estudiante> estudiantes = query.getResultList();

            // Agregar los estudiantes a la lista observable
            datoEstudiante.clear();
            datoEstudiante.addAll(estudiantes);

            return datoEstudiante;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return datoEstudiante;
    }
    public void insertarEstudiante(Estudiante estudiante) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = null;
        try {
            tx = em.getTransaction();
            tx.begin();
            em.persist(estudiante);
            tx.commit();
            System.out.println("Estudiante agregado correctamente: " + estudiante.getNombre());
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

