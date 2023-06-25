import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class hmm {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile(System.getProperty("user.dir") + "\\HUST_20222_OOP_BTL\\src\\Data\\questionSource.txt", "rw");

            String str = raf.readLine(); 
            int v = raf.readInt();
            System.out.println(v);
            raf.seek(raf.getFilePointer() - 3 - 2);
            raf.writeInt(123456678);

            raf.close();
        } catch (Exception e) {
            System.out.println("Exception!");
        }
    }
}
