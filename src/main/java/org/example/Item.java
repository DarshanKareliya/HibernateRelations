package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private int itemId;
    @Column(name = "item_name")
    private String name;
    @Column(name = "qty")
    private int quanitity;
    @Column(name = "price")
    private int price;


    @ManyToOne()
    //@JoinColumn(name = "cart_id")
    private Cart cart;

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", name='" + name + '\'' +
                ", quanitity=" + quanitity +
                ", price=" + price +
                ", cart=" + cart +
                '}';
    }

    public Item() {
    }

    public Item(int itemId, String name, int quanitity, int price, Cart cart) {
        this.itemId = itemId;
        this.name = name;
        this.quanitity = quanitity;
        this.price = price;
        this.cart = cart;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuanitity() {
        return quanitity;
    }

    public void setQuanitity(int quanitity) {
        this.quanitity = quanitity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
