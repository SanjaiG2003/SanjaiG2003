package database;

import java.util.ArrayList;

// data model to represent dat from question table
public class Question {
    private int questionId;
    private int categoryId;
    private String questionText;

    private ArrayList<Answer> answers;


    public int getCategoryId() {
        return categoryId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;
    }
    public Question(int categoryId, int questionId, String questionText) {
        this.categoryId = categoryId;
        this.questionId = questionId;
        this.questionText = questionText;
    }
}