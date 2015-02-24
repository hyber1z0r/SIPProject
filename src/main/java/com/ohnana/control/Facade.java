package com.ohnana.control;

import com.ohnana.model.Proposal;
import com.ohnana.model.Teacher;
import java.util.List;
import javax.persistence.Persistence;

/**
 *
 * @author jakobgaardandersen
 */
public class Facade {

    private static Facade instance;
    private final JPAManager manager;

    private Facade() {
        manager = new JPAManager(Persistence.createEntityManagerFactory("com.ohnana_SIPProject"));
    }

    public static Facade getFacade() {
        if (instance == null) {
            instance = new Facade();
        }
        return instance;
    }
    
    public void insertProposal(String title, String description, List<Teacher> teachers) {
        // check args
        Proposal proposal = new Proposal(title, description, teachers);
        manager.insertProposal(proposal);
    }

    public void insertTeacher(Teacher t1) {
        manager.insertTeacher(t1);
    }

}
