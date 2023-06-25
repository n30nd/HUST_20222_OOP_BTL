
package controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JMenuItem;
import view.GUI1_1_MainFrame;
import view.GUI_2_TabbedPaneMenu;

/**
 *
 * @author anhqu
 */

// Sự kiện hiện menu chính khi chọn Popup Menu
public class ShowMainMenu {

    private GUI1_1_MainFrame mainFrame;

    public ShowMainMenu(GUI1_1_MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public void setEvent(List<JMenuItem> menuItems) {

        for (JMenuItem item : menuItems) {
            item.addActionListener(new ChangePanel(item));
        }
    }

    class ChangePanel implements ActionListener {

        private GUI_2_TabbedPaneMenu node;
        private JMenuItem menuItem;

        public ChangePanel(JMenuItem jMenuItem) {
            this.menuItem = jMenuItem;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String src = menuItem.getLabel();
            switch (src) {
                case "Questions":
                    node = new GUI_2_TabbedPaneMenu(mainFrame);
                    node.getTabbedPaneMenu().setSelectedIndex(0);
                    break;
                case "Catagories":
                    node = new GUI_2_TabbedPaneMenu(mainFrame);
                    node.getTabbedPaneMenu().setSelectedIndex(1);
                    break;
                case "Import":
                    node = new GUI_2_TabbedPaneMenu(mainFrame);
                    node.getTabbedPaneMenu().setSelectedIndex(2);
                    break;
                case "Export":
                    node = new GUI_2_TabbedPaneMenu(mainFrame);
                    node.getTabbedPaneMenu().setSelectedIndex(3);
                    break;
                default:
                    node = new GUI_2_TabbedPaneMenu(mainFrame);
                    node.getTabbedPaneMenu().setSelectedIndex(0);
                    break;
            }
            node.setSize(1035, 521);
            node.setLocation(0, 0);
            mainFrame.getPanel_content().removeAll();
            mainFrame.getPanel_content().add(node, BorderLayout.CENTER);
            mainFrame.validate();
            mainFrame.repaint();
        }
    }

}
