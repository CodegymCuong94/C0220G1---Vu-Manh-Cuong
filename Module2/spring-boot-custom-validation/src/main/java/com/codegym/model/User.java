package com.codegym.model;

import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.jws.soap.SOAPBinding;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
public class User implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    private String firstName;
    //[A-Za-z]{5,45} Có nghĩa có từ 5 tới 45 ký tự và các ký tự có giá trị từ A-Z hoặc a-z
    @Pattern(regexp = "[A-Za-z]{5,45}")
    private String lastName;
    //[0][0-9]{9] Có nghĩa là có 10 số và số đầu tiên là 0 , 9 số tiếp theo có giá trị từ 0 tới 9
    @Pattern(regexp = "[0][0-9]{9}")
    private String phone;

    @Pattern(regexp = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")
    private String email;

    @Min(18)
    private Integer age;

    public void setId(Integer id) { this.id = id; }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public User() {
    }

    public User(Integer id, String firstName, String lastName, String phone, String email, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.age = age;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        if (!user.firstName.matches("[A-Za-z]{5,45}")) {
            errors.rejectValue("firstName", "user.firstName");
        }
        if (!user.lastName.matches("[A-Za-z]{5,45}")) {
            errors.rejectValue("lastName", "user.lastName");
        }
         if (!user.phone.matches("[0][0-9]{9}")) {
            errors.rejectValue("phone", "user.phone");
        }
         if (!user.age.toString().matches("^(1[89]|[2-9]\\d)$")) {
            errors.rejectValue("age", "user.age");
        }
         if (!user.email.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")) {
            errors.rejectValue("email", "user.email");
        }
    }
}
