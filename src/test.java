import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import model.Category;
import model.Question;

public class test {
    public static List<Category> readCategoryList() {
        Category category;
        List<Category> _cList = new ArrayList<Category>();
        try {
            Scanner sc = new Scanner(new File(System.getProperty("user.dir") + "\\HUST_20222_OOP_BTL\\src\\Data\\categorySource.txt"), "UTF-8");
            while (sc.hasNextLine()) {
                if (sc.nextLine() == "") {
                    category = new Category(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
                    _cList.add(category);
                }
            }
            sc.close();

            return _cList;
        } catch (Exception e) {}

        return _cList;
    }
    public static void writeCategoryList(List<Category> _cList) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(System.getProperty("user.dir") + "\\HUST_20222_OOP_BTL\\src\\Data\\categorySource.txt"), StandardCharsets.UTF_8)) {
            for (int i = 0; i < _cList.size(); i++) {
                writer.write('\n');
                writer.write(_cList.get(i).getParent() + '\n');
                writer.write(_cList.get(i).getName() + '\n');
                writer.write(_cList.get(i).getInfo() + '\n');
                writer.write(_cList.get(i).getId().toString() + '\n');
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
    public static List<Category> addCategory(List<Category> _cList) {
        Category category = new Category();
        Scanner sc = new Scanner(System.in, "UTF-8");

        System.out.println("\tNhập dữ liệu:");
        System.out.print("\tParent: "); category.setParent(sc.nextLine());
        System.out.print("\tName: "); category.setName(sc.nextLine());
        System.out.print("\tInfo: "); category.setInfo(sc.nextLine());
        System.out.print("\tID: "); category.setId(sc.nextInt());

        _cList.add(category);

        return _cList;
    }

    public static List<Question> readQuestionList(Integer _categoryId) {
        Question question;
        List<Question> _qList = new ArrayList<Question>();
        try {
            Scanner sc = new Scanner(new File(System.getProperty("user.dir") + "\\HUST_20222_OOP_BTL\\src\\Data\\questionSource.txt"), "UTF-8");
            String str;

            while (sc.hasNextLine()) {
                if (sc.nextLine() == "") {
                    List<String> _choice = new ArrayList<String>();
                    List<Float> _answer = new ArrayList<Float>();

                    question = new Question(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
                    //Read choice
                    str = sc.nextLine();
                    while (str.charAt(0) <= 90 && str.charAt(0) >= 65) {
                        _choice.add(str);
                        str = sc.nextLine();
                    }
                    question.setChoice(_choice);
                    //Read answer point percent
                    for (int i = 0; i < _choice.size(); i++) {
                        _answer.add(Float.parseFloat(str));
                        str = sc.nextLine();
                    }
                    question.setAnswer(_answer);
                    //Read level
                    question.setLevel(Integer.parseInt(str));

                    if (question.getLevel() == _categoryId) _qList.add(question);
                }
            }
            sc.close();

            return _qList;
        } catch (InputMismatchException e) {
            System.err.println("File not found!");
        } catch (FileNotFoundException e) {
            System.err.println("Filllll not found");
        }

        return _qList;
    }
    public static void writeQuestionList(Question _question) {
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(System.getProperty("user.dir") + "\\HUST_20222_OOP_BTL\\src\\Data\\questionSource.txt", true), "UTF-8"));
            writer.write("\n");
            writer.write(_question.getCategory().toString() + "\n");
            writer.write(_question.getName() + '\n');
            writer.write(_question.getText() + '\n');
            writer.write(_question.getMark() + "\n");
            for (int i = 0; i < _question.getChoice().size(); i++) {
                writer.write(_question.getChoice().get(i) + '\n');
            }
            for (int i = 0; i < _question.getAnswer().size(); i++) {
                writer.write(_question.getAnswer().get(i) + "\n");
            }
            writer.write(_question.getLevel() + "\n");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Question addQuestion() {
        List<String> _choice = new ArrayList<String>();
        List<Float> _answer = new ArrayList<Float>();
        Question _question = new Question();
        Scanner sc = new Scanner(System.in, "UTF-8");
        String str;

        System.out.println("\tNhập dữ liệu:");
        System.out.print("\tCategory ID: "); _question.setCategory(Integer.parseInt(sc.nextLine()));
        System.out.print("\tName: "); _question.setName(sc.nextLine());
        System.out.print("\tInfo: "); _question.setText(sc.nextLine());
        System.out.print("\tMark: "); _question.setMark(Float.parseFloat(sc.nextLine()));
        System.out.println("\tChoice - Press nothing to end: ");
        while (true) {
            str = sc.nextLine();
            if (str == "") break;
            if (str.charAt(0) < 65 && str.charAt(0) > 97 && str.charAt(1) != '.') System.out.print("\t\tSai định dạng, nhập lại:");
            else _choice.add(str);
        }
        _question.setChoice(_choice);
        System.out.println("\tNhập trọng số điểm cho lựa chọn:");
        for (int i = 0; i < _choice.size(); i++) {
            _answer.add(Float.parseFloat(sc.nextLine()));
        }
        _question.setAnswer(_answer);
        System.out.print("\tLevel: "); _question.setLevel(Integer.parseInt(sc.nextLine()));

        return _question;
    }

    public static void displayCategories(List<Category> cList) {
        for (int i = 0; i < cList.size(); i++) {
            System.out.println("Parent: " + cList.get(i).getParent());
            System.out.println("Name: " + cList.get(i).getName());
            System.out.println("Info: " + cList.get(i).getInfo());
            System.out.println("ID: " + cList.get(i).getId());
        }
    }
    public static void displayQuestions(List<Question> qList) {
        for (int i = 0; i < qList.size(); i++) {
            List<String> _choice = qList.get(i).getChoice();
            List<Float> _answer = qList.get(i).getAnswer();

            System.out.println("Category ID: " + qList.get(i).getCategory());
            System.out.println("Name: " + qList.get(i).getName());
            System.out.println("Text: " + qList.get(i).getText());
            System.out.println("Mark: " + qList.get(i).getMark());
            for (int j = 0; j < _choice.size(); j++) {
                System.out.println(_choice.get(j) + _answer.get(j));
            }
            System.out.println("Level: " + qList.get(i).getLevel());
        }
    }

    public static void main(String[] args) {
        List <Category> cList = readCategoryList();
        List <Question> qList;
        int choice = -1;
        Scanner sc = new Scanner(System.in, "UTF-8");

        while (choice != 0) {
            System.out.println("1. Hiển thị danh sách Category\n2. Hiển thị danh sách câu hỏi thuộc một Category\n3. Thêm câu hỏi\n4. Thêm Category");
            System.out.print("Lựa chọn của bạn: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 0: break;
                case 1: displayCategories(cList); break;
                case 2:
                    System.out.print("Nhập mã Category: "); qList = readQuestionList(sc.nextInt());
                    displayQuestions(qList);
                    break;
                case 3:
                    writeQuestionList(new Question());
                    break;
                case 4: addCategory(cList); break;
                default:
            }
        }

        writeCategoryList(cList);

        sc.close();
    }
}
