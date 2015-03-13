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
import com.ohnana.model.ElectiveSubject;
import com.ohnana.model.Student;
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
    private DefaultListModel modelListSelectedSubjects;
    private final List<IStudent> students;
    private DefaultComboBoxModel firstPrior1;
    private DefaultComboBoxModel firstPrior2;
    private DefaultComboBoxModel secondPrior1;
    private DefaultComboBoxModel secondPrior2;
    

    // CONSTRUCTOR
    public GUI() {
        initComponents();
        initUI();
        facade = Facade.getFacade();
        fillTeachers(facade.getAllTeachers());
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
        jComboBoxFirstPrior1.setModel(new DefaultComboBoxModel());
        jComboBoxFirstPrior2.setModel(new DefaultComboBoxModel());
        jComboBoxSecondPrior1.setModel(new DefaultComboBoxModel());
        jComboBoxSecondPrior2.setModel(new DefaultComboBoxModel());
        jListShowSelectedSubjects.setModel(new DefaultListModel());
        modelAddedProposals = (DefaultListModel) jListAddedProposals.getModel();
        modelProposals = (DefaultListModel) jListProposals.getModel();
        modelTablePools = (DefaultTableModel) jTablePools.getModel();
        modelList1dot1 = (DefaultListModel) jList1dot1.getModel();
        modelList1dot2 = (DefaultListModel) jList1dot2.getModel();
        modelList2dot2 = (DefaultListModel) jList2dot2.getModel();
        modelList1dot0 = (DefaultListModel) jList1dot0.getModel();
        modelList2dot0 = (DefaultListModel) jList2dot0.getModel();
        modelList0dot0 = (DefaultListModel) jList0dot0.getModel();
        modelListSelectedSubjects = (DefaultListModel) jListShowSelectedSubjects.getModel();
        firstPrior1 = (DefaultComboBoxModel) jComboBoxFirstPrior1.getModel();
        firstPrior2 = (DefaultComboBoxModel) jComboBoxFirstPrior2.getModel();
        secondPrior1 = (DefaultComboBoxModel) jComboBoxSecondPrior1.getModel();
        secondPrior2 = (DefaultComboBoxModel) jComboBoxSecondPrior2.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StudentsSelectFinal = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxFirstPrior1 = new javax.swing.JComboBox();
        jComboBoxFirstPrior2 = new javax.swing.JComboBox();
        jComboBoxSecondPrior2 = new javax.swing.JComboBox();
        jComboBoxSecondPrior1 = new javax.swing.JComboBox();
        jButtonSaveSelectFinal = new javax.swing.JButton();
        HoPFinalSelection = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
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
        jScrollPane4 = new javax.swing.JScrollPane();
        jListShowSelectedSubjects = new javax.swing.JList();
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
        AddSubject = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTitle = new javax.swing.JTextField();
        jComboBoxFillTeacher = new javax.swing.JComboBox();
        jButtonCommit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("First priorities");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Second priorities");

        jComboBoxFirstPrior1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxFirstPrior1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFirstPrior1ActionPerformed(evt);
            }
        });

        jComboBoxFirstPrior2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxSecondPrior2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxSecondPrior1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonSaveSelectFinal.setText("Save");

        javax.swing.GroupLayout StudentsSelectFinalLayout = new javax.swing.GroupLayout(StudentsSelectFinal);
        StudentsSelectFinal.setLayout(StudentsSelectFinalLayout);
        StudentsSelectFinalLayout.setHorizontalGroup(
            StudentsSelectFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentsSelectFinalLayout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addGroup(StudentsSelectFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxFirstPrior1, 0, 100, Short.MAX_VALUE)
                    .addComponent(jComboBoxSecondPrior1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(85, 85, 85)
                .addGroup(StudentsSelectFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxSecondPrior2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFirstPrior2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentsSelectFinalLayout.createSequentialGroup()
                .addContainerGap(259, Short.MAX_VALUE)
                .addGroup(StudentsSelectFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentsSelectFinalLayout.createSequentialGroup()
                        .addGroup(StudentsSelectFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(309, 309, 309))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentsSelectFinalLayout.createSequentialGroup()
                        .addComponent(jButtonSaveSelectFinal)
                        .addGap(93, 93, 93))))
        );
        StudentsSelectFinalLayout.setVerticalGroup(
            StudentsSelectFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentsSelectFinalLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel12)
                .addGap(26, 26, 26)
                .addGroup(StudentsSelectFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxFirstPrior1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFirstPrior2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(140, 140, 140)
                .addComponent(jLabel13)
                .addGap(51, 51, 51)
                .addGroup(StudentsSelectFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSecondPrior1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSecondPrior2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButtonSaveSelectFinal)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        getContentPane().add(StudentsSelectFinal, "card5");

        HoPFinalSelection.setPreferredSize(new java.awt.Dimension(650, 540));

        jPanel3.setPreferredSize(new java.awt.Dimension(650, 540));

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

        jListShowSelectedSubjects.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jListShowSelectedSubjects);

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel4))
                                    .addGap(21, 21, 21)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addGap(338, 338, 338)
                                    .addComponent(jLabel10))
                                .addGroup(jPanel3Layout.createSequentialGroup()
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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(50, 50, 50)
                            .addComponent(jLabel6)
                            .addGap(74, 74, 74)
                            .addComponent(jLabel7)
                            .addGap(57, 57, 57)
                            .addComponent(jLabel8)
                            .addGap(64, 64, 64)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButtonShowSelectedSubjects)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSave))))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 169, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonShowSelectedSubjects)
                    .addComponent(jButtonSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HoPFinalSelectionLayout = new javax.swing.GroupLayout(HoPFinalSelection);
        HoPFinalSelection.setLayout(HoPFinalSelectionLayout);
        HoPFinalSelectionLayout.setHorizontalGroup(
            HoPFinalSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoPFinalSelectionLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        HoPFinalSelectionLayout.setVerticalGroup(
            HoPFinalSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(HoPFinalSelection, "card4");

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
                        .addComponent(jButtonSaveRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        HoP1RoundSelectionLayout.setVerticalGroup(
            HoP1RoundSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HoP1RoundSelectionLayout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
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

        AddSubject.setPreferredSize(new java.awt.Dimension(650, 540));

        jLabel1.setText("Title");

        jLabel2.setText("Description");

        jLabel3.setText("Teachers");

        jTextFieldTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTitleActionPerformed(evt);
            }
        });

        jComboBoxFillTeacher.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxFillTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFillTeacherActionPerformed(evt);
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
        jScrollPane1.setViewportView(jTextAreaDescription);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)
                                .addComponent(jComboBoxFillTeacher, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                                .addComponent(jButtonCommit)))
                        .addGap(56, 56, 56))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFillTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCommit))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout AddSubjectLayout = new javax.swing.GroupLayout(AddSubject);
        AddSubject.setLayout(AddSubjectLayout);
        AddSubjectLayout.setHorizontalGroup(
            AddSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AddSubjectLayout.setVerticalGroup(
            AddSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(AddSubject, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    //METHODS 
//    public IStudent sortStudent(Student student, String blokA, String blokB) {
//        
//        boolean firstPrioA = false;
//        boolean firstPrioB = false;
//        boolean secondPrioA = false;
//        boolean secondPrioB = false;
//        
//        List<String> studentFirstPrio = student.getFirstP();
//        List<String> studentSecondPrio = student.getSecondP();
//        
//        if(blokA.equals(studentFirstPrio.get(0)) && blokB.equals(studentFirstPrio.get(1))) {
//            // SCENARIO: 1,1
//            
//            return null;
//        }
//        if(blokA.equals(studentFirstPrio.get(0)) || blokB.equals(studentFirstPrio.get(1))) {
//            // SCENARIO: 1,2
//            
//            return null;
//        }
//        
//        return null;
//    }

    private void jTextFieldTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTitleActionPerformed

    private void jButtonRemoveProposalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveProposalActionPerformed
        if (jListAddedProposals.getSelectedIndex() != -1) {
            modelProposals.addElement(jListAddedProposals.getSelectedValue());
            modelAddedProposals.removeElementAt(jListAddedProposals.getSelectedIndex());
        }
    }//GEN-LAST:event_jButtonRemoveProposalActionPerformed

    private void jComboBoxFillTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFillTeacherActionPerformed

    }//GEN-LAST:event_jComboBoxFillTeacherActionPerformed

    private void jButtonCommitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCommitActionPerformed
        Stack<String> errorStack = new Stack();
        if (jTextFieldTitle.getText().trim().isEmpty()) {
            errorStack.push("no title");
        }
        if (jComboBoxFillTeacher.getSelectedItem().toString().equals("Select teacher")) {
            errorStack.push("no teacher");
        }
        if (jTextAreaDescription.getText().trim().isEmpty()) {
            errorStack.push("no description");
        }

        if (errorStack.size() > 0) {
            String res = "Elective subject rejected: \n";
            for (String s : errorStack) {
                res += s + "\n";
            }
            JOptionPane.showMessageDialog(null, res, "Alert!", JOptionPane.ERROR_MESSAGE);
        } else {
            // no missing information
            int result = JOptionPane.showConfirmDialog(null, "Are you sure", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                try {
                    // put it into the database here
                    facade.insertProposal(jTextFieldTitle.getText(), jTextAreaDescription.getText(), (ITeacher) jComboBoxFillTeacher.getSelectedItem());
                    JOptionPane.showMessageDialog(null, "Successfully created your proposal", "Success!", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButtonCommitActionPerformed

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

    private void jComboBoxFirstPrior1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFirstPrior1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFirstPrior1ActionPerformed

    private void fillTeachers(List<ITeacher> teachers) {
        jComboBoxFillTeacher.removeAllItems();
        jComboBoxFillTeacher.addItem("Select teacher");
        for (ITeacher teacher : teachers) {
            jComboBoxFillTeacher.addItem(teacher);
        }
    }

    private void clearAllListsInFinalSelection() {
        modelList1dot1.removeAllElements();
        modelList1dot2.removeAllElements();
        modelList2dot2.removeAllElements();
        modelList1dot0.removeAllElements();
        modelList2dot0.removeAllElements();
        modelList0dot0.removeAllElements();
        modelListSelectedSubjects.removeAllElements();

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
            analyzeStudents();
        }
    }

    private void analyzeStudents() {
        clearAllListsInFinalSelection();
        List<String> selections = new ArrayList(); // list for subjects checked off
        // loop through the table
        for (int i = 0; i < modelTablePools.getRowCount(); i++) {
            // if its checked off, add the text next to it
            if ((boolean) modelTablePools.getValueAt(i, 0) == true) {
                selections.add(modelTablePools.getValueAt(i, 1).toString());
            }
            if ((boolean) modelTablePools.getValueAt(i, 2) == true) {
                selections.add(modelTablePools.getValueAt(i, 3).toString());
            }
        }
        // loop through students, checking their priorities against the selections in the table
        for (IStudent student : students) {
            String firstA = student.getFirstP().get(0);
            String firstB = student.getFirstP().get(1);
            String secondA = student.getSecondP().get(0);
            String secondB = student.getSecondP().get(1);
            boolean isFirstA = false;
            boolean isFirstB = false;
            boolean isSecondA = false;
            boolean isSecondB = false;
            for (String s : selections) {
                if (firstA.equals(s)) {
                    isFirstA = true;
                }
                if (firstB.equals(s)) {
                    isFirstB = true;
                }
                if (secondA.equals(s)) {
                    isSecondA = true;
                }
                if (secondB.equals(s)) {
                    isSecondB = true;
                }
            }

            // adding them to the right list if they match
            if (isFirstA && isFirstB) {
                //Scenario 1,1
                modelList1dot1.addElement(student);
            } else if (isFirstA && isSecondA || isFirstB && isSecondA || isFirstA && isSecondB || isFirstB && isSecondB) {
                //Scenario 1,2
                modelList1dot2.addElement(student);
            } else if (isSecondA && isSecondB) {
                //Scenario 2,2
                modelList2dot2.addElement(student);
            } else if (isFirstA && (!isSecondA && !isSecondB) || isFirstB && (!isSecondA && !isSecondB)) {
                //Scenario 1,0
                modelList1dot0.addElement(student);
            } else if (isSecondA && (!isFirstA && !isFirstB) || isSecondB && (!isFirstA && !isFirstB)) {
                //Scenario 2,0
                modelList2dot0.addElement(student);
            } else if (!isFirstA && !isFirstB && !isSecondA && !isSecondB) {
                //Scenario 0,0
                modelList0dot0.addElement(student);
            }
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
    private javax.swing.JPanel AddSubject;
    private javax.swing.JPanel HoP1RoundSelection;
    private javax.swing.JPanel HoPFinalSelection;
    private javax.swing.JPanel StudentsSelectFinal;
    private javax.swing.JButton jButtonAddProposal;
    private javax.swing.JButton jButtonCommit;
    private javax.swing.JButton jButtonRemoveProposal;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSaveRound1;
    private javax.swing.JButton jButtonSaveSelectFinal;
    private javax.swing.JButton jButtonShowSelectedSubjects;
    private javax.swing.JComboBox jComboBoxFillTeacher;
    private javax.swing.JComboBox jComboBoxFirstPrior1;
    private javax.swing.JComboBox jComboBoxFirstPrior2;
    private javax.swing.JComboBox jComboBoxSecondPrior1;
    private javax.swing.JComboBox jComboBoxSecondPrior2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JList jListShowSelectedSubjects;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTablePools;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextField jTextFieldTitle;
    // End of variables declaration//GEN-END:variables
}
