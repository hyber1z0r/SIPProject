package com.ohnana.control;

import com.google.gson.Gson;
import com.ohnana.model.ITeacher;
import com.ohnana.model.Proposal;
import com.ohnana.model.Teacher;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author jakobgaardandersen
 */
public class JPAManager {

    private final EntityManagerFactory emf;
    private final Gson gson = new Gson();

    public JPAManager(EntityManagerFactory emf) {
        this.emf = emf;
    }

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

    public void insertTeacher(ITeacher t1) {
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

}
