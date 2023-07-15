
package controller;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import view.GUI1_1_MainFrame;

/**
 *
 * @author anhqu
 */
public class ExamsMouseEvent implements MouseListener {

    private JLabel label;
    private GUI1_1_MainFrame mainFrame;


    public ExamsMouseEvent(JLabel label, GUI1_1_MainFrame mainFrame) {
        this.label = label;
        this.mainFrame = mainFrame;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setForeground(Color.BLACK);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setForeground(Color.red);
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
