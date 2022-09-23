package com.example.SHHHH_Quiz_Game;

import javax.persistence.*;

@Entity
@Table(name = "Questions")
public class Question {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "QUIZ_QUESTION")
    private String quiz;
    private String answerW1;
    private String answerW2;
    private String answerW3;
    private String answerC;

    public Question (){

    }
    public Question(Long id, String quiz, String answerW1, String answerW2, String answerW3, String answerC) {
        this.quiz = quiz;
        this.answerW1 = answerW1;
        this.answerW2 = answerW2;
        this.answerW3 = answerW3;
        this.answerC = answerC;
        this.id = id;
    }

    public Long getId() { return id; }
    public String getQuiz() {
        return quiz;
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
