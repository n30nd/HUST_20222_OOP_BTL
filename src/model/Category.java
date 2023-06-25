package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Category {
    private String parent;
    private String name;
    private String info;
    private Integer id;
    private int numOfQuestions;

    public Category() {};
    public Category(String _parent, String _name, String _info, Integer _id) {
        parent = _parent;
        name = _name;
        info = _info;
        id = _id;
    }

    //Getter
    public String getParent() {return parent;}
    public String getName() {return name;}
    public String getInfo() {return info;}
    public Integer getId() {return id;}
    public int getNumOfQuestions() {return numOfQuestions;}

    public void setParent(String _parent) {parent = _parent;}
    public void setName(String _name) {name = _name;}
    public void setInfo(String _info) {info = _info;}
    public void setId(Integer _id) {id = _id;}
}
