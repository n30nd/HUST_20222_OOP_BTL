package view;

import controller.ShowMainMenu;
import model.Quiz;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

/**
 *
 * @author anhqu
 */
public class GUI1_1_MainFrame extends javax.swing.JFrame {
    /**
     * Creates new form MainFrame
     */
    public GUI1_1_MainFrame() {
        initComponents();
        showMainMenu();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        
        PopUpMenu = new javax.swing.JPopupMenu();
        question_MenuItem = new javax.swing.JMenuItem();
        catagories_MenuItem = new javax.swing.JMenuItem();
        import_MenuItem = new javax.swing.JMenuItem();
        export_MenuItem = new javax.swing.JMenuItem();
        panel_ContainsAll = new javax.swing.JPanel();
        panel_header = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbl_settingToShowPopUpMenu = new javax.swing.JLabel();
        btn_turnOnEditting = new javax.swing.JButton();
        lbl_HomeLogo = new javax.swing.JLabel();
        MainPath = new javax.swing.JLabel();
        panel_content = new javax.swing.JPanel();
        panel_examList = new javax.swing.JPanel();
        lbl_exam = new ArrayList<JLabel>();

        question_MenuItem.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        question_MenuItem.setForeground(new java.awt.Color(0, 159, 229));
        question_MenuItem.setText("Questions");
        question_MenuItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PopUpMenu.add(question_MenuItem);

        catagories_MenuItem.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        catagories_MenuItem.setForeground(new java.awt.Color(0, 159, 229));
        catagories_MenuItem.setText("Catagories");
        catagories_MenuItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PopUpMenu.add(catagories_MenuItem);

        import_MenuItem.setFont(new java.awt.Font("Roboto Slab Medium", 0, 18)); // NOI18N
        import_MenuItem.setForeground(new java.awt.Color(0, 159, 229));
        import_MenuItem.setText("Import");
        import_MenuItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PopUpMenu.add(import_MenuItem);

        export_MenuItem.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        export_MenuItem.setForeground(new java.awt.Color(0, 159, 229));
        export_MenuItem.setText("Export");
        export_MenuItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PopUpMenu.add(export_MenuItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần mềm thi trắc nghiệm");

        panel_header.setBackground(new java.awt.Color(0, 115, 165));

        javax.swing.GroupLayout panel_headerLayout = new javax.swing.GroupLayout(panel_header);
        panel_header.setLayout(panel_headerLayout);
        panel_headerLayout.setHorizontalGroup(
            panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_headerLayout.setVerticalGroup(
            panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_settingToShowPopUpMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/setting_24.png"))); // NOI18N
        lbl_settingToShowPopUpMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_settingToShowPopUpMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showPopupMenu(evt);
            }
        });

        btn_turnOnEditting.setBackground(new java.awt.Color(0, 115, 165));
        btn_turnOnEditting.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_turnOnEditting.setForeground(new java.awt.Color(255, 255, 255));
        btn_turnOnEditting.setText("TURN EDITING ON");
        btn_turnOnEditting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_turnOnEditting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewQuiz(evt);
            }
        });

        lbl_HomeLogo.setFont(new java.awt.Font("Roboto Slab", 0, 36)); // NOI18N
        lbl_HomeLogo.setForeground(new java.awt.Color(194, 41, 36));
        lbl_HomeLogo.setText("IT");
        lbl_HomeLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_HomeLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                returnHomeFrame();
            }
        });

        MainPath.setText("Home / My Courses / THI CUỐI KỲ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lbl_HomeLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 791, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MainPath, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_settingToShowPopUpMenu, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_turnOnEditting, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbl_settingToShowPopUpMenu))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_HomeLogo)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_turnOnEditting, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MainPath, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panel_content.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panel_examList.setMinimumSize(new java.awt.Dimension(222, 519));
        panel_examList.setLayout(new java.awt.GridLayout(8, 0));

        quizzes = new ArrayList<Quiz>();
        quizzes.add(new Quiz("Thi giữa kỳ 2 môn Công nghệ", 3600));
        for (int i = 0; i < quizzes.size(); i++) {
            final int temp = i;
            
            lbl_exam.add(new JLabel(quizzes.get(i).getName(), new ImageIcon(getClass().getResource("/view/img/Txt.32.png")), JLabel.LEFT));
            
            lbl_exam.get(i).setFont(new Font("Segoe UI", 0, 14));
            lbl_exam.get(i).setCursor(new Cursor(Cursor.HAND_CURSOR));
            lbl_exam.get(i).addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent me) {
                    lbl_examMouseEntered(me);
                }
                public void mouseExited(MouseEvent me) {
                    lbl_examMouseExited(me);
                }
                public void mouseClicked(MouseEvent me) {
                    lbl_examMouseClicked(me, quizzes.get(temp));
                }
            });
            panel_examList.add(lbl_exam.get(i));
        }

        javax.swing.GroupLayout panel_contentLayout = new javax.swing.GroupLayout(panel_content);
        panel_content.setLayout(panel_contentLayout);
        panel_contentLayout.setHorizontalGroup(
            panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_examList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_contentLayout.setVerticalGroup(
            panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_examList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_ContainsAllLayout = new javax.swing.GroupLayout(panel_ContainsAll);
        panel_ContainsAll.setLayout(panel_ContainsAllLayout);
        panel_ContainsAllLayout.setHorizontalGroup(
            panel_ContainsAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_ContainsAllLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_ContainsAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_ContainsAllLayout.setVerticalGroup(
            panel_ContainsAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ContainsAllLayout.createSequentialGroup()
                .addComponent(panel_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_ContainsAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_ContainsAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JPanel getjPanel3() {
        return jPanel3;
    }
// Hiển thị PopUpMenu GUI_1.2 khi ấn vào nút cài đặt
    private void showPopupMenu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPopupMenu
        PopUpMenu = new JPopupMenu();
        PopUpMenu.setLayout(new GridLayout(4, 2, 50, 0));

        JPanel panel_menuPopUpLeft = new JPanel();
        JLabel popupTitle = new JLabel("Question Bank");
        popupTitle.setFont(new Font("Roboto Black", Font.BOLD, 24));
        popupTitle.setForeground(new Color(0, 159, 229));
        panel_menuPopUpLeft.add(popupTitle);

        PopUpMenu.add(panel_menuPopUpLeft);
        PopUpMenu.add(question_MenuItem);
        PopUpMenu.add(new Label(""));
        PopUpMenu.add(catagories_MenuItem);
        PopUpMenu.add(new Label(""));
        PopUpMenu.add(import_MenuItem);
        PopUpMenu.add(new Label(""));
        PopUpMenu.add(export_MenuItem);

        PopUpMenu.show(evt.getComponent(), evt.getX() - 380, evt.getY());
    }//GEN-LAST:event_showPopupMenu

    public void returnHomeFrame() {//GEN-FIRST:event_returnHomeFrame
        lbl_exam = new ArrayList<JLabel>();
        panel_examList.removeAll();

        for (int i = 0; i < quizzes.size(); i++) {
            final int temp = i;

            lbl_exam.add(new JLabel(quizzes.get(i).getName(), new ImageIcon(getClass().getResource("/view/img/Txt.32.png")), JLabel.LEFT));
           
            lbl_exam.get(i).setFont(new Font("Segoe UI", 0, 14));
            lbl_exam.get(i).setCursor(new Cursor(Cursor.HAND_CURSOR));
            lbl_exam.get(i).addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent me) {
                    lbl_examMouseEntered(me);
                }
                public void mouseExited(MouseEvent me) {
                    lbl_examMouseExited(me);
                }
                public void mouseClicked(MouseEvent me) {
                    lbl_examMouseClicked(me, quizzes.get(temp));
                }
            });
            panel_examList.add(lbl_exam.get(i));
        }

        this.panel_content.removeAll();
        this.panel_content.add(panel_examList);
        this.MainPath.setText("Home / My Courses / THI CUỐI KỲ");
        this.validate();
        this.repaint();
    }//GEN-LAST:event_returnHomeFrame

    private void addNewQuiz(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewQuiz
        // TODO add your handling code here:
        this.MainPath.setText("Home / My Courses / THI CUỐI KỲ / Add new Quiz");
        GUI_5_1_AddNewQuiz addNewQuiz = new GUI_5_1_AddNewQuiz(this);
        this.panel_content.removeAll();
        addNewQuiz.setSize(1030, 519);
        addNewQuiz.setLocation(5, 2);
        this.panel_content.add(addNewQuiz);
        this.validate();
        this.repaint();
    }//GEN-LAST:event_addNewQuiz

    private void lbl_examMouseClicked(java.awt.event.MouseEvent evt, Quiz quiz) {//GEN-FIRST:event_lbl_exam1MousePressed
        JLabel label = (JLabel) evt.getSource();
        GUI_6_1 gui6_1_exam = new GUI_6_1(this, quiz);

        this.MainPath.setText("Home / My Courses / THI CUỐI KỲ / " + label.getText());
        this.panel_content.removeAll();

        gui6_1_exam.setSize(1050, 519);
        gui6_1_exam.setLocation(0, 0);

        this.panel_content.removeAll();
        this.panel_content.add(gui6_1_exam);
        this.validate();
        this.repaint();
    }//GEN-LAST:event_lbl_exam1MousePressed

    private void lbl_examMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exam1MouseEntered
        JLabel label = (JLabel) evt.getSource();
        label.setForeground(Color.RED);
    }//GEN-LAST:event_lbl_exam1MouseEntered

    private void lbl_examMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exam1MouseExited
        JLabel label = (JLabel) evt.getSource();
        label.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbl_exam1MouseExited

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MainPath;
    private javax.swing.JPopupMenu PopUpMenu;
    private javax.swing.JButton btn_turnOnEditting;
    private javax.swing.JMenuItem catagories_MenuItem;
    private javax.swing.JMenuItem export_MenuItem;
    private javax.swing.JMenuItem import_MenuItem;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_HomeLogo;
    private List<JLabel> lbl_exam;
    private javax.swing.JLabel lbl_settingToShowPopUpMenu;
    private javax.swing.JPanel panel_ContainsAll;
    private javax.swing.JPanel panel_content;
    private javax.swing.JPanel panel_examList;
    private javax.swing.JPanel panel_header;
    private javax.swing.JMenuItem question_MenuItem;
    private List<Quiz> quizzes;
    // End of variables declaration//GEN-END:variables

    private void showMainMenu() {
        ShowMainMenu showMainMenu = new ShowMainMenu(this);
        List<JMenuItem> menuItems = new ArrayList<JMenuItem>();
        menuItems.add(question_MenuItem);
        menuItems.add(catagories_MenuItem);
        menuItems.add(import_MenuItem);
        menuItems.add(export_MenuItem);
        showMainMenu.setEvent(menuItems);
    }

    public JPanel getPanel_content() {
        return panel_content;
    }

    public JPanel getPanel_examList() {
        return panel_examList;
    }

    public JLabel getMainPath() {
        return MainPath;
    }

    public List<JLabel> getLbl_exam() {
        return lbl_exam;
    }

    public List<Quiz> getQuizzes() {
        return quizzes;
    }

    public void setPanel_content(JPanel panel_content) {
        this.panel_content = panel_content;
    }

    public void setPanel_examList(JPanel panel_examList) {
        this.panel_examList = panel_examList;
    }

    public void setMainPath(JLabel MainPath) {
        this.MainPath = MainPath;
    }

    public void setLbl_exam1(List<JLabel> lbl_exam) {
        // this.lbl_exam1 = lbl_exam1;
    }
}
