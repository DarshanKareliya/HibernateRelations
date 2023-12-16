package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @Column(name = "answer_id")
    private int answer_id;

    @Column(name = "answer_stmt")
    private String answer_stmt;

    private Question question;

    public Answer() {
    }

    public Answer(int answer_id, String answer_stmt) {
        this.answer_id = answer_id;
        this.answer_stmt = answer_stmt;
    }

    public int getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(int answer_id) {
        this.answer_id = answer_id;
    }

    public String getAnswer_stmt() {
        return answer_stmt;
    }

    public void setAnswer_stmt(String answer_stmt) {
        this.answer_stmt = answer_stmt;
    }
}
