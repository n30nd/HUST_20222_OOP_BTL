package view;

import controller.ExamsMouseEvent;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import model.Quiz;

/**
 *
 * @author anhqu
 */
public class GUI_5_1_AddNewQuiz extends javax.swing.JPanel {

    private GUI1_1_MainFrame mainFrame;

    /**
     * Creates new form NewJPanel
     *
     * @param mainFrame
     */
    public GUI_5_1_AddNewQuiz(GUI1_1_MainFrame mainFrame) {
        initComponents();
        this.mainFrame = mainFrame;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtextField_quizName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cbb_openDay = new javax.swing.JComboBox<>();
        cbb_openMonth = new javax.swing.JComboBox<>();
        cbb_openYear = new javax.swing.JComboBox<>();
        cbb_openHour = new javax.swing.JComboBox<>();
        cbb_openMinute = new javax.swing.JComboBox<>();
        cbb_closeDay = new javax.swing.JComboBox<>();
        cbb_closeMonth = new javax.swing.JComboBox<>();
        cbb_closeYear = new javax.swing.JComboBox<>();
        cbb_closeHour = new javax.swing.JComboBox<>();
        cbb_closeMinute = new javax.swing.JComboBox<>();
        cbb_timeUnit = new javax.swing.JComboBox<>();
        jtextField_timeNum = new javax.swing.JTextField();
        cb_enableOpen = new javax.swing.JCheckBox();
        cb_enableClose = new javax.swing.JCheckBox();
        cb_enableTimeLimit = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Roboto Slab Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(194, 41, 36));
        jLabel2.setText("Adding a new Quiz");

        jLabel1.setFont(new java.awt.Font("Roboto Slab Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(194, 41, 36));
        jLabel1.setText("General");

        jLabel3.setFont(new java.awt.Font("Roboto Slab Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(194, 41, 36));
        jLabel3.setText("Timing");

        jLabel4.setText("Name");

        jLabel5.setText("Description");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jCheckBox1.setText("Display description on course page");

        jLabel6.setText("Open the quiz");

        jLabel7.setText("Close the quiz");

        jLabel8.setText("Time limit");

        jLabel9.setText("When time expires");

        jButton2.setBackground(new java.awt.Color(193, 41, 36));
        jButton2.setFont(new java.awt.Font("Roboto Slab", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CREATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(193, 41, 36));
        jButton3.setFont(new java.awt.Font("Roboto Slab", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("CANCEL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeAddNewQuiz(evt);
            }
        });

        cbb_openDay.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cbb_openDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbb_openDay.setSelectedIndex(20);
        cbb_openDay.setEnabled(false);

        cbb_openMonth.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cbb_openMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        cbb_openMonth.setEnabled(false);

        cbb_openYear.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cbb_openYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024" }));
        cbb_openYear.setEnabled(false);

        cbb_openHour.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cbb_openHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cbb_openHour.setEnabled(false);

        cbb_openMinute.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cbb_openMinute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        cbb_openMinute.setEnabled(false);

        cbb_closeDay.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cbb_closeDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbb_closeDay.setSelectedIndex(20);
        cbb_closeDay.setEnabled(false);

        cbb_closeMonth.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cbb_closeMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        cbb_closeMonth.setEnabled(false);

        cbb_closeYear.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cbb_closeYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024" }));
        cbb_closeYear.setEnabled(false);

        cbb_closeHour.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cbb_closeHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        cbb_closeHour.setEnabled(false);
        cbb_closeHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_closeHourActionPerformed(evt);
            }
        });

        cbb_closeMinute.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cbb_closeMinute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        cbb_closeMinute.setEnabled(false);

        cbb_timeUnit.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cbb_timeUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "minutes", "hours" }));
        cbb_timeUnit.setEnabled(false);

        jtextField_timeNum.setText("0");
        jtextField_timeNum.setEnabled(false);

        cb_enableOpen.setText("Enable");
        cb_enableOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_enableOpenActionPerformed(evt);
            }
        });

        cb_enableClose.setText("Enable");
        cb_enableClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_enableCloseActionPerformed(evt);
            }
        });

        cb_enableTimeLimit.setText("Enable");
        cb_enableTimeLimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_enableTimeLimitActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Open attempts are submitted automatically" }));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/Icojam-Blue-Bits-Question-faq.16.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/Icojam-Blue-Bits-Question-faq.16.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/Icojam-Blue-Bits-Question-faq.16.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/Icojam-Blue-Bits-Question-faq.16.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                                        .addComponent(jLabel12)))
                                .addGap(3, 3, 3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtextField_quizName, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(43, 43, 43)
                                        .addComponent(jButton3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbb_closeDay, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbb_closeMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbb_openDay, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbb_openMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jtextField_timeNum, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbb_timeUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbb_openYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbb_openHour, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbb_openMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cb_enableOpen))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbb_closeYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbb_closeHour, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbb_closeMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cb_enableClose))
                                            .addComponent(cb_enableTimeLimit)))
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(105, 105, 105)))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtextField_quizName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1))
                    .addComponent(jLabel14))
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbb_openDay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbb_openMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbb_openYear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbb_openHour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbb_openMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_enableOpen))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbb_closeDay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbb_closeMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbb_closeYear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbb_closeHour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbb_closeMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cb_enableClose))))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbb_timeUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtextField_timeNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_enableTimeLimit))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbb_openDay, cbb_openMonth});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbb_timeUnit, jComboBox1, jtextField_timeNum});

    }// </editor-fold>//GEN-END:initComponents

    private void closeAddNewQuiz(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAddNewQuiz
        // TODO add your handling code here:
        mainFrame.getMainPath().setText("Home / My Courses / THI CUỐI KỲ");
        mainFrame.getPanel_content().removeAll();
        mainFrame.getPanel_content().add(mainFrame.getPanel_examList());
        mainFrame.validate();
        mainFrame.repaint();
    }//GEN-LAST:event_closeAddNewQuiz

    private void cb_enableOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_enableOpenActionPerformed
        // TODO add your handling code here:
        boolean enable = cb_enableOpen.isSelected();
        cbb_openDay.setEnabled(enable);
        cbb_openMonth.setEnabled(enable);
        cbb_openYear.setEnabled(enable);
        cbb_openHour.setEnabled(enable);
        cbb_openMinute.setEnabled(enable);
    }//GEN-LAST:event_cb_enableOpenActionPerformed

    private void cb_enableCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_enableCloseActionPerformed
        // TODO add your handling code here:
        boolean enable = cb_enableClose.isSelected();
        cbb_closeDay.setEnabled(enable);
        cbb_closeMonth.setEnabled(enable);
        cbb_closeYear.setEnabled(enable);
        cbb_closeHour.setEnabled(enable);
        cbb_closeMinute.setEnabled(enable);
    }//GEN-LAST:event_cb_enableCloseActionPerformed

    private void cb_enableTimeLimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_enableTimeLimitActionPerformed
        // TODO add your handling code here:
        boolean enable = cb_enableTimeLimit.isSelected();
        jtextField_timeNum.setEnabled(enable);
        cbb_timeUnit.setEnabled(enable);
    }//GEN-LAST:event_cb_enableTimeLimitActionPerformed

    private void cbb_closeHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_closeHourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbb_closeHourActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String newQuizName = jtextField_quizName.getText();
        String timeLimit = jtextField_timeNum + " " + (String) cbb_timeUnit.getSelectedItem();
        Quiz quiz = new Quiz(newQuizName, timeLimit);

        JLabel newQuiz = new JLabel(newQuizName);
        newQuiz.setIcon(new ImageIcon(getClass().getResource("/view/img/Txt.32.png")));
        newQuiz.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
        newQuiz.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ExamsMouseEvent examMouseEvent = new ExamsMouseEvent(newQuiz, this.mainFrame);
        newQuiz.addMouseListener(examMouseEvent);

        mainFrame.getPanel_examList().add(newQuiz);

        mainFrame.getMainPath().setText("Home / My Courses / THI CUỐI KỲ");
        mainFrame.getPanel_content().removeAll();
        mainFrame.getPanel_content().add(mainFrame.getPanel_examList());
        mainFrame.validate();
        mainFrame.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb_enableClose;
    private javax.swing.JCheckBox cb_enableOpen;
    private javax.swing.JCheckBox cb_enableTimeLimit;
    private javax.swing.JComboBox<String> cbb_closeDay;
    private javax.swing.JComboBox<String> cbb_closeHour;
    private javax.swing.JComboBox<String> cbb_closeMinute;
    private javax.swing.JComboBox<String> cbb_closeMonth;
    private javax.swing.JComboBox<String> cbb_closeYear;
    private javax.swing.JComboBox<String> cbb_openDay;
    private javax.swing.JComboBox<String> cbb_openHour;
    private javax.swing.JComboBox<String> cbb_openMinute;
    private javax.swing.JComboBox<String> cbb_openMonth;
    private javax.swing.JComboBox<String> cbb_openYear;
    private javax.swing.JComboBox<String> cbb_timeUnit;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jtextField_quizName;
    private javax.swing.JTextField jtextField_timeNum;
    // End of variables declaration//GEN-END:variables

}
