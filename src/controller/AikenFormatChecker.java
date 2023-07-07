

package controller;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AikenFormatChecker {
    public static void main(String[] args) {
        String fileName = "src\\Data\\newQuestion.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 0;
            int questionCount = 0;
            boolean inQuestion = false;
            boolean hasAnswer = false;
            Pattern answerPattern = Pattern.compile("^ANSWER:\\s[A-Z]$");
            while ((line = br.readLine()) != null) {
                lineNumber++;
                if (line.isEmpty()) {
                    if (inQuestion && !hasAnswer) {
                        System.out.println("Error at line " + lineNumber);
                        return;
                    }
                    inQuestion = false;
                    hasAnswer = false;
                } else if (!inQuestion) {
                    inQuestion = true;
                    questionCount++;
                } else {
                    Matcher answerMatcher = answerPattern.matcher(line);
                    if (answerMatcher.matches()) {
                        hasAnswer = true;
                    } else if (!line.matches("^[A-Z]\\.\\s.+")) {
                        System.out.println("Error at line " + lineNumber);
                        return;
                    }
                }
            }
            System.out.println("Success " + questionCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
