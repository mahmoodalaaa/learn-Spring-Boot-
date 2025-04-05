package com.example.Jba.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.Jba.models.Author;

import jakarta.transaction.Transactional;

public interface AuthorRepository extends JpaRepository<Author,Integer>{

   List<Author> findByAge(int age);
    int countByAge(int age);
    // select * from author where ferst_name = fn;
    List<Author> findAllByFerstName (String fn);
    List<Author> findAllByFerstNameIgnoreCase (String fn);
    // select * from author where ferst_name like %fn%
    List<Author> findAllByFerstNameContainingIgnoreCase (String fn);
    // select * from author where ferst_name like fn%
    List<Author> findAllByFerstNameStartsWithIgnoreCase (String fn);

    @Modifying
    @Transactional
    @Query("UPDATE Author a SET a.age = :age WHERE a.id = :id")
    void UpdateAuthor(int age, int id);

    @Modifying
    @Transactional
    @Query("DELETE FROM Author a WHERE a.id = :id")
    void deleteAuthor(int id);
}
