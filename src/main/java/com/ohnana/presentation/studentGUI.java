package com.ohnana.presentation;

import com.ohnana.control.Facade;
import com.ohnana.interfaces.IElectiveSubject;
import com.ohnana.interfaces.IStudent;
import com.ohnana.interfaces.ITeacher;
import java.util.List;
import java.util.Stack;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Anders Kaae Pedersen
 */
public class studentGUI extends javax.swing.JFrame {

    //FIELDS 
    private final Facade facade;
    private DefaultListModel modelOfferedSubjectsList;
    private DefaultListModel modelFirstprior;
    private DefaultListModel modelSecondprior;
    private DefaultComboBoxModel modelStudents;
    private DefaultComboBoxModel modelComboBoxTeachers;
    private DefaultComboBoxModel modelComboBoxProposer;

// CONSTRUCTOR 
    public studentGUI() {
        initComponents();
        facade = Facade.getFacade();
        initUI();
        fillSubjects(facade.getAllElectiveSubject());
        fillStudents(facade.getAllStudents());
        fillTeachers(facade.getAllTeachers());
        fillProposer(facade.getAllStudents());
    }

    //METHODS 
    private void initUI() {
        jListOfferedSubjects.setModel(new DefaultListModel());
        modelOfferedSubjectsList = (DefaultListModel) jListOfferedSubjects.getModel();
        jListFirstprior.setModel(new DefaultListModel());
        modelFirstprior = (DefaultListModel) jListFirstprior.getModel();
        jListSecondPrior.setModel(new DefaultListModel());
        modelSecondprior = (DefaultListModel) jListSecondPrior.getModel();
        jComboBoxStudents.setModel(new DefaultComboBoxModel());
        modelStudents = (DefaultComboBoxModel) jComboBoxStudents.getModel();

        jComboBoxTeachers.setModel(new DefaultComboBoxModel());
        jComboBoxProposers.setModel(new DefaultComboBoxModel());
        modelComboBoxProposer = (DefaultComboBoxModel) jComboBoxProposers.getModel();
        modelComboBoxTeachers = (DefaultComboBoxModel) jComboBoxTeachers.getModel();
    }

    // fill the list of offered subjects
    private void fillSubjects(List<IElectiveSubject> subjects) {
        for (IElectiveSubject iElectiveSubject : subjects) {
            modelOfferedSubjectsList.addElement(iElectiveSubject);
        }
    }

    private void fillStudents(List<IStudent> students) {
        for (IStudent student : students) {
            modelStudents.addElement(student);
        }
    }
    
    private void fillTeachers(List<ITeacher> teachers) {
        modelComboBoxTeachers.removeAllElements();
        modelComboBoxTeachers.addElement("Select teacher");
        modelComboBoxProposer.addElement("Select proposer");
        for (ITeacher teacher : teachers) {
            modelComboBoxTeachers.addElement(teacher);
            modelComboBoxProposer.addElement(teacher);
        }
    }
    
    private void fillProposer(List<IStudent> students) {
        for (IStudent student : students) {
            modelComboBoxProposer.addElement(student);
        }
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSelectFinal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListOfferedSubjects = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListFirstprior = new javax.swing.JList();
        jButtonAddFirst = new javax.swing.JButton();
        jButtonSubFirst = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListSecondPrior = new javax.swing.JList();
        jButtonAddSecond = new javax.swing.JButton();
        jButtonSubSecond = new javax.swing.JButton();
        jLabelinfo = new javax.swing.JLabel();
        jButtonSubmit = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxStudents = new javax.swing.JComboBox();
        AddSubject = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTitle = new javax.swing.JTextField();
        jComboBoxTeachers = new javax.swing.JComboBox();
        jButtonCommit = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jComboBoxProposers = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jScrollPane1.setViewportView(jListOfferedSubjects);

        jScrollPane2.setViewportView(jListFirstprior);

        jButtonAddFirst.setText("+");
        jButtonAddFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddFirstActionPerformed(evt);
            }
        });

        jButtonSubFirst.setText("-");
        jButtonSubFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubFirstActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jListSecondPrior);

        jButtonAddSecond.setText("+");
        jButtonAddSecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddSecondActionPerformed(evt);
            }
        });

        jButtonSubSecond.setText("-");
        jButtonSubSecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubSecondActionPerformed(evt);
            }
        });

        jLabelinfo.setText("Select your name and subjects");

        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("First priorities");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Second priorities");

        jComboBoxStudents.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelSelectFinalLayout = new javax.swing.GroupLayout(jPanelSelectFinal);
        jPanelSelectFinal.setLayout(jPanelSelectFinalLayout);
        jPanelSelectFinalLayout.setHorizontalGroup(
            jPanelSelectFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSelectFinalLayout.createSequentialGroup()
                .addGroup(jPanelSelectFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelSelectFinalLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(jPanelSelectFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSelectFinalLayout.createSequentialGroup()
                                .addComponent(jLabelinfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelSelectFinalLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(jPanelSelectFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelSelectFinalLayout.createSequentialGroup()
                                .addComponent(jButtonAddFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSubFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelSelectFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSelectFinalLayout.createSequentialGroup()
                                .addComponent(jButtonAddSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSubSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(229, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSelectFinalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSubmit)
                .addGap(172, 172, 172))
            .addGroup(jPanelSelectFinalLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel12)
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSelectFinalLayout.setVerticalGroup(
            jPanelSelectFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSelectFinalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelSelectFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelinfo)
                    .addComponent(jComboBoxStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSelectFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSelectFinalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jPanelSelectFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAddFirst)
                            .addComponent(jButtonSubFirst)
                            .addComponent(jButtonAddSecond)
                            .addComponent(jButtonSubSecond))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanelSelectFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSelectFinalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSubmit)
                .addGap(57, 57, 57))
        );

        getContentPane().add(jPanelSelectFinal, "card2");

        jLabel1.setText("Title");

        jLabel2.setText("Description");

        jLabel3.setText("Teacher");

        jTextFieldTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTitleActionPerformed(evt);
            }
        });

        jComboBoxTeachers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxTeachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTeachersActionPerformed(evt);
            }
        });

        jButtonCommit.setText("Commit");
        jButtonCommit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCommitActionPerformed(evt);
            }
        });

        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setRows(5);
        jScrollPane4.setViewportView(jTextAreaDescription);

        jComboBoxProposers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel14.setText("Proposer");

        javax.swing.GroupLayout AddSubjectLayout = new javax.swing.GroupLayout(AddSubject);
        AddSubject.setLayout(AddSubjectLayout);
        AddSubjectLayout.setHorizontalGroup(
            AddSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddSubjectLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(AddSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddSubjectLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddSubjectLayout.createSequentialGroup()
                        .addGroup(AddSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AddSubjectLayout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                                .addComponent(jButtonCommit))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddSubjectLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(AddSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel14))
                                .addGap(25, 25, 25)
                                .addGroup(AddSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxProposers, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxTeachers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(56, 56, 56))))
        );
        AddSubjectLayout.setVerticalGroup(
            AddSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddSubjectLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(AddSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(AddSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddSubjectLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2))
                    .addGroup(AddSubjectLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(AddSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxProposers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(jButtonCommit))
                .addGap(46, 46, 46))
        );

        getContentPane().add(AddSubject, "card5");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddFirstActionPerformed

        if (modelFirstprior.size() == 2) {
            jLabelinfo.setText("You have already selected too first priorties.");
        } else {
            Object selection = jListOfferedSubjects.getSelectedValue();
            if (selection == null) {
                jLabelinfo.setText("Please select a subject.");
            }
            modelOfferedSubjectsList.removeElement(selection);
            modelFirstprior.addElement(selection);
        }

    }//GEN-LAST:event_jButtonAddFirstActionPerformed

    private void jButtonSubFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubFirstActionPerformed
        Object selection = jListFirstprior.getSelectedValue();
        if (selection == null) {
            jLabelinfo.setText("Please select a subject from first prior");
        } else {
            modelFirstprior.removeElement(selection);
            modelOfferedSubjectsList.addElement(selection);
        }
    }//GEN-LAST:event_jButtonSubFirstActionPerformed

    private void jButtonAddSecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddSecondActionPerformed
        if (modelSecondprior.size() == 2) {
            jLabelinfo.setText("You have already selected too first priorties.");
        } else {
            Object selection = jListOfferedSubjects.getSelectedValue();
            if (selection == null) {
                jLabelinfo.setText("Please select a subject.");
            }
            modelOfferedSubjectsList.removeElement(selection);
            modelSecondprior.addElement(selection);
        }
    }//GEN-LAST:event_jButtonAddSecondActionPerformed

    private void jButtonSubSecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubSecondActionPerformed

        Object selection = jListSecondPrior.getSelectedValue();
        if (selection == null) {
            jLabelinfo.setText("Please select a subject.");
        }
        modelOfferedSubjectsList.addElement(selection);
        modelSecondprior.removeElement(selection);

    }//GEN-LAST:event_jButtonSubSecondActionPerformed

    private void jTextFieldTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTitleActionPerformed

    private void jComboBoxTeachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTeachersActionPerformed

    }//GEN-LAST:event_jComboBoxTeachersActionPerformed

    private void jButtonCommitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCommitActionPerformed
        /* Arg checking */
        Stack<String> errorStack = new Stack();
        if (jTextFieldTitle.getText().trim().isEmpty()) {
            errorStack.push("no title");
        }
        if (jComboBoxTeachers.getSelectedItem().toString().equals("Select teacher")) {
            errorStack.push("no teacher");
        }
        if (jTextAreaDescription.getText().trim().isEmpty()) {
            errorStack.push("no description");
        }
        if (jComboBoxProposers.getSelectedItem().toString().equals("Select proposer")) {
            errorStack.push("no proposer");
        }
        if (jTextAreaDescription.getText().length() > 255) {
            errorStack.push("description too long, max characters: 255");
        }

        if (errorStack.size() > 0) {
            String res = "Elective subject rejected: \n";
            for (String s : errorStack) {
                res += s + "\n";
            }
            JOptionPane.showMessageDialog(null, res, "Alert!", JOptionPane.ERROR_MESSAGE);

        } else { /* Arg checking end */

            // no missing information

            int result = JOptionPane.showConfirmDialog(null, "Are you sure", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                try {
                    // put it into the database here
                    facade.insertProposal(jTextFieldTitle.getText(), jTextAreaDescription.getText(), (ITeacher) jComboBoxTeachers.getSelectedItem(), jComboBoxProposers.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(null, "Successfully created your proposal", "Success!", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButtonCommitActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // save students priorities!
        
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(studentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddSubject;
    private javax.swing.JButton jButtonAddFirst;
    private javax.swing.JButton jButtonAddSecond;
    private javax.swing.JButton jButtonCommit;
    private javax.swing.JButton jButtonSubFirst;
    private javax.swing.JButton jButtonSubSecond;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JComboBox jComboBoxProposers;
    private javax.swing.JComboBox jComboBoxStudents;
    private javax.swing.JComboBox jComboBoxTeachers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelinfo;
    private javax.swing.JList jListFirstprior;
    private javax.swing.JList jListOfferedSubjects;
    private javax.swing.JList jListSecondPrior;
    private javax.swing.JPanel jPanelSelectFinal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextField jTextFieldTitle;
    // End of variables declaration//GEN-END:variables

    
}
