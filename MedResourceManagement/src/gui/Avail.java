/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import medresourcemanagement.Doctor;

/**
 *
 * @author b00712596
 */
public class Avail extends javax.swing.JPanel {

    private Register reg;
    private boolean isAvailable;
    private JFrame parent;
    private String day;

    private SelectBox listen;
    Doctor doc1, doc2, doc3, doc4, doc5, doc6, doc7, doc8, doc9, doc10;

    /**
     * Creates new form Avail
     */
    public Avail(Register reg, JFrame parent) {
        initComponents();
        this.reg = reg;
        this.parent = parent;

        //set the current day and time
        Date now = new Date();
        SimpleDateFormat simpleDate = new SimpleDateFormat("E");
        System.out.println(simpleDate.format(now));
        day = simpleDate.format(now);
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);

        listen = new SelectBox(jComboBox1);
        jComboBox1.addActionListener(listen);
        String spec = listen.getOutput();

    }
      private void colourChanger(String[] names) {
        int[] x;
        //first label
        jLabel1.setText(names[0]);
        x = reg.searchReg(names[0]);
        try {
            doc1 = reg.getDoc(x);
        } catch (NullPointerException ex) {
            System.err.println("Can't find a doc!");
        }
        jLabel1.setText(names[0]);
        if (names[0] == "null") {
            jTextField2.setBackground(Color.GRAY);
        } else {
            //set to a colour
            try {
                setColour(jTextField2, doc1);
            } catch (Exception ex) {
                System.err.println("Couldn't find a doc to set colour");
            }
        }

        //second label
        x = reg.searchReg(names[1]);
        try {
            doc2 = reg.getDoc(x);
        } catch (NullPointerException ex) {
            System.err.println("Can't find a doc!");
        }
        jLabel3.setText(names[1]);
        if (names[1] == "null") {
            jTextField3.setBackground(Color.GRAY);
        } else {
            //set to a colour
            try {
                setColour(jTextField3, doc2);
            } catch (Exception ex) {
                System.err.println("Couldn't find a doc to set colour");
            }
        }
        //third  label
        x = reg.searchReg(names[2]);
        try {
            doc3 = reg.getDoc(x);
        } catch (NullPointerException ex) {
            System.err.println("Can't find a doc!");
        }
        //end
        jLabel4.setText(names[2]);
        if (names[2] == "null") {
            jTextField4.setBackground(Color.GRAY);
        } else {
            //set to a colour
            try {
                setColour(jTextField4, doc3);
            } catch (Exception ex) {
                System.err.println("Couldn't find a doc to set colour");
            }
        }
        //forth  label
        x = reg.searchReg(names[3]);
        try {
            doc4 = reg.getDoc(x);
        } catch (NullPointerException ex) {
            System.err.println("Can't find a doc!");
        }
        //end
        jLabel5.setText(names[3]);
        if (names[3] == "null") {
            jTextField5.setBackground(Color.GRAY);
        } else {
            //set to a colour
            try {
                setColour(jTextField5, doc4);
            } catch (Exception ex) {
                System.err.println("Couldn't find a doc to set colour");
            }
        }
        //fifth  label
        x = reg.searchReg(names[4]);
        try {
            doc5 = reg.getDoc(x);
        } catch (NullPointerException ex) {
            System.err.println("Can't find a doc!");
        }
        //end
        jLabel10.setText(names[4]);
        if (names[4] == "null") {
            jTextField6.setBackground(Color.GRAY);
        } else {
            //set to a colour
            try {
                setColour(jTextField6, doc5);
            } catch (Exception ex) {
                System.err.println("Couldn't find a doc to set colour");
            }
        }
        //six  label
        x = reg.searchReg(names[5]);
        try {
            doc6 = reg.getDoc(x);
        } catch (NullPointerException ex) {
            System.err.println("Can't find a doc!");
        }
        //end
        jLabel6.setText(names[5]);
        if (names[5] == "null") {
            jTextField7.setBackground(Color.GRAY);
        } else {
            //set to a colour
            try {
                setColour(jTextField7, doc6);
            } catch (Exception ex) {
                System.err.println("Couldn't find a doc to set colour");
            }
        }
        //7  label
        x = reg.searchReg(names[6]);
        try {
            doc7 = reg.getDoc(x);
        } catch (NullPointerException ex) {
            System.err.println("Can't find a doc!");
        }
        //end
        jLabel7.setText(names[6]);
        if (names[6] == "null") {
            jTextField8.setBackground(Color.GRAY);
        } else {
            //set to a colour
            try {
                setColour(jTextField8, doc7);
            } catch (Exception ex) {
                System.err.println("Couldn't find a doc to set colour");
            }
        }
        //8  label
        x = reg.searchReg(names[2]);
        try {
            doc8 = reg.getDoc(x);
        } catch (NullPointerException ex) {
            System.err.println("Can't find a doc!");
        }
        //end
        jLabel8.setText(names[7]);
        if (names[7] == "null") {
            jTextField9.setBackground(Color.GRAY);
        } else {
            //set to a colour
            try {
                setColour(jTextField9, doc8);
            } catch (Exception ex) {
                System.err.println("Couldn't find a doc to set colour");
            }
        }
        //9  label
        x = reg.searchReg(names[8]);
        try {
            doc9 = reg.getDoc(x);
        } catch (NullPointerException ex) {
            System.err.println("Can't find a doc!");
        }
        //end
        jLabel9.setText(names[8]);
        if (names[8] == "null") {
            jTextField10.setBackground(Color.GRAY);
        } else {
            //set to a colour
            try {
                setColour(jTextField10, doc9);
            } catch (Exception ex) {
                System.err.println("Couldn't find a doc to set colour");
            }
        }
        //10  label
        x = reg.searchReg(names[9]);
        try {
            doc10 = reg.getDoc(x);
        } catch (NullPointerException ex) {
            System.err.println("Can't find a doc!");
        }
        //end
        jLabel11.setText(names[9]);
        if (names[9] == "null") {
            jTextField11.setBackground(Color.GRAY);
        } else {
            //set to a colour
            try {
                setColour(jTextField11, doc10);
            } catch (Exception ex) {
                System.err.println("Couldn't find a doc to set colour");
            }
        }
    }

    private void setColour(JTextField jTextField, Doctor doc) {
        LocalTime timeNow = LocalTime.now();
        LocalTime[] startAndEnd = new LocalTime[2];
        switch (day) {
            case "Sun":
                startAndEnd = doc.getDayTimes(day);
                if (startAndEnd[0] == startAndEnd[1]) {
                    System.out.println("unavailable");
                    jTextField.setBackground(Color.red);
                } else if (startAndEnd[0].isBefore(timeNow) && startAndEnd[1].isAfter(timeNow)) {
                    jTextField.setBackground(Color.green);
                } else {
                    jTextField.setBackground(Color.red);
                }

                break;
            case "Mon":
                startAndEnd = doc.getDayTimes(day);
                if (startAndEnd[0] == startAndEnd[1]) {
                    System.out.println("unavailable");
                    jTextField.setBackground(Color.red);
                } else if (startAndEnd[0].isBefore(timeNow) && startAndEnd[1].isAfter(timeNow)) {
                    jTextField.setBackground(Color.green);
                } else {
                    jTextField.setBackground(Color.red);
                }

                break;

            case "Tue":
                startAndEnd = doc.getDayTimes(day);
                if (startAndEnd[0] == startAndEnd[1]) {
                    System.out.println("unavailable");
                    jTextField.setBackground(Color.red);
                } else if (startAndEnd[0].isBefore(timeNow) && startAndEnd[1].isAfter(timeNow)) {
                    jTextField.setBackground(Color.green);
                } else {
                    jTextField.setBackground(Color.red);
                }

                break;

            case "Wed":
                startAndEnd = doc.getDayTimes(day);
                if (startAndEnd[0] == startAndEnd[1]) {
                    System.out.println("unavailable");
                    jTextField.setBackground(Color.red);
                } else if (startAndEnd[0].isBefore(timeNow) && startAndEnd[1].isAfter(timeNow)) {
                    jTextField.setBackground(Color.green);
                } else {
                    jTextField.setBackground(Color.red);
                }

                break;

            case "Thu":
                startAndEnd = doc.getDayTimes(day);
                if (startAndEnd[0] == startAndEnd[1]) {
                    System.out.println("unavailable");
                    jTextField.setBackground(Color.red);
                } else if (startAndEnd[0].isBefore(timeNow) && startAndEnd[1].isAfter(timeNow)) {
                    jTextField.setBackground(Color.green);
                } else {
                    jTextField.setBackground(Color.red);
                }

                break;

            case "Fri":
                startAndEnd = doc.getDayTimes(day);
                if (startAndEnd[0] == startAndEnd[1]) {
                    System.out.println("unavailable");
                    jTextField.setBackground(Color.red);
                } else if (startAndEnd[0].isBefore(timeNow) && startAndEnd[1].isAfter(timeNow)) {
                    jTextField.setBackground(Color.green);
                } else {
                    jTextField.setBackground(Color.red);
                }

                break;

            case "Sat":
                startAndEnd = doc.getDayTimes(day);
                if (startAndEnd[0] == startAndEnd[1]) {
                    System.out.println("unavailable");
                    jTextField.setBackground(Color.red);
                } else if (startAndEnd[0].isBefore(timeNow) && startAndEnd[1].isAfter(timeNow)) {
                    jTextField.setBackground(Color.green);
                } else {
                    jTextField.setBackground(Color.red);
                }

                break;

            default:

                break;

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

        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel2.setText("Please select Doctor Speciality");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Please Select--", "Cardiology", "Pulmonology", "Infectious Disease", "Hematology", "Intensive Care Medicine", "Neurology", "Ophthalmology", "Orthopedics", "Urology", "Surgery" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField2.setBackground(java.awt.Color.lightGray);
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextField3.setBackground(java.awt.Color.lightGray);

        jTextField4.setBackground(java.awt.Color.lightGray);

        jTextField5.setBackground(java.awt.Color.lightGray);

        jTextField6.setBackground(new java.awt.Color(204, 204, 204));

        jTextField7.setBackground(java.awt.Color.lightGray);

        jTextField8.setBackground(java.awt.Color.lightGray);

        jTextField9.setBackground(java.awt.Color.lightGray);

        jTextField10.setBackground(java.awt.Color.lightGray);

        jTextField11.setBackground(new java.awt.Color(204, 204, 204));
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jLabel1.setText("Doc 1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClick(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Avail.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
        });

        jLabel3.setText("Doc 2");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEntered1(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        jLabel4.setText("Doc 3");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        jLabel5.setText("Doc 4");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        jLabel6.setText("Doc 6");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        jLabel7.setText("Doc 7");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        jLabel8.setText("Doc 8");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        jLabel9.setText("Doc 9");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });

        jLabel10.setText("Doc 5");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });

        jLabel11.setText("Doc 10");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                        .addComponent(jTextField5)
                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField4)
                        .addComponent(jTextField7)
                        .addComponent(jTextField8)
                        .addComponent(jTextField9)
                        .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel5))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        //reset color
        jTextField2.setBackground(Color.LIGHT_GRAY);
        jTextField10.setBackground(Color.LIGHT_GRAY);
        jTextField11.setBackground(Color.LIGHT_GRAY);
        jTextField3.setBackground(Color.LIGHT_GRAY);
        jTextField4.setBackground(Color.LIGHT_GRAY);
        jTextField5.setBackground(Color.LIGHT_GRAY);
        jTextField6.setBackground(Color.LIGHT_GRAY);
        jTextField7.setBackground(Color.LIGHT_GRAY);
        jTextField8.setBackground(Color.LIGHT_GRAY);
        jTextField9.setBackground(Color.LIGHT_GRAY);
        if (jComboBox1.getSelectedItem().toString().equals("Cardiology")) {
            String[] names = reg.cardioNames();
            colourChanger(names);

        } else if (jComboBox1.getSelectedItem().toString().equals("Pulmonology")) {
            String[] names = reg.pulmNames();
            //displayColourRed();
            colourChanger(names);

        } else if (jComboBox1.getSelectedItem().toString().equals("Infectious Disease")) {
            String[] names = reg.infNames();
            //displayColourRed();
            colourChanger(names);

        } else if (jComboBox1.getSelectedItem().toString().equals("Hematology")) {
            String[] names = reg.hemNames();
            //displayColourRed();
            colourChanger(names);

        } else if (jComboBox1.getSelectedItem().toString().equals("Intensive Care Medicine")) {
            String[] names = reg.intNames();
            //displayColourRed();
            colourChanger(names);

        } else if (jComboBox1.getSelectedItem().toString().equals("Neurology")) {
            String[] names = reg.neuroNames();
            //displayColourRed();
            colourChanger(names);

        } else if (jComboBox1.getSelectedItem().toString().equals("Ophthalmology")) {
            String[] names = reg.eyeNames();
            //displayColourRed();
            colourChanger(names);

        } else if (jComboBox1.getSelectedItem().toString().equals("Orthopedics")) {
            String[] names = reg.orthoNames();
            //displayColourRed();
            colourChanger(names);

        } else if (jComboBox1.getSelectedItem().toString().equals("Urology")) {
            String[] names = reg.uroNames();
            //displayColourRed();
            colourChanger(names);

        } else if (jComboBox1.getSelectedItem().toString().equals("Surgery")) {
            String[] names = reg.surgNames();
            //displayColourRed();
            colourChanger(names);

        }


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void mouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClick
        DisplayDoc dis = new DisplayDoc(parent, reg);

        try {
            dis.enterDetails(doc1);
        } catch (Exception ex) {

        }
        System.out.println("Button1 is working?");
        parent.setContentPane(dis);
        //redraw
        parent.setSize(400, 449);
        parent.setSize(400, 450);
    }//GEN-LAST:event_mouseClick

    private void mouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEntered

        jLabel1.setForeground(Color.red);

    }//GEN-LAST:event_mouseEntered

    private void mouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExit
        jLabel1.setForeground(Color.black);
    }//GEN-LAST:event_mouseExit

    private void mouseEntered1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEntered1
        jLabel3.setForeground(Color.red);
    }//GEN-LAST:event_mouseEntered1

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setForeground(Color.black);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setForeground(Color.red);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLabel4.setForeground(Color.red);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setForeground(Color.black);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setForeground(Color.black);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        jLabel10.setForeground(Color.red);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        jLabel10.setForeground(Color.black);
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setForeground(Color.red);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setForeground(Color.black);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setForeground(Color.red);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setForeground(Color.black);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jLabel8.setForeground(Color.red);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel8.setForeground(Color.black);
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        jLabel9.setForeground(Color.red);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel9.setForeground(Color.black);
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jLabel11.setForeground(Color.red);
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        jLabel11.setForeground(Color.black);
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        DisplayDoc dis = new DisplayDoc(parent, reg);
        try {
            dis.enterDetails(doc2);
        } catch (Exception ex) {

        }
        System.out.println("Button is working?");
        parent.setContentPane(dis);
        //redraw
        parent.setSize(400, 449);
        parent.setSize(400, 450);

        this.setVisible(false);    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        DisplayDoc dis = new DisplayDoc(parent, reg);
        System.out.println("Button is working?");
        try {
            dis.enterDetails(doc3);
        } catch (Exception ex) {

        }
        parent.setContentPane(dis);
        //redraw
        parent.setSize(400, 449);
        parent.setSize(400, 450);      // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        DisplayDoc dis = new DisplayDoc(parent, reg);
        System.out.println("Button is working?");
        try {
            dis.enterDetails(doc4);
        } catch (Exception ex) {

        }
        parent.setContentPane(dis);
        //redraw
        parent.setSize(400, 449);
        parent.setSize(400, 450);         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        DisplayDoc dis = new DisplayDoc(parent, reg);
        System.out.println("Button is working?");
        try {
            dis.enterDetails(doc5);
        } catch (Exception ex) {

        }
        parent.setContentPane(dis);
        //redraw
        parent.setSize(400, 449);
        parent.setSize(400, 450);           // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        DisplayDoc dis = new DisplayDoc(parent, reg);
        System.out.println("Button is working?");
        try {
            dis.enterDetails(doc6);
        } catch (Exception ex) {

        }
        parent.setContentPane(dis);
        //redraw
        parent.setSize(400, 449);
        parent.setSize(400, 450);           // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        DisplayDoc dis = new DisplayDoc(parent, reg);
        System.out.println("Button is working?");
        try {
            dis.enterDetails(doc7);
        } catch (Exception ex) {

        }
        parent.setContentPane(dis);
        //redraw
        parent.setSize(400, 449);
        parent.setSize(400, 450);          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        DisplayDoc dis = new DisplayDoc(parent, reg);
        System.out.println("Button is working?");
        try {
            dis.enterDetails(doc8);
        } catch (Exception ex) {

        }
        parent.setContentPane(dis);
        //redraw
        parent.setSize(400, 449);
        parent.setSize(400, 450);           // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        DisplayDoc dis = new DisplayDoc(parent, reg);
        System.out.println("Button is working?");
        try {
            dis.enterDetails(doc9);
        } catch (Exception ex) {

        }
        parent.setContentPane(dis);
        //redraw
        parent.setSize(400, 449);
        parent.setSize(400, 450);         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        DisplayDoc dis = new DisplayDoc(parent, reg);
        System.out.println("Button is working?");
        try {
            dis.enterDetails(doc10);
        } catch (Exception ex) {

        }
        parent.setContentPane(dis);
        //redraw
        parent.setSize(400, 449);
        parent.setSize(400, 450);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

  

}
