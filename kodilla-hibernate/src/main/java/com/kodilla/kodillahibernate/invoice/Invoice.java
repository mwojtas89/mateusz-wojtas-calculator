package com.kodilla.kodillahibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="INVOICES")
public class Invoice {
    private int ID;
    private String number;
    private List<Item> items = new ArrayList<>();

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID")
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Column(name="NUMBER")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @OneToMany (
            targetEntity = Item.class,
            mappedBy = "invoice",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Invoice(String number) {
        this.number = number;
    }

    public Invoice() {
    }
}
