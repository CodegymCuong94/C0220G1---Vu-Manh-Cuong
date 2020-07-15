package com.codegym.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
public class Book implements Validator{
    @Id

    private Integer id;


    private String name;


    private String  author;


    private Float price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Book(Integer id, String name, String author, Float price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book() {
    }


    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Book book = (Book) target;
        if (!book.name.matches("[A-Za-z0-9]{1,30}")) {
            errors.rejectValue("name", "book.name");
        }
        if (!book.author.matches("[A-Za-z0-9]{1,30}")) {
            errors.rejectValue("author", "book.author");
        }

    }
}
