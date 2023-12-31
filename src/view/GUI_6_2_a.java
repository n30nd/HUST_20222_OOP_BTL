package view;

import javax.swing.JPopupMenu;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JLabel;
import model.Question;
import model.Quiz;
/**
 *
 * @author viet
 */
public class GUI_6_2_a extends javax.swing.JPanel implements java.beans.Customizer {
    
     GUI1_1_MainFrame mainFrame;
     Quiz quiz;
     List<Question> qstoQuiz;
    /**
     * Creates new customizer GUI_6_2_a
     * @param mainFrame
     */
    
    public GUI_6_2_a(GUI1_1_MainFrame mainFrame, Quiz quiz) {
        this.mainFrame = mainFrame;
        this.quiz = quiz;
        initComponents();
    }
    public GUI_6_2_a(GUI1_1_MainFrame mainFrame, Quiz quiz, List<Question> qstoQuiz) {
        this.mainFrame = mainFrame;
        this.quiz = quiz;
        this.qstoQuiz = qstoQuiz;
        initComponents();
    }
    
    public void setObject(Object bean) {}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        
        jPopupMenuGUI62b = new javax.swing.JPopupMenu();
        newQ_MenuItem = new javax.swing.JMenuItem();
        Qbank_MenuItem = new javax.swing.JMenuItem();
        randQ_MenuItem = new javax.swing.JMenuItem();
        label1 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        newQ_MenuItem.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        newQ_MenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/blue_plus.png"))); // NOI18N
        newQ_MenuItem.setText("  A new question");
        newQ_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newQ_MenuItemActionPerformed(evt);
            }
        });
        jPopupMenuGUI62b.add(newQ_MenuItem);

        Qbank_MenuItem.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Qbank_MenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/blue_plus.png"))); // NOI18N
        Qbank_MenuItem.setText("  From question bank");
        Qbank_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Qbank_MenuItemActionPerformed(evt);
            }
        });
        jPopupMenuGUI62b.add(Qbank_MenuItem);

        randQ_MenuItem.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        randQ_MenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/blue_plus.png"))); // NOI18N
        randQ_MenuItem.setText("  A random question");
        randQ_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randQ_MenuItemActionPerformed(evt);
            }
        });
        jPopupMenuGUI62b.add(randQ_MenuItem);

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 515));

        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        label1.setForeground(new java.awt.Color(193, 41, 36));
        label1.setText("Editting quiz: Thi giữa kì 2 môn công nghệ");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/Icojam-Blue-Bits-Question-faq.16.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SAVE");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("10.00");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("Maximum grade ");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("Total of marks: 0.00\n");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setText("Question: 0 | This quiz is open");

        jButton2.setBackground(new java.awt.Color(51, 102, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REPAGINATE");

        jButton3.setBackground(new java.awt.Color(51, 102, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("SELECT MULTIPLE ITEMS");

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox1.setText("Shuffle");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/Icojam-Blue-Bits-Question-faq.16.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/blue_pen.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("Add");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        jLabel7.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel7ComponentShown(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/drop_arrow_open.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 728, Short.MAX_VALUE)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(21, 21, 21))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addGap(11, 11, 11))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }
    
    
    private void jLabel7ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel7ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7ComponentShown

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        jPopupMenuGUI62b = new JPopupMenu();
        jPopupMenuGUI62b.setLayout(new GridLayout(3, 1, 50, 0));
       // jPopupMenuGUI62b.setForeground(new Color(255,255,255));
        
        jPopupMenuGUI62b.add(newQ_MenuItem);
        jPopupMenuGUI62b.add(Qbank_MenuItem);
        jPopupMenuGUI62b.add(randQ_MenuItem);
        
        jPopupMenuGUI62b.show(evt.getComponent(), evt.getX() - 200, evt.getY()+10);
    }//GEN-LAST:event_jLabel7MousePressed

    private void newQ_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newQ_MenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newQ_MenuItemActionPerformed

    private void Qbank_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Qbank_MenuItemActionPerformed
        GUI6_3ab gui6_3ab = new GUI6_3ab(mainFrame, quiz);

        gui6_3ab.setLocation(0, 0);

        mainFrame.getPanel_content().removeAll();
        mainFrame.getPanel_content().add(gui6_3ab);
        mainFrame.validate();
        mainFrame.repaint();

    }//GEN-LAST:event_Qbank_MenuItemActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        for (int i = 0; i < qstoQuiz.size(); i++) {
            quiz.getQuestions().add(qstoQuiz.get(i));
        }
        
        GUI_6_1 gui6_1_exam = new GUI_6_1(mainFrame, quiz);

        gui6_1_exam.setSize(1030, 519);
        gui6_1_exam.setLocation(0,0);

        mainFrame.getMainPath().setText("Home / My Courses / THI CUỐI KỲ / " + quiz.getName());
        mainFrame.getPanel_content().removeAll();
        mainFrame.getPanel_content().add(gui6_1_exam);
        mainFrame.validate();
        mainFrame.repaint();
    }//GEN-LAST:event_jButton1MouseClicked

    private void randQ_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randQ_MenuItemActionPerformed
       GUI_6_5 gui_6_5 = new GUI_6_5(mainFrame, quiz, qstoQuiz);

        gui_6_5.setLocation(0, 0);
        gui_6_5.setSize(1030, 519);

        mainFrame.getPanel_content().removeAll();
        mainFrame.getPanel_content().add(gui_6_5);
        mainFrame.validate();
        mainFrame.repaint();
    }//GEN-LAST:event_randQ_MenuItemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Qbank_MenuItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenuGUI62b;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label1;
    private javax.swing.JMenuItem newQ_MenuItem;
    private javax.swing.JMenuItem randQ_MenuItem;
    // End of variables declaration//GEN-END:variables
}
