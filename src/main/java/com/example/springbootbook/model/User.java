package com.example.springbootbook.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "users")//not user => because it is reserved.
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", unique = true, nullable = false, length = 100)
    private String name;

//    @Column(name = "bookIsbn", nullable = false, length = 100)
//    private String bookIsbn;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "bookIsbn", referencedColumnName = "isbn", insertable = false, updatable = false)
//    private Book book;

    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @Column(name = "birthday", nullable = false)
    private LocalDateTime birthday;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

    @Transient
    private String token;
}
