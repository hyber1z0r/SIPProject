package com.ohnana.control;

import com.ohnana.interfaces.IElectiveSubject;
import com.ohnana.interfaces.IProposal;
import com.ohnana.interfaces.ISavedSubject;
import com.ohnana.interfaces.IStudent;
import com.ohnana.interfaces.ITeacher;
import com.ohnana.model.ElectiveSubject;
import com.ohnana.model.Proposal;
import com.ohnana.model.SavedSubject;
import java.util.ArrayList;
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

    public void insertProposal(String title, String description, ITeacher teacher, String name) throws Exception {
        // check args
        IProposal proposal = new Proposal(title, description, teacher, name);
        manager.insertProposal(proposal);
    }

    public void insertTeacher(ITeacher teacher) throws Exception {
        // check args
        manager.insertTeacher(teacher);
    }

    public List<IProposal> getAllProposals() {
        return manager.getAllProposals();
    }

    public List<ITeacher> getAllTeachers() {
        return manager.getAllTeachers();
    }

    public void insertElectiveSubjects(List<IProposal> proposals) throws Exception {
        // check args
        List<IElectiveSubject> es = new ArrayList();
        for (IProposal proposal : proposals) {
            es.add(new ElectiveSubject(proposal));
        }
        manager.insertElectiveSubjects(es);
    }

    public List<IElectiveSubject> getAllElectiveSubject() {
        return manager.getAllElectiveSubjects();
    }

    public List<IStudent> getAllStudents() {
        return manager.getAllStudents();
    }

    public void updateStudentSubject(int id, String... subjects) throws Exception {
        manager.updateStudentSubject(id, subjects);
    }

    public void insertSubject(List<IElectiveSubject> day1, List<IElectiveSubject> day2) throws Exception {
        if (day1 == null || day2 == null) {
            throw new IllegalArgumentException("Day 1 or 2 was null");
        }
        ISavedSubject subject = new SavedSubject(day1, day2);
        manager.insertSubject(subject);
    }
}
