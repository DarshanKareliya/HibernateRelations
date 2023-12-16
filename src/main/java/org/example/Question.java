package org.example;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @Column(name = "question_id")
    private int qustion_id;

    @Column(name = "question_stmt")
    private String q_stmt;

    @OneToMany(mappedBy = "question",cascade = CascadeType.ALL)
    List<Answer> answers;

    public Question() {
    }

    public Question(int qustion_id, String q_stmt) {
        this.qustion_id = qustion_id;
        this.q_stmt = q_stmt;
    }

    public int getQustion_id() {
        return qustion_id;
    }

    public void setQustion_id(int qustion_id) {
        this.qustion_id = qustion_id;
    }

    public String getQ_stmt() {
        return q_stmt;
    }

    public void setQ_stmt(String q_stmt) {
        this.q_stmt = q_stmt;
    }
}
