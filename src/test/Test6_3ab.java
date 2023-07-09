/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;


import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import model.Question;

import view.GUI6_3ab;

public class Test6_3ab {
    public static void main(String[] args) {
        
        
        
        
        // Tạo đối tượng JFrame hoặc JPanel
        GUI6_3ab panel = new GUI6_3ab();
//        panel.setContentPane(new JScrollPane(panel));
        // Cài đặt các thuộc tính của cửa sổ
        JFrame frame = new JFrame("My App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel); // Thêm panel vào cửa sổ

        // Hiển thị cửa sổ
        frame.pack();
        frame.setVisible(true);
    }
}
