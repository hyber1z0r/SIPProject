package com.ohnana.control;

import com.ohnana.interfaces.IJPAManager;
import com.google.gson.Gson;
import com.ohnana.interfaces.IElectiveSubject;
import com.ohnana.interfaces.IProposal;
import com.ohnana.interfaces.ITeacher;
import com.ohnana.model.Proposal;
import com.ohnana.model.Teacher;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 *
 * @author jakobgaardandersen
 */
public class JPAManager implements IJPAManager {

    private final EntityManagerFactory emf;
    private final Gson gson = new Gson();

    public JPAManager(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public void insertProposal(Proposal proposal) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(proposal);
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void insertTeacher(Teacher t1) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(t1);
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public List<Proposal> getAllProposals() {
        EntityManager em = emf.createEntityManager();
        try {
            Query query = em.createNamedQuery("Proposal.getAll");
            List<Proposal> proposal = query.getResultList();
            return proposal;
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return null;
        } finally {
            em.close();
        }
    }

    @Override
    public void insertElectiveSubjects(List<IElectiveSubject> es) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
