package model;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private Integer categoryID;
    private String name;
    private String text;
    private String questionImage;
    private float mark;
    private List<String> choice;
    private List<String> choiceImage;
    private List<Float> answer;
    private int level;

    public Question() {
        categoryID = -1;
        name = "";
        text = "";
        questionImage = "";
        level = 0;
        mark = 1;
        choice = new ArrayList<String>();
        choiceImage = new ArrayList<String>();
        answer = new ArrayList<Float>();
    }
    public Question(Integer _categoryID, String _name, String _text, String _questionImage, float _mark) {
        categoryID = _categoryID;
        name = _name;
        text = _text;
        questionImage = _questionImage;
        mark = _mark;
    }

    //Getter
    public Integer getCategory() {return categoryID;}
    public String getName() {return name;}
    public String getText() {return text;}
    public String getQuestionImage() {return questionImage;}
    public float getMark() {return mark;}
    public List<String> getChoice() {return choice;}
    public List<String> getChoiceImage() {return choiceImage;}
    public List<Float> getAnswer() {return answer;}
    public int getLevel() {return level;}

    //Setter
    public void setCategory(Integer _categoryID) {categoryID = _categoryID;}
    public void setName(String _name) {name = _name;}
    public void setText(String _text) {text = _text;}
    public void setQuestionImage(String _questionImage) {questionImage = _questionImage;}
    public void setMark(float _mark) {mark = _mark;}
    public void setChoice(List<String> _choice) {choice = _choice;}
    public void setChoiceImage(List<String> _choiceImage) {choiceImage = _choiceImage;}
    public void setChoiceImage(String _choiceImageAt, int index) {choiceImage.set(index, _choiceImageAt);}
    public void setAnswer(List<Float> _answer) {answer = _answer;}
    public void setLevel(int _level) {level = _level;}

    public void display() {
        System.out.println(categoryID + " " + name + " " + text + " " + mark + " " + choice.toString() + " " + answer.toString() + " " + level);
    }
}
