/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import medresourcemanagement.Register;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import medresourcemanagement.Doctor;

/**
 *
 * @author b00712596
 */
public class Availability extends javax.swing.JPanel {

    private Register reg;
    private JFrame parent;
    private String day;
    private SelectBox listen;
    private Doctor[] docs = new Doctor[10];

    /**
     * Creates new form Availability
     */
    public Availability(Register reg, JFrame parent) {
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

        //reset labels
        jLabel1.setText(null);
        jLabel3.setText(null);
        jLabel4.setText(null);
        jLabel5.setText(null);
        jLabel6.setText(null);
        jLabel7.setText(null);
        jLabel8.setText(null);
        jLabel9.setText(null);
        jLabel10.setText(null);
        jLabel11.setText(null);

    }

    private void colourChanger(String[] names) {

        //first label 
        this.changeColour(names[0], 0, jLabel1, jTextField2);
        //second label
        this.changeColour(names[1], 1, jLabel3, jTextField3);
        //third  label
        this.changeColour(names[2], 2, jLabel4, jTextField4);
        //forth  label
        this.changeColour(names[3], 3, jLabel5, jTextField5);
        //fifth  label
        this.changeColour(names[4], 4, jLabel10, jTextField6);
        //six  label
        this.changeColour(names[5], 5, jLabel6, jTextField7);
        //7  label
        this.changeColour(names[6], 6, jLabel7, jTextField8);
        //8  label
        this.changeColour(names[7], 7, jLabel8, jTextField9);
        //9  label
        this.changeColour(names[8], 8, jLabel9, jTextField10);
        //10  label
        this.changeColour(names[9], 9, jLabel11, jTextField11);
    }

    private void changeColour(String name, int docNo, JLabel jLabel1, JTextField jTextField2) {
        int[] x;
        //first label
        jLabel1.setText(name);
        x = reg.searchReg(name);
        try {
            docs[docNo] = reg.getDoc(x);

        } catch (NullPointerException ex) {
            System.err.println("Can't find a doc!");
        }
        jLabel1.setText(name);
        if (name == null) {
            jTextField2.setBackground(Color.LIGHT_GRAY);
        } else {
            //set to a colour
            try {
                setColour(jTextField2, docs[docNo]);
            } catch (Exception ex) {
                System.err.println("Couldn't find a doc to set colour");
            }
        }
    }

    private void setColour(JTextField jTextField, Doctor doc) {
        //What's the time?
        LocalTime timeNow = LocalTime.now();
        //somewhere to put the start and end times from each doc
        LocalTime[] startAndEnd = new LocalTime[2];
        switch (day) {
            case "Sun":
                startAndEnd = doc.getDayTimes(day);
                if (startAndEnd[0] == startAndEnd[1]) {
                    System.out.println("unavailable");
                    jTextField.setBackground(Color.red);
                }// if startTime < now < endTime 
                else if (startAndEnd[0].isBefore(timeNow) && startAndEnd[1].isAfter(timeNow)) {
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

        jTextField10 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField7 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
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

        jTextField10.setBackground(java.awt.Color.lightGray);

        jTextField5.setBackground(java.awt.Color.lightGray);

        jTextField11.setBackground(new java.awt.Color(204, 204, 204));
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTextField6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Please select doctor speciality to see availability");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Please Select--", "Cardiology", "Pulmonology", "Infectious Disease", "Hematology", "Intensive Care Medicine", "Neurology", "Ophthalmology", "Orthopedics", "Urology", "Surgery" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField7.setBackground(java.awt.Color.lightGray);

        jTextField2.setBackground(java.awt.Color.lightGray);
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextField8.setBackground(java.awt.Color.lightGray);

        jTextField3.setBackground(java.awt.Color.lightGray);

        jTextField9.setBackground(java.awt.Color.lightGray);

        jTextField4.setBackground(java.awt.Color.lightGray);

        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        jLabel3.setText("jLabel3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        jLabel4.setText("jLabel4");
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

        jLabel5.setText("jLabel5");
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

        jLabel6.setText("jLabel6");
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

        jLabel7.setText("jLabel7");
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

        jLabel8.setText("jLabel8");
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

        jLabel9.setText("jLabel9");
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

        jLabel10.setText("jLabel10");
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

        jLabel11.setText("jLabel11");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(115, 115, 115)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(94, 94, 94))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

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
            String[] names = reg.getNamesWithNulls(reg.getSpecArray("Cardiology"));
            colourChanger(names);

        } else if (jComboBox1.getSelectedItem().toString().equals("Pulmonology")) {
            String[] names = reg.getNamesWithNulls(reg.getSpecArray("Pulmonology"));

            colourChanger(names);

        } else if (jComboBox1.getSelectedItem().toString().equals("Infectious Disease")) {
            String[] names = reg.getNamesWithNulls(reg.getSpecArray("Infectious Disease"));

            colourChanger(names);

        } else if (jComboBox1.getSelectedItem().toString().equals("Hematology")) {
            String[] names = reg.getNamesWithNulls(reg.getSpecArray("Hematology"));

            colourChanger(names);

        } else if (jComboBox1.getSelectedItem().toString().equals("Intensive Care Medicine")) {
            String[] names = reg.getNamesWithNulls(reg.getSpecArray("Intensive Care Medicine"));

            colourChanger(names);

        } else if (jComboBox1.getSelectedItem().toString().equals("Neurology")) {
            String[] names = reg.getNamesWithNulls(reg.getSpecArray("Neurology"));

            colourChanger(names);

        } else if (jComboBox1.getSelectedItem().toString().equals("Ophthalmology")) {
            String[] names = reg.getNamesWithNulls(reg.getSpecArray("Ophthalmology"));

            colourChanger(names);

        } else if (jComboBox1.getSelectedItem().toString().equals("Orthopedics")) {
            String[] names = reg.getNamesWithNulls(reg.getSpecArray("Orthopedics"));

            colourChanger(names);

        } else if (jComboBox1.getSelectedItem().toString().equals("Urology")) {
            String[] names = reg.getNamesWithNulls(reg.getSpecArray("Urology"));

            colourChanger(names);

        } else if (jComboBox1.getSelectedItem().toString().equals("Surgery")) {
            String[] names = reg.getNamesWithNulls(reg.getSpecArray("Surgery"));

            colourChanger(names);

        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setForeground(Color.red);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setForeground(Color.black);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        DisplayDoc dis = new DisplayDoc(parent, reg);
        System.out.println("Button is working?");
        try {
            dis.enterDetails(docs[0]);
        } catch (Exception ex) {

        }
        parent.setContentPane(dis);
        //redraw
        parent.setSize(400, 449);
        parent.setSize(400, 450);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setForeground(Color.red);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setForeground(Color.black);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        DisplayDoc dis = new DisplayDoc(parent, reg);
        System.out.println("Button is working?");
        try {
            dis.enterDetails(docs[1]);
        } catch (Exception ex) {

        }
        parent.setContentPane(dis);
        //redraw
        parent.setSize(400, 449);
        parent.setSize(400, 450);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLabel4.setForeground(Color.red);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setForeground(Color.black);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        DisplayDoc dis = new DisplayDoc(parent, reg);
        System.out.println("Button is working?");
        try {
            dis.enterDetails(docs[2]);
        } catch (Exception ex) {

        }
        parent.setContentPane(dis);
        //redraw
        parent.setSize(400, 449);
        parent.setSize(400, 450);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setForeground(Color.red);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setForeground(Color.black);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        DisplayDoc dis = new DisplayDoc(parent, reg);
        System.out.println("Button is working?");
        try {
            dis.enterDetails(docs[3]);
        } catch (Exception ex) {

        }
        parent.setContentPane(dis);
        //redraw
        parent.setSize(400, 449);
        parent.setSize(400, 450);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setForeground(Color.red);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setForeground(Color.black);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        DisplayDoc dis = new DisplayDoc(parent, reg);
        System.out.println("Button is working?");
        try {
            dis.enterDetails(docs[4]);
        } catch (Exception ex) {

        }
        parent.setContentPane(dis);
        //redraw
        parent.setSize(400, 449);
        parent.setSize(400, 450);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setForeground(Color.red);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setForeground(Color.black);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        DisplayDoc dis = new DisplayDoc(parent, reg);
        System.out.println("Button is working?");
        try {
            dis.enterDetails(docs[5]);
        } catch (Exception ex) {

        }
        parent.setContentPane(dis);
        //redraw
        parent.setSize(400, 449);
        parent.setSize(400, 450);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jLabel8.setForeground(Color.red);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel8.setForeground(Color.black);
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        DisplayDoc dis = new DisplayDoc(parent, reg);
        System.out.println("Button is working?");
        try {
            dis.enterDetails(docs[6]);
        } catch (Exception ex) {

        }
        parent.setContentPane(dis);
        //redraw
        parent.setSize(400, 449);
        parent.setSize(400, 450);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        jLabel9.setForeground(Color.red);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel9.setForeground(Color.black);
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        DisplayDoc dis = new DisplayDoc(parent, reg);
        System.out.println("Button is working?");
        try {
            dis.enterDetails(docs[7]);
        } catch (Exception ex) {

        }
        parent.setContentPane(dis);
        //redraw
        parent.setSize(400, 449);
        parent.setSize(400, 450);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        jLabel10.setForeground(Color.red);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        jLabel10.setForeground(Color.black);
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        DisplayDoc dis = new DisplayDoc(parent, reg);
        System.out.println("Button is working?");
        try {
            dis.enterDetails(docs[8]);
        } catch (Exception ex) {

        }
        parent.setContentPane(dis);
        //redraw
        parent.setSize(400, 449);
        parent.setSize(400, 450);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jLabel11.setForeground(Color.red);
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        jLabel11.setForeground(Color.black);
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        DisplayDoc dis = new DisplayDoc(parent, reg);
        System.out.println("Button is working?");
        try {
            dis.enterDetails(docs[9]);
        } catch (Exception ex) {

        }
        parent.setContentPane(dis);
        //redraw
        parent.setSize(400, 449);
        parent.setSize(400, 450);
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
