/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Xuatnhapcategoryquestion;
import model.Category;
import model.Question;
import model.Quiz;

/**
 *
 * @author msonc
 */
public class GUI_6_5 extends javax.swing.JPanel {
    /**
     * Creates new form GUI_6_3_b
     * @param mainFrame
     */
    public GUI_6_5(GUI1_1_MainFrame mainFrame, Quiz quiz, List<Question> qstoQuiz) {
        this.mainFrame = mainFrame;
        this.quiz = quiz;
        this.qstoQuiz = qstoQuiz;
        initComponents();
        importCategories();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        qstoQuiz = new ArrayList<Question>();

        setPreferredSize(new java.awt.Dimension(800, 650));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(190, 53, 74));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Add a random question to page 1");

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 650));

        jLabel3.setText("Category");
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 20));

        jComboBox1.setPreferredSize(new java.awt.Dimension(250, 30));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jCheckBox1.setBackground(Color.WHITE);
        jCheckBox1.setText("Include questions from subcategories too");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("ADD RANDOM QUESTIONS TO THE QUIZ");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jButton1ActionPerformed();
            } 
        });

        jTextArea1.setBorder(null);
        jTextArea1.setEditable(false);
        jTextArea1.setColumns(1);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(1);
        jTextArea1.setText("Number of random  questions");
        jTextArea1.setPreferredSize(new java.awt.Dimension(100, 40));
        jScrollPane2.setViewportView(jTextArea1);

        jLabel4.setText("Questions matching this filter");

        jComboBox2.setMaximumRowCount(100);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setBackground(Color.WHITE);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                    
                                    )
                                )
                            )
                        )
                    )
                    .addComponent(jScrollPane3, 850, 850, Short.MAX_VALUE)
                )
            )
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
                    
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING))
                
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Existing category", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1108, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("New category", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(12, 560, Short.MAX_VALUE))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed() {
        List<Integer> mnemonic = new ArrayList<Integer>();
        List<Question> questions = xn.readQuestionList(jComboBox1.getSelectedIndex() - 1);

        for (int i = 0; i < jComboBox2.getSelectedIndex() + 1; i++) {
            Integer temp = (int)(Math.random() * questions.size());
            
            while (mnemonic.contains(temp)) temp = (int)(Math.random() * questions.size());
            mnemonic.add(temp);
            qstoQuiz.add(questions.get(mnemonic.get(mnemonic.size() - 1)));
        }

        GUI_6_2_a gui_6_2_a = new GUI_6_2_a(mainFrame, quiz, qstoQuiz);
        gui_6_2_a.setLocation(0, 0);
        gui_6_2_a.setSize(1034, 527);
        mainFrame.getPanel_content().removeAll();
        
        if (qstoQuiz.size() > 0) {
            gui_6_2_a.getjLabel4().setText("Question: " + qstoQuiz.size() + " | This quiz is open");
            gui_6_2_a.getjLabel3().setText("Total of marks: " + qstoQuiz.size() + ".00");
            
            GUI_6_4_Quoc gui_6_4 = new GUI_6_4_Quoc(mainFrame, qstoQuiz);
            gui_6_4.setLocation(0, 293);
            gui_6_4.setSize(1034, 238);
            gui_6_2_a.add(gui_6_4);
        }
        mainFrame.getPanel_content().add(gui_6_2_a);
        mainFrame.validate();
        mainFrame.repaint();
    }

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed
          
    public void importCategories() {
        jComboBox1.addItem("");
        for (Category c : categories) jComboBox1.addItem(c.getName() + " (" + xn.readQuestionList(c.getId()).size() + ")");

        jComboBox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                if (ie.getStateChange() == ItemEvent.SELECTED) {
                    jComboBox2.removeAllItems();
                    if (jComboBox1.getSelectedIndex() > 0) {
                        List<Question> questions = xn.readQuestionList(categories.get(jComboBox1.getSelectedIndex() - 1).getId());
                        JPanel panel = new JPanel(new GridLayout(questions.size(), 1));

                        for (Integer i = 1; i < questions.size() + 1; i++) {
                            panel.add(new JLabel(questions.get(i - 1).getName(), new ImageIcon(System.getProperty("user.dir") + "/src/view/img/detail.png"), JLabel.LEFT));
                            jComboBox2.addItem(i.toString());
                        }

                        jScrollPane3.setViewportView(panel);
                    } else {
                        jScrollPane3.getViewport().removeAll();
                    }
                    mainFrame.revalidate();
                    mainFrame.repaint();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI1_1_MainFrame mainFrame;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jButton1;
    private List<Question> qstoQuiz;
    private Xuatnhapcategoryquestion xn = new Xuatnhapcategoryquestion();
    private List<Category> categories = xn.readCategoryList();
    private Quiz quiz;
    // End of variables declaration//GEN-END:variables
}
