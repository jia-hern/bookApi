package com.example.springbootbook.repository;

import com.example.springbootbook.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

// use UserRepository for notes
public interface BookRepository extends JpaRepository<Book, String> {
    @Query("select "+
            "b.isbn as isbn, b.title as title, b.year as year, " +
            "b.price as price, b.genre as genre, b.year as year, " +
            "a.name as name "+
            "from User a left join Book b on b.authors = a.name "+
            "where a.name = :name")
    List<Book> findAllByAuthorName(@Param("name") String name);
    @Query("select "+
            "b.isbn as isbn, b.title as title, b.year as year, " +
            "b.price as price, b.genre as genre, b.year as year, " +
            "a.name as name "+
            "from User a left join Book b on b.authors = a.name "+
            "where b.title = :title")
    List<Book> findAllByTitle(String title);

}
