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
    public void insertProposal(IProposal proposal) {
        /* throw exception if something goes wrong */
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            Proposal p = (Proposal) proposal;
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void insertTeacher(ITeacher teacher) {
        /* throw exception if something goes wrong */
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(teacher);
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public List<IProposal> getAllProposals() {
        EntityManager em = emf.createEntityManager();
        try {
            Query query = em.createNamedQuery("Proposal.getAll");
            List<IProposal> proposal = query.getResultList();
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
        /* throw exception if something goes wrong */
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            for (IElectiveSubject e : es) {
                em.persist(e);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public List<ITeacher> getAllTeachers() {
        EntityManager em = emf.createEntityManager();
        try {
            Query query = em.createNamedQuery("Teacher.getAll");
            List<ITeacher> teachers = query.getResultList();
            return teachers;
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return null;
        } finally {
            em.close();
        }
    }
    
    @Override
    public void removeTeacher(ITeacher teacher) {
        /* throw exception if something goes wrong */
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.remove(teacher);
            em.getTransaction().commit();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    @Override
    public List<IElectiveSubject> getAllElectiveSubjects() {
        EntityManager em = emf.createEntityManager();
        try {
            Query query = em.createNamedQuery("ElectiveSubject.getAll");
            List<IElectiveSubject> es = query.getResultList();
            return es;
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return null;
        } finally {
            em.close();
        }
    }

}
