package org.example;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "authors")
public class Author {

    @Id
    @Column(name = "author_id")
    private int authorId;

    @Column(name = "author_name")
    private String authorName;


    @ManyToMany
    private List<Book> books;

    public Author() {
    }

    public Author(int authorId, String authorName, List<Book> books) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.books = books;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
