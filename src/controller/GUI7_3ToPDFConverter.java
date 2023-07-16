package controller;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.graphics.image.LosslessFactory;

public class GUI7_3ToPDFConverter {
    public void convertToPDF(Component component1, Component component2, String filePath) {
        try {
            // Tạo một BufferedImage cho từng thành phần giao diện
            BufferedImage image1 = new BufferedImage(component1.getWidth(), component1.getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics1 = image1.createGraphics();
            component1.printAll(graphics1);
            graphics1.dispose();

            BufferedImage image2 = new BufferedImage(component2.getWidth(), component2.getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics2 = image2.createGraphics();
            component2.printAll(graphics2);
            graphics2.dispose();

            // Tạo tài liệu PDF
            PDDocument document = new PDDocument();

            // Tạo trang thứ nhất và chèn hình ảnh của component1 vào
            PDPage page1 = new PDPage(new PDRectangle(component1.getWidth(), component1.getHeight()));
            document.addPage(page1);

            PDImageXObject pdImage1 = LosslessFactory.createFromImage(document, image1);

            PDPageContentStream contentStream1 = new PDPageContentStream(document, page1);
            contentStream1.drawImage(pdImage1, 0, 0);
            contentStream1.close();

            // Tạo trang thứ hai và chèn hình ảnh của component2 vào
            PDPage page2 = new PDPage(new PDRectangle(component2.getWidth(), component2.getHeight()));
            document.addPage(page2);

            PDImageXObject pdImage2 = LosslessFactory.createFromImage(document, image2);

            PDPageContentStream contentStream2 = new PDPageContentStream(document, page2);
            contentStream2.drawImage(pdImage2, 0, 0);
            contentStream2.close();

            document.save(filePath);
            document.close();

            JOptionPane.showMessageDialog(null, "PDF exported successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
