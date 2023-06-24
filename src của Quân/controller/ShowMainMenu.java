
package controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import view.GUI_2_TabbedPaneMenu;

/**
 *
 * @author anhqu
 */

// Sự kiện hiện menu chính khi chọn Popup Menu
public class ShowMainMenu {

    private JPanel root;

    public ShowMainMenu(JPanel jpnRoot) {
        this.root = jpnRoot;
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
                    node = new GUI_2_TabbedPaneMenu();
                    node.getTabbedPaneMenu().setSelectedIndex(0);
                    break;
                case "Catagories":
                    node = new GUI_2_TabbedPaneMenu();
                    node.getTabbedPaneMenu().setSelectedIndex(1);
                    break;
                case "Import":
                    node = new GUI_2_TabbedPaneMenu();
                    node.getTabbedPaneMenu().setSelectedIndex(2);
                    break;
                case "Export":
                    node = new GUI_2_TabbedPaneMenu();
                    node.getTabbedPaneMenu().setSelectedIndex(3);
                    break;
                default:
                    node = new GUI_2_TabbedPaneMenu();
                    node.getTabbedPaneMenu().setSelectedIndex(0);
                    break;
            }
            node.setSize(1035, 521);
            node.setLocation(0, 0);
            root.removeAll();
            root.add(node, BorderLayout.CENTER);
            root.validate();
            root.repaint();
        }
    }

}
