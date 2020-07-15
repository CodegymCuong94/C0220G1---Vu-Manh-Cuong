package com.codegym.model;

        import org.springframework.validation.Errors;
        import org.springframework.validation.Validator;

        import javax.persistence.Entity;
        import javax.persistence.Id;

@Entity
public class Nv implements Validator {
    @Id
    private Integer id;
    private String date;
    private String group;
    private String name;
    private String sex;
    private String phone;
    private String idCard;
    private String email;
    private String address;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

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

    public Nv() {
    }

    public Nv(Integer id, String date, String group, String name, String sex, String phone, String idCard, String email, String address) {
        this.id = id;
        this.date = date;
        this.group = group;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.idCard = idCard;
        this.email = email;
        this.address = address;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        com.codegym.model.Nv nv = (com.codegym.model.Nv) target;
        String idCard= nv.getIdCard();
        if(!nv.idCard.matches("[0-9]{10}")) {
            errors.rejectValue("idCard", "nv.idCard");

        }
        if (!nv.phone.matches("[0-9]{10}")) {
            String phone = nv.getPhone();
            errors.rejectValue("phone", "nv.phone");
        }
        if (!nv.email.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")) {
            String email= nv.getEmail();
            errors.rejectValue("email", "nv.email");
        }
    }
}