package org.example;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private int cart_id;
    @Column(name = "total")
    private int total;

   @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL)
    private List<Item> items;

    public Cart() {
    }

    public Cart(int cart_id, List<Item> items, int total) {
        this.cart_id = cart_id;
        this.items = items;
        this.total = total;
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
