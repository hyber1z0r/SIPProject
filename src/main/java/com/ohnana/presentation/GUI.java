/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ohnana.presentation;

import com.ohnana.control.Facade;
import com.ohnana.interfaces.IElectiveSubject;
import com.ohnana.interfaces.IProposal;
import com.ohnana.interfaces.IStudent;
import com.ohnana.interfaces.ITeacher;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Filipovic
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    
    //FIELDS 
    private final Facade facade;
    private String user = "PELO";
    private DefaultListModel modelAddedProposals;
    private DefaultListModel modelProposals;
    private DefaultTableModel modelTablePools;
    private DefaultListModel modelList1dot1;
    private DefaultListModel modelList1dot2;
    private DefaultListModel modelList2dot2;
    private DefaultListModel modelList1dot0;
    private DefaultListModel modelList2dot0;
    private DefaultListModel modelList0dot0;

    private final List<IStudent> students;

    public GUI() {
        initComponents();
        initUI();
        facade = Facade.getFacade();
        fillList1Round(facade.getAllProposals());
        fillPools(facade.getAllElectiveSubject());
        students = facade.getAllStudents();
        analyzeStudents();
    }

    private void initUI() {
        jListProposals.setModel(new DefaultListModel());
        jListAddedProposals.setModel(new DefaultListModel());
        jTablePools.setModel(new DefaultTableModel() {
            {
                this.addColumn("");
                this.addColumn("Pool A");
                this.addColumn("");
                this.addColumn("Pool B");
            }

            Class[] classes = new Class[]{
                Boolean.class, String.class,
                Boolean.class, String.class
            };

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return classes[columnIndex];
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                switch (column) {
                    case 0:
                        return true;
                    case 1:
                        return false;
                    case 2:
                        return true;
                    case 3:
                        return false;
                    default:
                        return false;
                }
            }

        });
        jTablePools.getColumnModel().getColumn(0).setPreferredWidth(15);
        jTablePools.getColumnModel().getColumn(2).setPreferredWidth(15);
        jTablePools.setColumnSelectionAllowed(false);
        jTablePools.setRowSelectionAllowed(false);
        jTablePools.setShowGrid(false);

        jList1dot1.setModel(new DefaultListModel());
        jList1dot2.setModel(new DefaultListModel());
        jList2dot2.setModel(new DefaultListModel());
        jList1dot0.setModel(new DefaultListModel());
        jList2dot0.setModel(new DefaultListModel());
        jList0dot0.setModel(new DefaultListModel());
        

        modelAddedProposals = (DefaultListModel) jListAddedProposals.getModel();
        modelProposals = (DefaultListModel) jListProposals.getModel();
        modelTablePools = (DefaultTableModel) jTablePools.getModel();
        modelList1dot1 = (DefaultListModel) jList1dot1.getModel();
        modelList1dot2 = (DefaultListModel) jList1dot2.getModel();
        modelList2dot2 = (DefaultListModel) jList2dot2.getModel();
        modelList1dot0 = (DefaultListModel) jList1dot0.getModel();
        modelList2dot0 = (DefaultListModel) jList2dot0.getModel();
        modelList0dot0 = (DefaultListModel) jList0dot0.getModel();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HoPFinalSelection = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList1dot1 = new javax.swing.JList();
        jButtonSave = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jList2dot2 = new javax.swing.JList();
        jScrollPane11 = new javax.swing.JScrollPane();
        jList1dot2 = new javax.swing.JList();
        jScrollPane12 = new javax.swing.JScrollPane();
        jList1dot0 = new javax.swing.JList();
        jScrollPane13 = new javax.swing.JScrollPane();
        jList2dot0 = new javax.swing.JList();
        jScrollPane14 = new javax.swing.JScrollPane();
        jList0dot0 = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButtonShowSelectedSubjects = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTablePools = new javax.swing.JTable();
        HoP1RoundSelection = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListProposals = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListAddedProposals = new javax.swing.JList();
        jButtonAddProposal = new javax.swing.JButton();
        jButtonRemoveProposal = new javax.swing.JButton();
        jButtonSaveRound1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        HoPFinalSelection.setPreferredSize(new java.awt.Dimension(650, 540));

        jList1dot1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList1dot1);

        jButtonSave.setText("Save Subjects");

        jList2dot2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane9.setViewportView(jList2dot2);

        jList1dot2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane11.setViewportView(jList1dot2);

        jList1dot0.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane12.setViewportView(jList1dot0);

        jList2dot0.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane13.setViewportView(jList2dot0);

        jList0dot0.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane14.setViewportView(jList0dot0);

        jLabel4.setText("(1,1)");

        jLabel5.setText("(1,2)");

        jLabel6.setText("(2,2)");

        jLabel7.setText("(1,0)");

        jLabel8.setText("(2,0)");

        jLabel9.setText("(0,0)");

        jLabel10.setText("Very unhappy");

        jLabel11.setText("Very happy");

        jButtonShowSelectedSubjects.setText("Show Selected Subjects");

        jTablePools.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(jTablePools);

        javax.swing.GroupLayout HoPFinalSelectionLayout = new javax.swing.GroupLayout(HoPFinalSelection);
        HoPFinalSelection.setLayout(HoPFinalSelectionLayout);
        HoPFinalSelectionLayout.setHorizontalGroup(
            HoPFinalSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoPFinalSelectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HoPFinalSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HoPFinalSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HoPFinalSelectionLayout.createSequentialGroup()
                            .addGroup(HoPFinalSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(HoPFinalSelectionLayout.createSequentialGroup()
                                    .addGroup(HoPFinalSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel4))
                                    .addGap(21, 21, 21)))
                            .addGroup(HoPFinalSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HoPFinalSelectionLayout.createSequentialGroup()
                                    .addGap(338, 338, 338)
                                    .addComponent(jLabel10))
                                .addGroup(HoPFinalSelectionLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HoPFinalSelectionLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(50, 50, 50)
                            .addComponent(jLabel6)
                            .addGap(74, 74, 74)
                            .addComponent(jLabel7)
                            .addGap(57, 57, 57)
                            .addComponent(jLabel8)
                            .addGap(64, 64, 64)
                            .addComponent(jLabel9)))
                    .addGroup(HoPFinalSelectionLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButtonShowSelectedSubjects)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSave))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 172, Short.MAX_VALUE))
        );
        HoPFinalSelectionLayout.setVerticalGroup(
            HoPFinalSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoPFinalSelectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HoPFinalSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(HoPFinalSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HoPFinalSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(HoPFinalSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonShowSelectedSubjects)
                    .addComponent(jButtonSave))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        getContentPane().add(HoPFinalSelection, "card5");

        HoP1RoundSelection.setPreferredSize(new java.awt.Dimension(650, 540));

        jListProposals.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListProposals);

        jListAddedProposals.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jListAddedProposals);

        jButtonAddProposal.setText("-------->");
        jButtonAddProposal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddProposalActionPerformed(evt);
            }
        });

        jButtonRemoveProposal.setText("<--------");
        jButtonRemoveProposal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveProposalActionPerformed(evt);
            }
        });

        jButtonSaveRound1.setText("Save round");
        jButtonSaveRound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveRound1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Select the elective subject that YOU like");

        javax.swing.GroupLayout HoP1RoundSelectionLayout = new javax.swing.GroupLayout(HoP1RoundSelection);
        HoP1RoundSelection.setLayout(HoP1RoundSelectionLayout);
        HoP1RoundSelectionLayout.setHorizontalGroup(
            HoP1RoundSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoP1RoundSelectionLayout.createSequentialGroup()
                .addGroup(HoP1RoundSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HoP1RoundSelectionLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(HoP1RoundSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAddProposal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRemoveProposal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HoP1RoundSelectionLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jButtonSaveRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HoP1RoundSelectionLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel12)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        HoP1RoundSelectionLayout.setVerticalGroup(
            HoP1RoundSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HoP1RoundSelectionLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(36, 36, 36)
                .addGroup(HoP1RoundSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HoP1RoundSelectionLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButtonAddProposal)
                        .addGap(138, 138, 138)
                        .addComponent(jButtonRemoveProposal)))
                .addGap(31, 31, 31)
                .addComponent(jButtonSaveRound1)
                .addGap(23, 23, 23))
        );

        getContentPane().add(HoP1RoundSelection, "card3");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButtonRemoveProposalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveProposalActionPerformed
        if (jListAddedProposals.getSelectedIndex() != -1) {
            modelProposals.addElement(jListAddedProposals.getSelectedValue());
            modelAddedProposals.removeElementAt(jListAddedProposals.getSelectedIndex());
        }
    }//GEN-LAST:event_jButtonRemoveProposalActionPerformed

    private void jButtonAddProposalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddProposalActionPerformed
        if (jListProposals.getSelectedIndex() != -1) {
            modelAddedProposals.addElement(jListProposals.getSelectedValue());
            modelProposals.removeElementAt(jListProposals.getSelectedIndex());
        }
    }//GEN-LAST:event_jButtonAddProposalActionPerformed

    private void jButtonSaveRound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveRound1ActionPerformed
        Object[] round1Array = modelAddedProposals.toArray();
        List<IProposal> proposals = new ArrayList();
        for (Object o : round1Array) {
            proposals.add((IProposal) o);
        }
        try {
            facade.insertElectiveSubjects(proposals);
            JOptionPane.showMessageDialog(null, "Successfully created round 1", "Success!", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSaveRound1ActionPerformed

    

    private void clearAllListsInFinalSelection() {
        modelList1dot1.removeAllElements();
        modelList1dot2.removeAllElements();
        modelList2dot2.removeAllElements();
        modelList1dot0.removeAllElements();
        modelList2dot0.removeAllElements();
        modelList0dot0.removeAllElements();

    }

    private void fillList1Round(List<IProposal> proposals) {
        for (IProposal proposal : proposals) {
            modelProposals.addElement(proposal);
        }
    }

    private void fillPools(List<IElectiveSubject> es) {
        modelTablePools.setRowCount(es.size());
        for (int i = 0; i < es.size(); i++) {
            modelTablePools.setValueAt(false, i, 0); // check pool a
            modelTablePools.setValueAt(es.get(i), i, 1); // pool a
            modelTablePools.setValueAt(false, i, 2); // check pool b
            modelTablePools.setValueAt(es.get(i), i, 3); // pool b
        }
        modelTablePools.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                tablePoolsChanged(e);
            }
        });

    }

    private void tablePoolsChanged(TableModelEvent e) {
        // if you check in the left, you uncheck in the corrosponding right and vice versa
        int rowChanged = e.getFirstRow();
        int colChanged = e.getColumn();
        boolean valueAt = (boolean) modelTablePools.getValueAt(rowChanged, colChanged);
        if (valueAt) {
            modelTablePools.setValueAt(false, rowChanged, colChanged == 0 ? 2 : 0);
            // calculate students algorithm
            
        }
        analyzeStudents();
    }

    
     private void analyzeStudents() {
        clearAllListsInFinalSelection();
        List<String> selections = new ArrayList(); // list for subjects checked off
        
        //selections A & B pool
        List<String> selectionsA = new ArrayList();
        List<String> selectionsB = new ArrayList();
        

        // loop through the table
        for (int i = 0; i < modelTablePools.getRowCount(); i++) {
            // if its checked off, add the text next to it
            if ((boolean) modelTablePools.getValueAt(i, 0) == true) {
                //selections.add(modelTablePools.getValueAt(i, 1).toString());
                selectionsA.add(modelTablePools.getValueAt(i, 1).toString());
            }
            if ((boolean) modelTablePools.getValueAt(i, 2) == true) {
                //selections.add(modelTablePools.getValueAt(i, 3).toString());
                selectionsB.add(modelTablePools.getValueAt(i, 3).toString());
            }
        }
        
         //loop through students, checking their priorities against the selections in the table
        for (IStudent student : students) {
            String firstA = student.getFirstP().get(0);
            String firstB = student.getFirstP().get(1);
            String secondA = student.getSecondP().get(0);
            String secondB = student.getSecondP().get(1);
            
            boolean AisFirstA = false;
            boolean AisFirstB = false;
            boolean AisSecondA = false;
            boolean AisSecondB = false;
          
            boolean BisFirstA = false;
            boolean BisFirstB = false;
            boolean BisSecondA = false;
            boolean BisSecondB = false;

            
            //Anders TEST
            for (String string : selectionsA) {
                
                if(string.equals(firstA)) {
                    AisFirstA = true;
                }
                if(string.equals(firstB)) {
                    AisFirstB = true;
                }
                if(string.equals(secondA)) {
                    AisSecondA = true;
                }
                if(string.equals(secondB)) {
                    AisSecondB = true;
                }
            }
            for (String string : selectionsB) {
                
                if(string.equals(firstA)) {
                    BisFirstA = true;
                }
                if(string.equals(firstB)) {
                    BisFirstB = true;
                }
                if(string.equals(secondA)) {
                    BisSecondA = true;
                }
                if(string.equals(secondB)) {
                    BisSecondB = true;
                }
            }
            // 1.1 SCENARIO
            if((AisFirstA && BisFirstB) || (AisFirstB && BisFirstA)) {
                modelList1dot1.addElement(student);                
            }
            
            // 1.2 SCENARIO
            else if( ((AisFirstA || AisFirstB) && (BisSecondA || BisSecondB))
                    || ((BisFirstA || BisFirstB) && (AisSecondA || AisSecondB))) {
                
                modelList1dot2.addElement(student);
            
            }
            // 2.2 SCENARIO
            else if((AisSecondA || AisSecondB) && (BisSecondA || BisSecondB)) {
                
                modelList2dot2.addElement(student);
            
            }
            
            // 1.0 SCENARIO
            else if((AisFirstA || AisFirstB) || (BisFirstA || BisFirstB)) {
              
                modelList1dot0.addElement(student);
            }
            
            // 2.0 SCENARIO
            else if((AisSecondA || AisSecondB) || (BisSecondA || BisSecondB)) {
                
                modelList2dot0.addElement(student);
            }
            
            // 0.0 SCENARIO
            else {

                modelList0dot0.addElement(student);
                
            }
            
            //-----------
            
            
            
//            for (String s : selections) {
//                if (firstA.equals(s)) {
//                    isFirstA = true;
//                }
//                if (firstB.equals(s)) {
//                    isFirstB = true;
//                }
//                if (secondA.equals(s)) {
//                    isSecondA = true;
//                }
//                if (secondB.equals(s)) {
//                    isSecondB = true;
//                }
//            }
//
//            // adding them to the right list if they match
//            if (isFirstA && isFirstB) {
//                //Scenario 1,1
//                modelList1dot1.addElement(student);
//            } else if (isFirstA && isSecondA || isFirstB && isSecondA || isFirstA && isSecondB || isFirstB && isSecondB) {
//                //Scenario 1,2
//                modelList1dot2.addElement(student);
//            } else if (isSecondA && isSecondB) {
//                //Scenario 2,2
//                modelList2dot2.addElement(student);
//            } else if (isFirstA && (!isSecondA && !isSecondB) || isFirstB && (!isSecondA && !isSecondB)) {
//                //Scenario 1,0
//                modelList1dot0.addElement(student);
//            } else if (isSecondA && (!isFirstA && !isFirstB) || isSecondB && (!isFirstA && !isFirstB)) {
//                //Scenario 2,0
//                modelList2dot0.addElement(student);
//            } else if (!isFirstA && !isFirstB && !isSecondA && !isSecondB) {
//                //Scenario 0,0
//                modelList0dot0.addElement(student);
//            }
        }
    }

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HoP1RoundSelection;
    private javax.swing.JPanel HoPFinalSelection;
    private javax.swing.JButton jButtonAddProposal;
    private javax.swing.JButton jButtonRemoveProposal;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSaveRound1;
    private javax.swing.JButton jButtonShowSelectedSubjects;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList0dot0;
    private javax.swing.JList jList1dot0;
    private javax.swing.JList jList1dot1;
    private javax.swing.JList jList1dot2;
    private javax.swing.JList jList2dot0;
    private javax.swing.JList jList2dot2;
    private javax.swing.JList jListAddedProposals;
    private javax.swing.JList jListProposals;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTablePools;
    // End of variables declaration//GEN-END:variables
}
