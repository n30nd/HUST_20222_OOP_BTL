
package model;

/**
 *
 * @author anhqu
 */
public class Quiz {
    private String name;
    private String timeLimit;

    public Quiz(String name, String timeLimit) {
        this.name = name;
        this.timeLimit = timeLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit;
    }
    
    
}
