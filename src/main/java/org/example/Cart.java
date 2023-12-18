package org.example;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private int cartId;
    @Column(name = "total")
    private int total;

   @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL)
    private List<Item> items;

    public Cart() {
    }

    public Cart(int cartId, List<Item> items, int total) {
        this.cartId = cartId;
        this.items = items;
        this.total = total;
    }


    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
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
