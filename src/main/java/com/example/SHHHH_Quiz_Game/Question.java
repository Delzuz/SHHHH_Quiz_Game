package com.example.SHHHH_Quiz_Game;

public class Question {
    public Question(String question, String answerW1, String answerW2, String answerW3, String answerC) {
        this.question = question;
        this.answerW1 = answerW1;
        this.answerW2 = answerW2;
        this.answerW3 = answerW3;
        this.answerC = answerC;
    }
    private String question;
    private String answerW1;
    private String answerW2;
    private String answerW3;
    private String answerC;

    public String getQuestion() {
        return question;
    }

    public String getAnswerW1() {
        return answerW1;
    }

    public String getAnswerW2() {
        return answerW2;
    }

    public String getAnswerW3() {
        return answerW3;
    }

    public String getAnswerC() {
        return answerC;
    }
}
