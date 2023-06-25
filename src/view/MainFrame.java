package view;

import controller.ShowMainMenu;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.ImageIcon;
/**
 *
 * @author anhqu
 */
public class MainFrame extends javax.swing.JFrame {


    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        showMenuPopUp();
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
        panel_content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        question_MenuItem.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        question_MenuItem.setForeground(new java.awt.Color(0, 159, 229));
        question_MenuItem.setText("Questions");
        PopUpMenu.add(question_MenuItem);

        catagories_MenuItem.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        catagories_MenuItem.setForeground(new java.awt.Color(0, 159, 229));
        catagories_MenuItem.setText("Catagories");
        PopUpMenu.add(catagories_MenuItem);

        import_MenuItem.setFont(new java.awt.Font("Roboto Slab Medium", 0, 18)); // NOI18N
        import_MenuItem.setForeground(new java.awt.Color(0, 159, 229));
        import_MenuItem.setText("Import");
        PopUpMenu.add(import_MenuItem);

        export_MenuItem.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        export_MenuItem.setForeground(new java.awt.Color(0, 159, 229));
        export_MenuItem.setText("Export");
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

        lbl_settingToShowPopUpMenu.setIcon(new ImageIcon("\\src\\view\\img\\setting_24.png")); // NOI18N
        lbl_settingToShowPopUpMenu.setText("ABCXYZ");
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(852, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_settingToShowPopUpMenu)
                    .addComponent(btn_turnOnEditting))
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_settingToShowPopUpMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btn_turnOnEditting, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        panel_content.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Bài 2");

        jLabel2.setText("Bài 1");

        javax.swing.GroupLayout panel_contentLayout = new javax.swing.GroupLayout(panel_content);
        panel_content.setLayout(panel_contentLayout);
        panel_contentLayout.setHorizontalGroup(
            panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contentLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_contentLayout.setVerticalGroup(
            panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contentLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
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

    // Hiển thị PopUpMenu GUI_1.2 khi ấn vào nút cài đặt
    private void showPopupMenu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPopupMenu
        // TODO add your handling code here:
        PopUpMenu = new JPopupMenu();
        PopUpMenu.setLayout(new GridLayout(4, 2, 20, 0));
        JPanel panel_menuPopUpLeft = new JPanel();

        JLabel popupTitle = new JLabel("Question Bank");
        popupTitle.setFont(new Font("Roboto Black", Font.BOLD, 24));
        popupTitle.setForeground(new Color(0, 159, 229));

        panel_menuPopUpLeft.add(popupTitle);

        JPanel panel_menuPopUpRight = new JPanel();
        panel_menuPopUpRight.setLayout(new GridLayout(4, 1));

        PopUpMenu.add(panel_menuPopUpLeft);
        PopUpMenu.add(question_MenuItem);
        PopUpMenu.add(new Label(""));
        PopUpMenu.add(catagories_MenuItem);
        PopUpMenu.add(new Label(""));
        PopUpMenu.add(import_MenuItem);
        PopUpMenu.add(new Label(""));
        PopUpMenu.add(export_MenuItem);

        PopUpMenu.show(evt.getComponent(), evt.getX() - 350, evt.getY());
    }//GEN-LAST:event_showPopupMenu

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu PopUpMenu;
    private javax.swing.JButton btn_turnOnEditting;
    private javax.swing.JMenuItem catagories_MenuItem;
    private javax.swing.JMenuItem export_MenuItem;
    private javax.swing.JMenuItem import_MenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_settingToShowPopUpMenu;
    private javax.swing.JPanel panel_ContainsAll;
    private javax.swing.JPanel panel_content;
    private javax.swing.JPanel panel_header;
    private javax.swing.JMenuItem question_MenuItem;
    // End of variables declaration//GEN-END:variables

    public void showMenuPopUp() {
        ShowMainMenu showMainMenu = new ShowMainMenu(panel_content);
        List<JMenuItem> menuItems = new ArrayList<JMenuItem>();
        menuItems.add(question_MenuItem);
        menuItems.add(catagories_MenuItem);
        menuItems.add(import_MenuItem);
        menuItems.add(export_MenuItem);
        showMainMenu.setEvent(menuItems);
    }
}
