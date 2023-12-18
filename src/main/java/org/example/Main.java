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
        Book book4= new Book();
        Book book5= new Book();

        Author author1= new Author();
        Author author2= new Author();
        Author author3= new Author();
        Author author4= new Author();
        Author author5=new Author();

        book1.setBookId(1);
        book1.setBookName("EASY JAVA");
        book1.setPrice(250);

        book2.setBookId(2);
        book2.setBookName("EASY HIBERNATE");
        book2.setPrice(500);

        book3.setBookId(3);
        book3.setBookName("ESAY SPRINGBOOT");
        book3.setPrice(300);

        book4.setBookId(4);
        book4.setBookName("natural");
        book4.setPrice(300);

        book5.setBookId(5);
        book5.setBookName("unnatural");
        book5.setPrice(300);

        author1.setAuthorId(1);
        author1.setAuthorName("C.K.Reddy");

        author2.setAuthorId(2);
        author2.setAuthorName("J.K.William");

        author3.setAuthorId(3);
        author3.setAuthorName("B.B.Swamy");

        author4.setAuthorId(4);
        author4.setAuthorName("Darshan");

        author5.setAuthorId(5);
        author5.setAuthorName("Kareliya");

        List<Author> book1Authors =new ArrayList<>();
        book1Authors.add(author1);
        book1Authors.add(author3);

        List<Author> book2Authors =new ArrayList<>();
        book2Authors.add(author2);
        book2Authors.add(author1);

        List<Author> book3Authors =new ArrayList<>();
        book3Authors.add(author2);
        book3Authors.add(author3);

        List<Author> book4Authors=new ArrayList<>();
        book4Authors.add(author4);
        book4Authors.add(author5);

        List<Author> book5Authors=new ArrayList<>();
        book5Authors.add(author5);

        List<Book> author1Books=new ArrayList<>();
        author1Books.add(book1);
        author1Books.add(book2);

        List<Book> author2Books=new ArrayList<>();
        author2Books.add(book2);
        author2Books.add(book3);

        List<Book> author3Books=new ArrayList<>();
        author3Books.add(book1);
        author3Books.add(book3);

        List<Book> author4Books= new ArrayList<>();
        author4Books.add(book4);

        List<Book> author5Books= new ArrayList<>();
        author5Books.add(book4);
        author5Books.add(book5);



        book1.setAuthors(book1Authors);
        book2.setAuthors(book2Authors);
        book3.setAuthors(book3Authors);
        book4.setAuthors(book4Authors);
        book5.setAuthors(book5Authors);

        author1.setBooks(author1Books);
        author2.setBooks(author2Books);
        author3.setBooks(author3Books);
        author4.setBooks(author4Books);
        author5.setBooks(author5Books);



        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();

        /*session.save(book1);
        session.save(book2);
        session.save(book3);
        session.save(book4);
        session.save(book5);
        session.save(author1);    // if cascade is all then only write code for storing book or authors.
        session.save(author2);
        session.save(author3);
        session.save(author4);
        session.save(author5);*/

        // to delete the record
//        Author author=session.get(Author.class,5);// to delete or update a many to many entry both tables have to have cascade type at least REMOVE(ALL is for all operation.)
                                                      // it deletes the entries containing our deleted element from other table also
//        System.out.println(author.getAuthorId()+"  "+author.getAuthorName());
//        session.delete(author);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}
