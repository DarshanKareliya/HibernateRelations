package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;



public class App 
{
    public static void main( String[] args )
    {
       /* System.out.println( "Hello World!" );

        Cart cart1=new Cart();

        Item item1= new Item(1,"pencil",5,10,cart1);
        Item item2= new Item(2,"banana",4,20,cart1);
        Item item3= new Item(3,"orange",2,40,cart1);
        Item item4= new Item(4,"shampoo",1,85,cart1);

        List<Item> itemsForCart1=new ArrayList<Item>();
        itemsForCart1.add(item1);
        itemsForCart1.add(item2);
        itemsForCart1.add(item3);
        itemsForCart1.add(item4);
        cart1.setCartId(1);
        cart1.setItems(itemsForCart1);
        cart1.setTotal(165);

        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();

        session.save(cart1);
        //session.save(item1);
        //session.save(item2);
        //session.save(item3);
        //session.save(item4);
        Cart cart2=session.get(Cart.class,2);
        System.out.println(cart2.getItems());

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();*/
    }
}
