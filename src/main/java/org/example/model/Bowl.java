package org.example.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Bowl {
    @Id @GeneratedValue
    private Long id;
    private String name;
    /*@OneToOne(mappedBy = "bowl")
    private Cat cat;*/
    @OneToMany(mappedBy = "bowl", cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    private List<Cat> cat;


    public Bowl() {
    }

    public Bowl(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bowl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cat=" + cat +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cat> getCat() {
        return cat;
    }

    public void setCat(List<Cat> cat) {
        this.cat = cat;
    }
}
