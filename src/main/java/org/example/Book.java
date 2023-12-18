package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int bookId;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "book_price")
    private int price;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "MToMTable",
            joinColumns={@JoinColumn(name="book_id")},
            inverseJoinColumns={@JoinColumn(name="author_id")})  // in @JoinTable name = name of join table
                                                                 // joincolumns = name of column of this object (Book)
                                                                 // inverseJoin column = name of column in join table of other table (author)
    private List<Author> authors;

    public Book() {
    }

    public Book(int bookId, String bookName, int price, List<Author> authors) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.authors = authors;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
