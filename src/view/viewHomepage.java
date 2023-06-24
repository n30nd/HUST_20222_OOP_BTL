package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.net.http.WebSocket;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import view.controllerHomepage.homepageListener;

class viewHomepage {
    //Controller variables
    public homepageListener hListener;

    //Main homepage frame variables
    private JFrame homepageFrame = new JFrame("Phần mềm thi trắc nghiệm");
    private modelHomepage mHomepage;

    //Title variables
    private JPanel titlePanel;
    
    //Function variables
    private JButton edit, questionSetup;
    private JMenuItem puQues_categories, puQues_export, puQues_import, puQues_questions;
    private JPanel functionPanel;

    //Edit variables
    private JTabbedPane editTabbedPane = new JTabbedPane();
    private JPanel editPanel;
    private String categoryList[] = {"Chả hiểu", "  cái danh sách", "    l này", "      phân cấp", "      tổ chức thế nào"};
        //Categories
        private JButton addCategory = new JButton("ADD CATEGORY");
        private JComboBox<String> parentCategory;
        private JTextArea categoryInfo = new JTextArea();
        private JTextField name = new JTextField(), idNumber = new JTextField();

    //Browse variables
    private JPanel browsePanel;

    //Constructor
    public viewHomepage(modelHomepage mHomepage) {
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout gb = new GridBagLayout();

        this.mHomepage = mHomepage;
        
        hListener = (new controllerHomepage(this)).new homepageListener();

        homepageFrame.setBackground(Color.WHITE);
        homepageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homepageFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        homepageFrame.setLayout(gb);
        homepageFrame.setSize(500, 500);

        gbc.anchor = GridBagConstraints.CENTER; gbc.fill = GridBagConstraints.BOTH; gbc.insets = new Insets(0, 0, 10, 0);
        gbc.gridx = 0; gbc.gridy = 0; gbc.ipadx = 0; gbc.ipady = 30; gbc.weightx = 1920; gbc.weighty = 30;  title(gbc);
                                                                                    gbc.insets = new Insets(0, 10, 10, 10);
        gbc.gridx = 0; gbc.gridy = 1; gbc.ipadx = 0; gbc.ipady = 100;                    gbc.weighty = 100; function(gbc);
        gbc.gridx = 0; gbc.gridy = 2; gbc.ipadx = 0; gbc.ipady = 850;gbc.weightx = 1920; gbc.weighty = 860; browse(gbc);
                                                                                                               edit(gbc);

        homepageFrame.setVisible(true);
    }
    //Mainframe methods

    public void setVisible(boolean b) {
        homepageFrame.setVisible(b);
    }
    
    //Title panel methods

    private void title(GridBagConstraints gbc) {
        GridBagConstraints _gbc = new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0, 0, 0, 20), 150, 5);
        GridBagLayout _gc = new GridBagLayout();
        JLabel label = new JLabel("Group HEHE", new ImageIcon("src\\icon\\avatar.png"), JLabel.RIGHT);
        titlePanel = new JPanel();

        label.setForeground(Color.WHITE);
        
        titlePanel.setLayout(_gc);
        titlePanel.add(label, _gbc);
        titlePanel.setBackground(Color.LIGHT_GRAY);

        homepageFrame.add(titlePanel, gbc);
    }
    
    //Function panel methods

    private void function(GridBagConstraints gbc) {
        GridBagConstraints _gbc = new GridBagConstraints();
        GridBagLayout _gb = new GridBagLayout();
        JLabel label = new JLabel(new ImageIcon("src\\icon\\mainLogo.png"));
        edit = new JButton("Bật chế độ chỉnh sửa");
        functionPanel = new JPanel();
        questionSetup = new JButton(new ImageIcon("src\\icon\\questionSetup.png"));

        edit.addActionListener(hListener);
        edit.setBackground(Color.BLUE);
        edit.setFont(edit.getFont().deriveFont(Font.BOLD));
        edit.setForeground(Color.WHITE);

        label.setHorizontalAlignment(JLabel.LEFT);
        questionSetup.addActionListener(hListener);
        questionSetup.setSize(20, 10);
        
        functionPanel.setLayout(_gb);
        functionPanel.setSize(1900, 100);

        _gbc.anchor = GridBagConstraints.WEST; _gbc.fill = GridBagConstraints.NONE; _gbc.insets = new Insets(5, 10, 0, 0);
        _gbc.gridx = 0; _gbc.gridy = 0; _gbc.ipadx = 0; _gbc.ipady = 0; _gbc.weightx = 930; _gbc.weighty = 70; functionPanel.add(label, _gbc);
        _gbc.anchor = GridBagConstraints.SOUTHEAST;                                 _gbc.insets = new Insets(0, 0, 10, 10);
        _gbc.gridx = 1; _gbc.gridy = 0; _gbc.ipadx = 0; _gbc.ipady = 0;                                        functionPanel.add(questionSetup, _gbc);
        _gbc.anchor = GridBagConstraints.NORTHEAST;                                 _gbc.insets = new Insets(0, 0, 0, 10);
        _gbc.gridx = 1; _gbc.gridy = 1; _gbc.ipadx = 0; _gbc.ipady = 0; _gbc.weightx = 175; _gbc.weighty = 30; functionPanel.add(edit, _gbc);
        functionPanel.setBackground(Color.WHITE);
        functionPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        homepageFrame.add(functionPanel, gbc);
    }

    public void popupQuestion() {
        JLabel label = new JLabel("NGÂN HÀNG CÂU HỎI                    ");
        JPopupMenu popupMenu = new JPopupMenu();

        label.setBounds(0, 0, 200, 100);
        label.setFont(new Font("Times New Roman", Font.BOLD, 17));
        label.setForeground(Color.BLUE);
        
        popupMenu.setLayout(new GridLayout(4, 2));
        puQues_categories = new JMenuItem("Danh mục");
        puQues_categories.setForeground(Color.BLUE);
        puQues_categories.addMouseListener(hListener);
        puQues_export = new JMenuItem("Xuất câu hỏi");
        puQues_export.setForeground(Color.BLUE);
        puQues_export.addMouseListener(hListener);
        puQues_import = new JMenuItem("Nhập câu hỏi");
        puQues_import.setForeground(Color.BLUE);
        puQues_import.addMouseListener(hListener);
        puQues_questions = new JMenuItem("Câu hỏi");
        puQues_questions.addMouseListener(hListener);
        puQues_questions.setForeground(Color.BLUE);

        popupMenu.add(label);
        popupMenu.add(puQues_questions);
        popupMenu.add(new JLabel());
        popupMenu.add(puQues_categories);
        popupMenu.add(new JLabel());
        popupMenu.add(puQues_import);
        popupMenu.add(new JLabel());
        popupMenu.add(puQues_export);

        functionPanel.add(popupMenu);

        popupMenu.show(popupMenu, 1574, 40);
    }
    
    //Content panel
    public void browse(GridBagConstraints gbc) {
        browsePanel = new JPanel();

        browsePanel.setBackground(Color.WHITE);
        browsePanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        homepageFrame.add(browsePanel, gbc);
    }
   
    public void edit(GridBagConstraints gbc) {
        JPanel _categories = new JPanel(), _export = new JPanel(), _import = new JPanel(), _questions = new JPanel();
        editPanel = new JPanel();

        questionTab(_questions);
        categoriesTab(_categories);
        importTab(_import);

        editTabbedPane.addTab("Questions", new ImageIcon(), _questions, "Thêm câu hỏi");
        editTabbedPane.addTab("Categories", new ImageIcon(), _categories, "Thêm danh mục");
        editTabbedPane.addTab("Import", new ImageIcon(), _import, "Nhập câu hỏi từ file");
        editTabbedPane.addTab("Export", new ImageIcon(), _export, "Xuất đề thi ra file");

        editTabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
        editTabbedPane.setMnemonicAt(0, KeyEvent.VK_2);
        editTabbedPane.setMnemonicAt(0, KeyEvent.VK_3);
        editTabbedPane.setMnemonicAt(0, KeyEvent.VK_4);

        editPanel.add(editTabbedPane);
        editPanel.setLayout(new GridLayout(1, 4));

        homepageFrame.add(editPanel, gbc);
        editPanel.setVisible(false);
    }
        //Tabs
    public void questionTab(JPanel _questions) {
        JButton q_button = new JButton("TẠO CÂU HỎI MỚI");
        JCheckBox q_checkbox1 = new JCheckBox("Đồng thời hiện câu hỏi cho những danh mục phụ"), q_checkbox2 = new JCheckBox("Đồng thời hiện những câu hỏi cũ");
        JComboBox<String> q_ComboBox = new JComboBox<>(categoryList);
        JLabel q_label1 = new JLabel("Ngân hàng câu hỏi"), q_label2 = new JLabel("Chọn danh mục"), q_label3 = new JLabel("Danh mục mặc định cho câu hỏi được chia sẻ trong văn bản");
        
        q_button.setBounds(5, 210, 270, 40);
        q_button.setBackground(Color.BLUE);
        q_button.setFont(q_button.getFont().deriveFont((float)18.0));
        q_button.setForeground(Color.WHITE);

        q_checkbox1.setBounds(10, 140, 1000, 25);
        q_checkbox2.setBounds(10, 170, 1000, 25);

        q_ComboBox.addActionListener(hListener);
        q_ComboBox.setBounds(155, 60, 200, 35);

        q_label1.setBounds(5, 5, 500, 50);
        q_label1.setFont(q_label1.getFont().deriveFont((float)30.0));
        q_label1.setFont(q_label1.getFont().deriveFont(Font.BOLD));
        q_label1.setForeground(Color.RED);
        q_label2.setBounds(5, 60, 150, 35);
        q_label3.setBounds(5, 100, 500, 35);

        _questions.add(q_button);
        _questions.add(q_checkbox1);
        _questions.add(q_checkbox2);
        _questions.add(q_ComboBox);
        _questions.add(q_label1);
        _questions.add(q_label2);
        _questions.add(q_label3);
        _questions.setBackground(Color.WHITE);
        _questions.setLayout(null);
    }
    public void categoriesTab(JPanel _categories) {
        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel c_label1 = new JLabel("Add category"),
               c_label2 = new JLabel("Những mục bắt buộc được đánh dấu", new ImageIcon("src\\icon\\category_compulsory.png"), 0);
        JScrollPane sp_categoryInfo = new JScrollPane(categoryInfo);

        addCategory.setBackground(Color.RED);
        addCategory.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        addCategory.setForeground(Color.WHITE);
        
        c_label1.setFont(new Font("Segoe UI", Font.BOLD, 30));
        c_label1.setForeground(Color.RED);
        
        c_label2.setFont(c_label2.getFont().deriveFont((float)14.0));
        c_label2.setHorizontalTextPosition(JLabel.LEFT);
        
        categoryInfo.setLineWrap(true);
        categoryInfo.setWrapStyleWord(true);
       
        parentCategory = new JComboBox<String>(categoryList);
        parentCategory.setBackground(Color.WHITE);

        _categories.setLayout(gb);
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0; gbc.gridy = 0; gbc.ipadx = 500; gbc.ipady = 25; gbc.weightx = 500; gbc.weighty = 35; _categories.add(c_label1, gbc);
        gbc.gridx = 0; gbc.gridy = 1;                                                                       _categories.add(new JLabel("     Parent category"), gbc);
        gbc.gridx = 0; gbc.gridy = 2;                                                                       _categories.add(new JLabel("     Name"), gbc);
        gbc.gridx = 0; gbc.gridy = 3;                  gbc.ipady = 250;                   gbc.weighty = 260; _categories.add(new JLabel("     Category info"), gbc);
        gbc.gridx = 0; gbc.gridy = 4;                  gbc.ipady = 25;                    gbc.weighty = 35; _categories.add(new JLabel("     ID number"), gbc);
        gbc.gridx = 1; gbc.gridy = 1; gbc.ipadx = 20;                  gbc.weightx = 20;  gbc.weighty = 35; _categories.add(new JLabel(new ImageIcon("src\\\\icon\\category_hint.png")), gbc);
        gbc.gridx = 1; gbc.gridy = 2;                                                                       _categories.add(new JLabel(new ImageIcon("src\\\\icon\\category_compulsory.png")), gbc);
        gbc.gridx = 1; gbc.gridy = 4;                                                                       _categories.add(new JLabel(new ImageIcon("src\\\\icon\\category_hint.png")), gbc);
        gbc.anchor = GridBagConstraints.CENTER; gbc.fill = GridBagConstraints.NONE;
        gbc.gridx = 2; gbc.gridy = 1; gbc.ipadx = 1380;gbc.ipady = 15; gbc.weightx = 1380;                  _categories.add(parentCategory, gbc);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 2; gbc.gridy = 2;                                                                       _categories.add(name, gbc);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 2; gbc.gridy = 3;                                                                       _categories.add(sp_categoryInfo, gbc);
        gbc.anchor = GridBagConstraints.WEST; gbc.fill = GridBagConstraints.NONE;
        gbc.gridx = 2; gbc.gridy = 4; gbc.ipadx = 150;                                                      _categories.add(idNumber, gbc);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridx = 0; gbc.gridy = 5; gbc.ipadx = 50;                          gbc.gridwidth = 3;          _categories.add(addCategory, gbc);
        gbc.gridx = 0; gbc.gridy = 6;                                                                      _categories.add(c_label2, gbc);
        _categories.setBackground(Color.WHITE);
    }
    public void importTab(JPanel _import) {
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout gb = new GridBagLayout();
        JLabel label1 = new JLabel("Import question from file"),
               label2 = new JLabel("File format"), label3 = new JLabel("General"), label4 = new JLabel("Import questions from file");

        label1.setFont(new Font("Segoe UI", Font.BOLD, 30));
        label1.setForeground(Color.RED);
        label2.setForeground(Color.RED);
        label3.setForeground(Color.RED);
        label4.setForeground(Color.RED);

        _import.setBackground(Color.WHITE);
        _import.setLayout(gb);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0; gbc.gridy = 0; gbc.ipadx = 940; gbc.ipady = 35; gbc.weightx = 940; gbc.weighty = 45; _import.add(label1, gbc);
        gbc.gridx = 0; gbc.gridy = 1;                  gbc.ipady = 25;                    gbc.weighty = 35; _import.add(label2, gbc);
        gbc.gridx = 0; gbc.gridy = 2;                                                                       _import.add(label3, gbc);
        gbc.gridx = 0; gbc.gridy = 3;                                                                       _import.add(label4, gbc);
    }
    
    //Getter
    public JPanel getBrowsePanel() {return browsePanel;}
    public JButton getEdit() {return edit;}    
    public JPanel getEditPanel() {return editPanel;}
    public JTabbedPane getEditTabbedPane() {return editTabbedPane;}
    public modelHomepage getModelHomepage() {return mHomepage;}
    public JMenuItem getPuQues_categories() {return puQues_categories;}
    public JMenuItem getPuQues_export() {return puQues_export;}
    public JMenuItem getPuQues_import() {return puQues_import;}
    public JMenuItem getPuQues_questions() {return puQues_questions;}
    public JButton getQuestionSetup() {return questionSetup;}
    //Setter
    public void setModelHomepage(modelHomepage mHomepage) {this.mHomepage = mHomepage;}
}