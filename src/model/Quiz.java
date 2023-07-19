
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anhqu
 */
public class Quiz {
    private String name;
    private int timeLimit;
    private List<Question> questions;

    public Quiz() {
        name = "";
        timeLimit = 0;
        questions = new ArrayList<Question>();
    }
    public Quiz(String name, int timeLimit) {
        this.name = name;
        this.timeLimit = timeLimit;
        questions = new ArrayList<Question>();
    }
    public Quiz(String name, int timeLimit, List<Question> questions) {
        this(name, timeLimit);
        this.questions = questions;
    }

    public String getName() {
        return name;
    }
    public int getTimeLimit() {
        return timeLimit;
    }
    public List<Question> getQuestions() {
        return questions;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }    
}
