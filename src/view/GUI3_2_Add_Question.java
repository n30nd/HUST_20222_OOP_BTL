/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Customizer.java to edit this template
 */
package view;

/**
 *
 * @author HQViet
 */
public class GUI3_2_Add_Question extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;

    /**
     * Creates new customizer GUI3_2_Add_Question
     */
    public GUI3_2_Add_Question() {
        initComponents();
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        Maingui32 = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        general1 = new javax.swing.JLabel();
        Cate1 = new javax.swing.JLabel();
        Qname1 = new javax.swing.JLabel();
        Qtext1 = new javax.swing.JLabel();
        CateBox1 = new javax.swing.JComboBox<>();
        QnameField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        QtextArea1 = new javax.swing.JTextArea();
        Mark1 = new javax.swing.JLabel();
        Markfield1 = new javax.swing.JTextField();
        RedNote1 = new javax.swing.JLabel();
        RedNote2 = new javax.swing.JLabel();
        RedNote3 = new javax.swing.JLabel();
        Choice1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox<>();
        Choice2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jComboBox7 = new javax.swing.JComboBox<>();
        MoreChoiceButton1 = new javax.swing.JButton();
        SaveChButton1 = new javax.swing.JButton();
        SaveButton1 = new javax.swing.JButton();
        CancelButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 725));

        Maingui32.setBackground(new java.awt.Color(255, 255, 255));
        Maingui32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Maingui32.setPreferredSize(new java.awt.Dimension(900, 1500));

        add.setFont(new java.awt.Font("Times New Roman", 0, 34)); // NOI18N
        add.setForeground(new java.awt.Color(194, 41, 36));
        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setText("Adding a Multiple choice question");
        add.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        general1.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        general1.setForeground(new java.awt.Color(194, 41, 36));
        general1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/blue_triangle.png"))); // NOI18N
        general1.setText("  General");

        Cate1.setBackground(new java.awt.Color(255, 255, 255));
        Cate1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Cate1.setForeground(new java.awt.Color(102, 102, 102));
        Cate1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Cate1.setText("Category");

        Qname1.setBackground(new java.awt.Color(255, 255, 255));
        Qname1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Qname1.setForeground(new java.awt.Color(102, 102, 102));
        Qname1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Qname1.setText("Question name");

        Qtext1.setBackground(new java.awt.Color(255, 255, 255));
        Qtext1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Qtext1.setForeground(new java.awt.Color(102, 102, 102));
        Qtext1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Qtext1.setText("Question text");

        CateBox1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        CateBox1.setForeground(new java.awt.Color(51, 51, 51));
        CateBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IT3030-Kiến Trúc Máy Tính", "IT3040-Kỹ Thuật Lập Trình", "IT3070-Nguyên Lý Hệ Điều Hành", "IT3100-Lập Trình Hướng Đối Tượng" }));
        CateBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CateBox1ActionPerformed(evt);
            }
        });

        QnameField1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        QnameField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QnameField1ActionPerformed(evt);
            }
        });

        QtextArea1.setColumns(20);
        QtextArea1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        QtextArea1.setRows(5);
        jScrollPane1.setViewportView(QtextArea1);

        Mark1.setBackground(new java.awt.Color(255, 255, 255));
        Mark1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Mark1.setForeground(new java.awt.Color(102, 102, 102));
        Mark1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Mark1.setText("Default mark");

        Markfield1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Markfield1.setText("1");
        Markfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Markfield1ActionPerformed(evt);
            }
        });

        RedNote1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/red_sign.png"))); // NOI18N

        RedNote2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/red_sign.png"))); // NOI18N

        RedNote3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/red_sign.png"))); // NOI18N

        Choice1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel10.setText("Grade");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel11.setText("Choice 1");

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jComboBox6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "100%", "90%", "83.33333%", "80%", "75%", "70%", "66.66667%", "60%", "50%", "40%", "33.33333%", "30%", "25%", "20%", "16.66667%", "14.28571%", "12.5%", "11.11111%", "10%", "5%", "-5%", "-10%", "-11.11111%", "-12.5%", "-14.28571%", "-16.66667%", "-20%", "-25%", "-30%", "-33.33333%", "-40%", "-50%", "-60%", "-66.66667%", "-70%", "-75%", "-80%", "-83.33333%" }));

        javax.swing.GroupLayout Choice1Layout = new javax.swing.GroupLayout(Choice1);
        Choice1.setLayout(Choice1Layout);
        Choice1Layout.setHorizontalGroup(
            Choice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Choice1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Choice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(Choice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3)
                    .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Choice1Layout.setVerticalGroup(
            Choice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Choice1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(Choice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(Choice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        Choice2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel14.setText("Grade");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel15.setText("Choice 2");

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jComboBox7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "100%", "90%", "83.33333%", "80%", "75%", "70%", "66.66667%", "60%", "50%", "40%", "33.33333%", "30%", "25%", "20%", "16.66667%", "14.28571%", "12.5%", "11.11111%", "10%", "5%", "-5%", "-10%", "-11.11111%", "-12.5%", "-14.28571%", "-16.66667%", "-20%", "-25%", "-30%", "-33.33333%", "-40%", "-50%", "-60%", "-66.66667%", "-70%", "-75%", "-80%", "-83.33333%" }));

        javax.swing.GroupLayout Choice2Layout = new javax.swing.GroupLayout(Choice2);
        Choice2.setLayout(Choice2Layout);
        Choice2Layout.setHorizontalGroup(
            Choice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Choice2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Choice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(Choice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField6))
                .addContainerGap())
        );
        Choice2Layout.setVerticalGroup(
            Choice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Choice2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(Choice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(Choice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        MoreChoiceButton1.setBackground(new java.awt.Color(51, 102, 255));
        MoreChoiceButton1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        MoreChoiceButton1.setForeground(new java.awt.Color(255, 255, 255));
        MoreChoiceButton1.setText("BLANKS FOR 3 MORE CHOICES");
        MoreChoiceButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoreChoiceButton1ActionPerformed(evt);
            }
        });

        SaveChButton1.setBackground(new java.awt.Color(51, 102, 255));
        SaveChButton1.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        SaveChButton1.setForeground(new java.awt.Color(255, 255, 255));
        SaveChButton1.setText("SAVE CHANGES AND CONTINUE EDITING");
        SaveChButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveChButton1ActionPerformed(evt);
            }
        });

        SaveButton1.setBackground(new java.awt.Color(255, 51, 51));
        SaveButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SaveButton1.setForeground(new java.awt.Color(255, 255, 255));
        SaveButton1.setText("SAVE CHANGES");
        SaveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButton1ActionPerformed(evt);
            }
        });

        CancelButton1.setBackground(new java.awt.Color(51, 102, 255));
        CancelButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        CancelButton1.setForeground(new java.awt.Color(255, 255, 255));
        CancelButton1.setText("CANCEL");

        javax.swing.GroupLayout Maingui32Layout = new javax.swing.GroupLayout(Maingui32);
        Maingui32.setLayout(Maingui32Layout);
        Maingui32Layout.setHorizontalGroup(
            Maingui32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Maingui32Layout.createSequentialGroup()
                .addGroup(Maingui32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Maingui32Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SaveChButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Maingui32Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(Maingui32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Qtext1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cate1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Qname1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Mark1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(128, 128, 128)
                        .addGroup(Maingui32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RedNote1)
                            .addComponent(RedNote2)
                            .addComponent(RedNote3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Maingui32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Choice2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Choice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(Maingui32Layout.createSequentialGroup()
                                .addGroup(Maingui32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Markfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MoreChoiceButton1)
                                    .addGroup(Maingui32Layout.createSequentialGroup()
                                        .addComponent(CateBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(63, 63, 63))
                                    .addComponent(QnameField1))
                                .addGap(72, 72, 72))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Maingui32Layout.createSequentialGroup()
                        .addGroup(Maingui32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Maingui32Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Maingui32Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(general1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Maingui32Layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(SaveButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(84, 84, 84)
                                .addComponent(CancelButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(210, 210, 210)))
                .addGap(28, 28, 28))
        );
        Maingui32Layout.setVerticalGroup(
            Maingui32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Maingui32Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(add)
                .addGap(45, 45, 45)
                .addComponent(general1)
                .addGap(18, 18, 18)
                .addGroup(Maingui32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cate1)
                    .addComponent(CateBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(Maingui32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RedNote1)
                    .addGroup(Maingui32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Qname1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(QnameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(Maingui32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Qtext1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RedNote2))
                .addGap(16, 16, 16)
                .addGroup(Maingui32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Maingui32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Markfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Mark1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RedNote3))
                .addGap(31, 31, 31)
                .addComponent(Choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(Choice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(MoreChoiceButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(SaveChButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Maingui32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 73, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(Maingui32);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane3)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CateBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CateBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CateBox1ActionPerformed

    private void QnameField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QnameField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QnameField1ActionPerformed

    private void Markfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Markfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Markfield1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void MoreChoiceButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoreChoiceButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MoreChoiceButton1ActionPerformed

    private void SaveChButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveChButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveChButton1ActionPerformed

    private void SaveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton1;
    private javax.swing.JLabel Cate1;
    private javax.swing.JComboBox<String> CateBox1;
    private javax.swing.JPanel Choice1;
    private javax.swing.JPanel Choice2;
    private javax.swing.JPanel Maingui32;
    private javax.swing.JLabel Mark1;
    private javax.swing.JTextField Markfield1;
    private javax.swing.JButton MoreChoiceButton1;
    private javax.swing.JLabel Qname1;
    private javax.swing.JTextField QnameField1;
    private javax.swing.JLabel Qtext1;
    private javax.swing.JTextArea QtextArea1;
    private javax.swing.JLabel RedNote1;
    private javax.swing.JLabel RedNote2;
    private javax.swing.JLabel RedNote3;
    private javax.swing.JButton SaveButton1;
    private javax.swing.JButton SaveChButton1;
    private javax.swing.JLabel add;
    private javax.swing.JLabel general1;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
