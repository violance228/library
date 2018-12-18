package com.violence.entity;

import java.util.Objects;
import java.util.Set;

public class Book {
    private Long id;
    private String name;
    private Integer size;
    private String lang;
    private Boolean isUse;
    private Set<Author> authors;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) &&
                Objects.equals(size, book.size) &&
                Objects.equals(lang, book.lang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, lang);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", lang='" + lang + '\'' +
                '}';
    }
}