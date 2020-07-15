package com.codegym.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Blog {
    @Id
    public int id;
    public String text;

    public Blog(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public Blog() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}
