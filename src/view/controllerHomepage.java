package view;

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
                vHomepage.editingMode();
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
                vHomepage.editingMode();
            }
        };
        public void mouseReleased(MouseEvent me) {};
    }
}
