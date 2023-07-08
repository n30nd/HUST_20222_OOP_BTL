/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

/**
 *
 * @author Vu Quang Nam
 */
public class Xuatnhapcategoryquestion {
    public static List<Category> readCategoryList() {
        Category category;
        List<Category> _cList = new ArrayList<Category>();
        try {
            Scanner sc = new Scanner(new File(System.getProperty("user.dir") + "\\src\\Data\\categorySource.txt"), "UTF-8");
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
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(System.getProperty("user.dir") + "\\src\\Data\\categorySource.txt"), StandardCharsets.UTF_8)) {
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
            Scanner sc = new Scanner(new File(System.getProperty("user.dir") + "\\src\\Data\\questionSource.txt"), "UTF-8");
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

                    if (question.getLevel() == _categoryId) {
                        _qList.add(question);
                    }
                }
            }
            sc.close();

            return _qList;
        } catch (InputMismatchException e) {
            System.err.println("Mismatch exception!");
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }

        return _qList;
    }
    public static void writeQuestion(Question _question) {
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(System.getProperty("user.dir") + "\\src\\Data\\questionSource.txt", true), "UTF-8"));
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
