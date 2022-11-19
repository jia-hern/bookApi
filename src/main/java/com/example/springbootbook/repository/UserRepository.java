package com.example.springbootbook.repository;

import com.example.springbootbook.model.Role;
import com.example.springbootbook.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>
{
    //findBy + fieldName
    Optional<User> findByName(String name);

    @Modifying
    @Query("update User set role = :role where name = :name")
    void updateUserRole(@Param("name") String name, @Param("role") Role role);
}
