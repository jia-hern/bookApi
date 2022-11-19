package com.example.springbootbook.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

// refer to User.java for annotation explanations
@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String isbn;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "book")
//    private Set<User> authors;
    @Column(name = "authors", unique = true, length = 100)
    private String authors;

    @Column(name="year", nullable = false, length = 4)
    private Integer year;

    @Column(name="price", nullable = false, length = 100)
    private Double price;

    @Column(name="genre", nullable = false, length = 100)
    private String genre;

}