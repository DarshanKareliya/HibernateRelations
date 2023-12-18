package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Book book1= new Book();
        Book book2= new Book();
        Book book3=new Book();

        Author author1= new Author();
        Author author2= new Author();
        Author author3= new Author();

        book1.setBookId(1);
        book1.setBookName("EASY JAVA");
        book1.setPrice(250);

        book2.setBookId(2);
        book2.setBookName("EASY HIBERNATE");
        book2.setPrice(500);

        book3.setBookId(3);
        book3.setBookName("ESAY SPRINGBOOT");
        book3.setPrice(300);

        author1.setAuthorId(1);
        author1.setAuthorName("C.K.Reddy");

        author2.setAuthorId(2);
        author2.setAuthorName("J.K.William");

        author3.setAuthorId(3);
        author3.setAuthorName("B.B.Swamy");

        List<Author> book1Authors =new ArrayList<>();
        book1Authors.add(author1);
        book1Authors.add(author3);

        List<Author> book2Authors =new ArrayList<>();
        book2Authors.add(author2);
        book2Authors.add(author1);

        List<Author> book3Authors =new ArrayList<>();
        book3Authors.add(author2);
        book3Authors.add(author3);

        List<Book> author1Books=new ArrayList<>();
        author1Books.add(book1);
        author1Books.add(book2);

        List<Book> author2Books=new ArrayList<>();
        author2Books.add(book2);
        author2Books.add(book3);

        List<Book> author3Books=new ArrayList<>();
        author3Books.add(book1);
        author3Books.add(book3);


        book1.setAuthors(book1Authors);
        book2.setAuthors(book2Authors);
        book3.setAuthors(book3Authors);

        author1.setBooks(author1Books);
        author2.setBooks(author2Books);
        author3.setBooks(author3Books);


        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();

        session.save(book1);
        session.save(book2);
        session.save(book3);
        session.save(author1);
        session.save(author2);
        session.save(author3);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}
