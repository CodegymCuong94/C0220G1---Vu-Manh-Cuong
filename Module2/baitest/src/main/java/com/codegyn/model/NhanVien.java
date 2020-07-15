package com.codegyn.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NhanVien implements Validator {
    @Id
    private Integer id;
    private String group;
    private String name;
    private String date;
    private String sex;
    private String phone;
    private String idCard;
    private String email;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public NhanVien() {
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        NhanVien nhanVien = (NhanVien) target;
        String phone = nhanVien.getPhone();
        if (!nhanVien.phone.matches("[0][0-9]{9}")) {
            errors.rejectValue("phone", "nhanVien.phone");

        }
        String idCard = nhanVien.getIdCard();
        if (!nhanVien.idCard.matches("[0][0-9]{9}")) {
            errors.rejectValue("idCard", "nhanVien.idCard");
        }
        String email = nhanVien.getEmail();
        if (!nhanVien.email.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")) {
            errors.rejectValue("email", "nhanVien.email");
        }
    }
}
