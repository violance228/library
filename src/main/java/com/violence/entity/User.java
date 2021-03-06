package com.violence.entity;

import com.violence.repository.UserRepositoryImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class User implements DomainObject<User> {
    private Long id;
    private String login;
    private String name;
    private String surname;
    private String password;
    private String email;
    private String phone;
    private Book ats;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Book getAts() {
        return ats;
    }

    public void setAts(Book ats) {
        this.ats = ats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password) &&
                Objects.equals(email, user.email) &&
                Objects.equals(phone, user.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, email, phone);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public User getObject(ResultSet resultSet) throws SQLException {
        User user = new User();

        user.setId(resultSet.getLong("goods_id"));
        user.setName(resultSet.getString("name"));
        user.setLogin(resultSet.getString("registration_code"));
        user.setPassword(resultSet.getString("bar_code"));
        user.setEmail(resultSet.getString("contact_manager"));
        user.setPhone(resultSet.getString("morion_code"));
        user.setAts(new UserRepositoryImpl().getByIdd(resultSet.getLong("ats")));
        return user;
    }
}
