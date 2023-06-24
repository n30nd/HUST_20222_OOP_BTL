package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class controllerHomepage {
    private modelHomepage mHomepage;
    private viewHomepage vHomepage;
    
    public controllerHomepage(viewHomepage vHomepage) {
        this.vHomepage = vHomepage;
        this.mHomepage = vHomepage.getModelHomepage();
    };

    class homepageListener implements ActionListener, MouseListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == vHomepage.getEdit()) {
                if (!vHomepage.getEditPanel().isVisible()) {
                    vHomepage.getBrowsePanel().setVisible(false);
                    vHomepage.getEditPanel().setVisible(true);
                    vHomepage.getEdit().setBackground(Color.RED);
                    vHomepage.getEdit().setText("Tắt chế độ chỉnh sửa");
                } else {
                    vHomepage.getBrowsePanel().setVisible(true);
                    vHomepage.getEditPanel().setVisible(false);
                    vHomepage.getEdit().setBackground(Color.BLUE);
                    vHomepage.getEdit().setText("Bật chế độ chỉnh sửa");
                }
            }
            if (e.getSource() == vHomepage.getQuestionSetup()) {
                vHomepage.popupQuestion();
            }
        }

        public void mouseClicked(MouseEvent me) {};
        public void mouseEntered(MouseEvent me) {};
        public void mouseExited(MouseEvent me) {};
        public void mousePressed(MouseEvent me) {
            if (me.getSource() == vHomepage.getPuQues_questions()) {
                vHomepage.getEditTabbedPane().setSelectedIndex(0);
                if (!vHomepage.getEditPanel().isVisible()) {
                    vHomepage.getBrowsePanel().setVisible(false);
                    vHomepage.getEditPanel().setVisible(true);
                }
            }
            if (me.getSource() == vHomepage.getPuQues_categories()) {
                vHomepage.getEditTabbedPane().setSelectedIndex(1);
                if (!vHomepage.getEditPanel().isVisible()) {
                    vHomepage.getBrowsePanel().setVisible(false);
                    vHomepage.getEditPanel().setVisible(true);
                }
            }
            if (me.getSource() == vHomepage.getPuQues_import()) {
                vHomepage.getEditTabbedPane().setSelectedIndex(2);
                if (!vHomepage.getEditPanel().isVisible()) {
                    vHomepage.getBrowsePanel().setVisible(false);
                    vHomepage.getEditPanel().setVisible(true);
                }
            }
            if (me.getSource() == vHomepage.getPuQues_export()) {
                vHomepage.getEditTabbedPane().setSelectedIndex(3);
                if (!vHomepage.getEditPanel().isVisible()) {
                    vHomepage.getBrowsePanel().setVisible(false);
                    vHomepage.getEditPanel().setVisible(true);
                }
            }
        };
        public void mouseReleased(MouseEvent me) {};
    }
}
