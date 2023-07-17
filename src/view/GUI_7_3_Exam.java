package view;

import controller.GUI7_3ToPDFConverter;
import java.util.ArrayList;
import java.util.List;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.time.LocalDateTime;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;

import controller.Xuatnhapcategoryquestion;
import model.Question;

public class GUI_7_3_Exam extends JPanel {
    private Xuatnhapcategoryquestion xn = new Xuatnhapcategoryquestion();
    private List<JLabel> questionLabel = new ArrayList<JLabel>();
    private List<Question> listOfQuestions = xn.readQuestionList(0);
    private ButtonGroup[] onlyChoice = new ButtonGroup[listOfQuestions.size()];
    private JPanel[] multiChoice = new JPanel[listOfQuestions.size()];

    private JLabel label1, finishLabel, timer, exportLabel;
    private JPanel navigationPanel, qListPanel, quizPanel, labelState = new JPanel(new GridLayout(6, 1)), state = new JPanel(new GridLayout(6, 1));
    private JScrollPane quizScrollPane;
    private LocalDateTime begin = LocalDateTime.now(), end;

    private JFrame _frame;
    private JLabel _label;
    private JButton _okButton, _cancelButton;

    private Timer countDownTimer;
    private int timeRemaining = 3600;

    private JPasswordField password;

    private GUI1_1_MainFrame mainFrame;

    public GUI_7_3_Exam(GUI1_1_MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        mainFrame.add(this);

        UIManager.put("Label.font", new Font("SegoeUI", Font.PLAIN, 14));
        
        GridBagLayout gb = new GridBagLayout(), _gb = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints(), _gbc = new GridBagConstraints();

        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.black, 1, false));
        setBounds(10, 200, 1022, 527);
        setLayout(gb);

        label1 = new JLabel("Quiz navigation\n", JLabel.LEFT);
        label1.setFont(new Font("SegoeUI", Font.BOLD, 20));
        label1.setForeground(Color.RED);
        // List question table
        qListPanel = new JPanel();
        qListPanel.setBackground(Color.WHITE);
        qListPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        qListPanel.setMinimumSize(new Dimension(100, 520));
        for (int i = 0; i < listOfQuestions.size(); i++) {
            questionLabel.add(new JLabel("" + (i + 1), JLabel.CENTER));
            questionLabel.get(i).setBackground(Color.WHITE);
            questionLabel.get(i).setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));
            questionLabel.get(i).setOpaque(true);
            questionLabel.get(i).setPreferredSize(new Dimension(28, 40));

            final int temp = i;
            questionLabel.get(i).addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent me) {
                    moveView(temp + 1);
                }
                public void mouseEntered(MouseEvent me) {}
                public void mouseExited(MouseEvent me) {}
                public void mousePressed(MouseEvent me) {}
                public void mouseReleased(MouseEvent me) {}
            });
            
            qListPanel.add(questionLabel.get(i));
        }

        // Verify window
        finishLabel = new JLabel("  Finish attempt...");
        finishLabel.setBackground(Color.WHITE);
        finishLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        finishLabel.setOpaque(true);
        finishLabel.setForeground(Color.BLUE);
        finishLabel.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent me) {
                finish();
            }
            public void mouseEntered(MouseEvent me) {
                finishLabel.setText("<HTML><U>&nbsp;&nbsp;Finish attempt...</U></HTML>");
            }
            public void mouseExited(MouseEvent me) {
                finishLabel.setText("  Finish attempt...");
            }
            public void mousePressed(MouseEvent me) {}
            public void mouseReleased(MouseEvent me) {}
        });

        exportLabel = new JLabel();

        JPanel navigationSouthPanel = new JPanel(new BorderLayout());
        navigationSouthPanel.setBackground(Color.WHITE);
        navigationSouthPanel.add(finishLabel, BorderLayout.WEST);
        navigationSouthPanel.add(exportLabel, BorderLayout.EAST);
        
        navigationPanel = new JPanel();
        navigationPanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, false));
        navigationPanel.setLayout(new BorderLayout());
        navigationPanel.setMaximumSize(new Dimension(254, 520));
        navigationPanel.add(label1, BorderLayout.NORTH);
        navigationPanel.add(qListPanel, BorderLayout.CENTER);
        navigationPanel.add(navigationSouthPanel, BorderLayout.SOUTH);

        quizPanel = new JPanel();
        quizPanel.setBackground(Color.WHITE);
        quizPanel.setLayout(_gb);
        _gbc.anchor = GridBagConstraints.NORTHWEST;
        _gbc.insets = new Insets(5, 5, 5, 5);
        _gbc.fill = GridBagConstraints.BOTH; _gbc.gridx = 0; _gbc.gridy = 0; _gbc.weightx = 1.00; _gbc.weighty = 1; quizPanel.add(labelState, _gbc);
        _gbc.fill = GridBagConstraints.BOTH; _gbc.gridx = 1;                 _gbc.weightx = 5.75;                   quizPanel.add(state, _gbc);
        for (int i = 0; i < listOfQuestions.size(); i++) {
            //Left - Number of question
            JLabel label1, label2, label3, label4;
            JPanel panelLeft = new JPanel(new GridLayout(4, 1, 0, 5));

            label1 = new JLabel();
            label1.setFont(new Font("SegoeUI", Font.BOLD, 14));
            label1.setForeground(Color.RED);
            label1.setText("Question " + (i + 1));

            label2 = new JLabel("Not yet answered");
            label2.setFont(label2.getFont().deriveFont((float)10.0));

            label3 = new JLabel("Marked out of " + listOfQuestions.get(i).getMark());
            label3.setFont(label3.getFont().deriveFont((float)10.0));

            label4 = new JLabel("Flag question", new ImageIcon(System.getProperty("user.dir") + "\\src\\view\\img\\flag.png"), JLabel.LEFT);
            label4.setFont(label4.getFont().deriveFont((float)10.0));
            
            panelLeft.add(label1);
            panelLeft.add(label2);
            panelLeft.add(label3);
            panelLeft.add(label4);

            panelLeft.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1, false));

            _gbc.fill = GridBagConstraints.NORTHWEST; _gbc.gridx = 0; _gbc.gridy = i + 1; _gbc.weightx = 1; quizPanel.add(panelLeft, _gbc);

            //Right - Content of question
            JPanel panelRight = new JPanel(new GridLayout(4, 1, 10, 0));

            panelRight.add(new JLabel(listOfQuestions.get(i).getName()));
            if (listOfQuestions.get(i).getQuestionImage().isEmpty()) panelRight.add(new JLabel()); else panelRight.add(new JLabel(new ImageIcon(listOfQuestions.get(i).getQuestionImage())));

            multiChoice[i] = new JPanel(new GridLayout(listOfQuestions.get(i).getChoice().size(), 2));

            if (checkMutiple(listOfQuestions.get(i))) {                
                for (int j = 0; j < listOfQuestions.get(i).getChoice().size(); j++) {
                    multiChoice[i].add(new JCheckBox(listOfQuestions.get(i).getChoice().get(j)));
                    String _temp = listOfQuestions.get(i).getChoiceImage().get(j);
                    if (_temp.isEmpty()) multiChoice[i].add(new JLabel()); else multiChoice[i].add(new JLabel(new ImageIcon(_temp)));
                    
                    final int temp = i;
                    ((JCheckBox)multiChoice[i].getComponent(j * 2)).addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent ae) {
                            done(temp);
                        }
                    });
                }
            } else {
                onlyChoice[i] = new ButtonGroup();
                for (int j = 0; j < listOfQuestions.get(i).getChoice().size(); j++) {
                    multiChoice[i].add(new JRadioButton(listOfQuestions.get(i).getChoice().get(j)));
                    String _temp = listOfQuestions.get(i).getChoiceImage().get(j);
                    if (_temp.isEmpty()) multiChoice[i].add(new JLabel()); else multiChoice[i].add(new JLabel(new ImageIcon(_temp)));
                    onlyChoice[i].add((JRadioButton)multiChoice[i].getComponent(j * 2));

                    final int temp = i;
                    ((JRadioButton)multiChoice[i].getComponent(j * 2)).addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent ae) {
                            done(temp);
                        }
                    });
                }
            }

            panelRight.add(multiChoice[i]);
            _gbc.fill = GridBagConstraints.BOTH; _gbc.gridx = 1; _gbc.gridy = i + 1; _gbc.weightx = 6; quizPanel.add(panelRight, _gbc);
        }

        quizScrollPane = new JScrollPane(quizPanel);
        quizScrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));
        quizScrollPane.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, false));
        quizScrollPane.getVerticalScrollBar().setUnitIncrement(10);

        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0; gbc.gridy = 1; gbc.weightx = 4; gbc.weighty = 1; add(quizScrollPane, gbc);
        gbc.gridx = 1;                gbc.weightx = 1;                  add(navigationPanel, gbc);
        
        timer = new JLabel("");
        timer.setBackground(Color.LIGHT_GRAY);
        timer.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 1, true));
        timer.setOpaque(true);
        timer.setPreferredSize(new Dimension(50, 50));

        labelState.setBackground(Color.WHITE);
        state.setBackground(Color.WHITE);
        state.setLayout(new GridLayout(1, 4));
        state.add(new JLabel()); state.add(new JLabel()); state.add(new JLabel()); state.add(timer);
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                countDownTimer = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        if (timeRemaining > 0) {
                            timeRemaining--;
                            timer.setText("Time Left " + timeRemaining / 3600 + ":" + timeRemaining % 3600 / 60 + ":" + timeRemaining % 60);
                        }
                        else {
                            countDownTimer.stop();
                            review();
                        }
                    }
                });

                countDownTimer.start();
            }
        });
    }

    private boolean checkMutiple(Question q) {
        int res = 0;

        for (int i = 0; i < q.getAnswer().size(); i++) {
            if (q.getAnswer().get(i) > 0) res++;
        }

        return (res == 1) ? false : true;
    }

    private void moveView(int i) {
        quizScrollPane.getVerticalScrollBar().setValue((int)quizPanel.getComponent(2 * i).getLocation().getY());
    }
    private void done(int i) {
        questionLabel.get(i).setBackground(Color.LIGHT_GRAY);
    }
    public void finish() {
        _frame = new JFrame("Xác nhận nộp bài");
        _label = new JLabel("  Bạn xác nhận muốn nộp bài chứ?");
        _okButton = new JButton("Xác nhận");
        _cancelButton = new JButton("Hủy");

        _frame.setBackground(Color.WHITE);
        _frame.setLayout(new BorderLayout(10, 10));
        _frame.setLocationRelativeTo(mainFrame);
        _frame.setSize(300, 110);

        JPanel _okPanel = new JPanel(new FlowLayout()), _cancelPanel = new JPanel(new FlowLayout());
        _okButton.setBackground(new Color(33, 150, 243, 255));
        _okButton.setForeground(Color.WHITE);
        _okButton.setPreferredSize(new Dimension(90, 25));
        _okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                getCountDownTimer().stop();
                review();
            }
        });
        _okPanel.add(new JLabel(""));
        _okPanel.add(_okButton);
        _okPanel.setPreferredSize(new Dimension(100, 50));

        _cancelButton.setBackground(new Color(244, 67, 54, 255));
        _cancelButton.setForeground(Color.WHITE);
        _cancelButton.setPreferredSize(new Dimension(70, 25));
        _cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                mainFrame.setEnabled(true);
                _frame.setVisible(false);
            }
        });
        _cancelPanel.add(_cancelButton);
        _cancelPanel.add(new JLabel("   "));
        _cancelPanel.setPreferredSize(new Dimension(100, 50));

        _frame.add(_label, BorderLayout.NORTH);
        _frame.add(_okPanel, BorderLayout.WEST);
        _frame.add(_cancelPanel, BorderLayout.EAST);

        _frame.setVisible(true);
    }
    //GUI_7_4_Review
    public void review() {
        for (int i = 0; i < listOfQuestions.size(); i++) {
            for (Component c : multiChoice[i].getComponents()) c.setEnabled(false);
        }

        end = LocalDateTime.now();
        if (_frame != null) _frame.setVisible(false);

        finishLabel.removeMouseListener(finishLabel.getMouseListeners()[0]);
        finishLabel.setText("Finish review");
        finishLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                mainFrame.returnHomeFrame();
            }
            public void mouseEntered(MouseEvent me) {
                finishLabel.setText("<HTML><U>Finish review</U></HTML");
            }
            public void mouseExited(MouseEvent me) {
                finishLabel.setText("Finish review");
            }
        });

        exportLabel.setText("Export PDF");
        exportLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                //xuất pdf
                exportEncrypt();
            }
            public void mouseEntered(MouseEvent me) {
                exportLabel.setText("<HTML><U>Export PDF</U></HTML");
            }
            public void mouseExited(MouseEvent me) {
                exportLabel.setText("     Export PDF");
            }
        });

        labelState.setLayout(new GridLayout(6, 1));
        labelState.add(new JLabel("Started on", JLabel.RIGHT));
        labelState.add(new JLabel("State", JLabel.RIGHT));
        labelState.add(new JLabel("Completed on", JLabel.RIGHT));
        labelState.add(new JLabel("Time taken", JLabel.RIGHT));
        labelState.add(new JLabel("Marks", JLabel.RIGHT));
        labelState.add(new JLabel("Grade ", JLabel.RIGHT));

        int i = 0;
        for (Component c : labelState.getComponents()) {
            ((JLabel)c).setBackground(i % 2 == 0 ? new Color(221, 221, 221, 255) : Color.LIGHT_GRAY); i++;
            ((JLabel)c).setFont(((JLabel)c).getFont().deriveFont(Font.BOLD));
            ((JLabel)c).setForeground(Color.RED);
            ((JLabel)c).setOpaque(true);
        }

        Double[] mark = check(quizPanel);
        state.setLayout(new GridLayout(6, 1));
        state.removeAll();
        state.add(new JLabel("  " + begin.getDayOfWeek().toString() + ", " + begin.getDayOfMonth() + " " + begin.getMonth() + " " + begin.getYear() + ", " + begin.getHour() + ":" + begin.getMinute()));
        state.add(new JLabel("  " + "Finished"));
        state.add(new JLabel("  " + end.getDayOfWeek().toString() + ", " + end.getDayOfMonth() + " " + end.getMonth() + " " + end.getYear() + ", " + end.getHour() + ":" + end.getMinute()));
        state.add(new JLabel("  " + Duration.between(begin, end).toMinutes() + " min " + Duration.between(begin, end).toSeconds() + " secs"));
        state.add(new JLabel("  " + (new BigDecimal(mark[0].toString())).setScale(2, RoundingMode.HALF_UP).doubleValue() + '/' + (new BigDecimal(mark[1].toString())).setScale(1, RoundingMode.HALF_UP).doubleValue()));
        Double grade = mark[0] / mark[1] * 10; grade = (new BigDecimal(grade.toString())).setScale(2, RoundingMode.HALF_UP).doubleValue(); 
        state.add(new JLabel("  " + grade + " out of 10.00 (" + grade * 10 + "%)"));

        // state.add(new JLabel("  " + (new BigDecimal((mark / maxGrade).toString()).setScale(1, RoundingMode.HALF_UP).doubleValue())));
        for (Component c : state.getComponents()) {
            ((JLabel)c).setBackground(i % 2 == 0 ? new Color(197, 223, 248, 255) : new Color(120, 149, 203, 255)); i++;
            ((JLabel)c).setFont(((JLabel)c).getFont().deriveFont(Font.BOLD));
            ((JLabel)c).setOpaque(true);
        }
    }
    public Double[] check(JPanel _quizPanel) {
        Double[] mark = {0.0, 0.0};
        
        for (int i = 0; i < questionLabel.size(); i++) {
            JLabel label = new JLabel("The correct answer is: ");

            if (onlyChoice[i] == null) {
                for (int j = 0; j < multiChoice[i].getComponentCount() / 2; j++) {
                    if (((JCheckBox)multiChoice[i].getComponent(j * 2)).isSelected()) {
                        mark[0] += listOfQuestions.get(i).getMark() * listOfQuestions.get(i).getAnswer().get(j);
                    }
                    if (listOfQuestions.get(i).getAnswer().get(j) > 0) label.setText(label.getText() + listOfQuestions.get(i).getChoice().get(j) + ", ");
                }
            } else {
                for (int j = 0; j < multiChoice[i].getComponentCount() / 2; j++) {
                    if (((JRadioButton)multiChoice[i].getComponent(j * 2)).isSelected()) {
                        mark[0] += listOfQuestions.get(i).getMark() * listOfQuestions.get(i).getAnswer().get(j);
                    }
                    if (listOfQuestions.get(i).getAnswer().get(j) > 0) label.setText(label.getText() + listOfQuestions.get(i).getChoice().get(j) + ", ");
                }
            }
            mark[1] += listOfQuestions.get(i).getMark();

            label.setBackground(Color.YELLOW);
            label.setOpaque(true);
            ((JPanel)_quizPanel.getComponent(2 * i + 3)).add(label);
        }

        return mark;
    }

    public void exportEncrypt() {
        JFrame _frame = new JFrame("Đặt mật khẩu");
        JButton verify = new JButton("Xác nhận"), cancel = new JButton("Hủy");
        JCheckBox show = new JCheckBox("Hiện mật khẩu");
        JPanel panel = new JPanel(new GridLayout(1, 5));
        password = new JPasswordField();

        verify.setBackground(Color.BLUE);
        verify.setForeground(Color.WHITE);
        verify.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                GUI7_3ToPDFConverter xpf = new GUI7_3ToPDFConverter();
                xpf.convertToPDF(mainFrame.getjPanel3(),quizPanel, "src\\Data\\quizExport.pdf");
            }
        });

        cancel.setBackground(Color.RED);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                mainFrame.setEnabled(true);
                _frame.setVisible(false);
            }
        });

        show.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                if (ie.getStateChange() == ItemEvent.SELECTED) {
                    password.setEchoChar((char)0);
                } else {
                    password.setEchoChar((char)8226);
                }
            }
        });        panel.add(new JLabel());
        panel.add(verify);
        panel.add(new JLabel());
        panel.add(cancel);
        panel.add(new JLabel());

        _frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                mainFrame.setEnabled(true);
            }
        });
        _frame.setLayout(new BorderLayout(10, 0));
        _frame.setLocationRelativeTo(mainFrame);
        _frame.setSize(500, 100);

        _frame.add(new JLabel("Mật khẩu"), BorderLayout.WEST);
        _frame.add(password, BorderLayout.CENTER);
        _frame.add(show, BorderLayout.EAST);
        _frame.add(panel, BorderLayout.SOUTH);

        mainFrame.setEnabled(false);

        _frame.setVisible(true);
    }

    public Timer getCountDownTimer() {return countDownTimer;}
}
