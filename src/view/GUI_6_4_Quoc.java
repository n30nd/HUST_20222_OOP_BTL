package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import model.Question;

public class GUI_6_4_Quoc extends JPanel {
    private GUI1_1_MainFrame mainFrame;
    private JPanel panelQuestionsList;
    private List<Question> qsOfQuiz;

    public GUI_6_4_Quoc (GUI1_1_MainFrame mainFrame, List<Question> qsOfQuiz) {
        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        this.mainFrame = mainFrame;
        this.qsOfQuiz = qsOfQuiz;
        
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.RED));
        setLayout(null);
        setSize(new Dimension(1024, 238));

        panelQuestionsList = new JPanel(new GridLayout(qsOfQuiz.size(), 1));
        gbc.fill = GridBagConstraints.BOTH; gbc.ipadx = 0; gbc.gridy = 0; gbc.weighty = 1;
        for (int i = 0; i < qsOfQuiz.size(); i++) {
            JLabel label1 = new JLabel(new ImageIcon(System.getProperty("user.dir") + "\\src\\view\\img\\drag.png"));
            JLabel label2 = new JLabel("" + (i + 1), JLabel.CENTER);
            JLabel label3 = new JLabel(new ImageIcon(System.getProperty("user.dir") + "\\src\\view\\img\\detail.png"));
            JLabel label4 = new JLabel(new ImageIcon(System.getProperty("user.dir") + "\\src\\vier\\img\\setting_24.png"));
            JLabel label = new JLabel();
            JLabel label5 = new JLabel(new ImageIcon(System.getProperty("user.dir") + "\\src\\view\\img\\setting_24.png"));
            JLabel label6 = new JLabel(new ImageIcon(System.getProperty("user.dir") + "\\src\\view\\img\\trash.png"));
            JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
            panel1.setBackground(Color.WHITE); // Thiết lập màu nền của panel là màu trắng

            // Tạo JLabel label7 và label8
            JLabel label7 = new JLabel("1.00");
            JLabel label8 = new JLabel(new ImageIcon(System.getProperty("user.dir") + "\\src\\view\\img\\blue_pen.png"));

            // Thiết lập màu nền của label7 và label8 là màu trắng
            label7.setBackground(Color.WHITE);
            label8.setBackground(Color.WHITE);

            // Thiết lập label7 và label8 hiển thị trên cùng một hàng
            label7.setVerticalAlignment(JLabel.CENTER);
            label8.setVerticalAlignment(JLabel.CENTER);

            // Thêm label7 và label8 vào panel
            panel1.add(label7);
            panel1.add(label8);
            
            
            JPanel panel = new JPanel();

            panel.setBackground(Color.LIGHT_GRAY);
            panel.setLayout(gb);

            gbc.gridx = 0; gbc.weightx = 25;
            panel.add(label1, gbc);

            label2.setBackground(Color.GRAY);
            label2.setOpaque(true);
            gbc.gridx = 1; gbc.weightx = 25;
            panel.add(label2, gbc);

            gbc.gridx = 2; gbc.weightx = 25;
            panel.add(label3, gbc);
            gbc.gridx = 3; gbc.weightx = 25;
            panel.add(label4, gbc);

            label.setHorizontalAlignment(JLabel.LEFT);
            label.setPreferredSize(new Dimension(400, 25));
            label.setText(qsOfQuiz.get(i).getName());
            gbc.gridx = 4; gbc.weightx = 869; gbc.anchor = GridBagConstraints.WEST;
            panel.add(label, gbc);

            gbc.gridx = 5; gbc.weightx = 25; gbc.anchor = GridBagConstraints.CENTER;
            panel.add(label5, gbc);
            gbc.gridx = 6; gbc.weightx = 25;
            panel.add(label6, gbc);
            gbc.gridx = 7;gbc.weightx = 25;
            panel.add(panel1,gbc);
            gbc.gridx = 8;gbc.weightx = 25;

            panelQuestionsList.add(panel);
        }
        
        JScrollPane scrollPane = new JScrollPane(panelQuestionsList);
        scrollPane.setBounds(0, 0, 1034, 238);
        add(scrollPane, BorderLayout.CENTER);
    }
}