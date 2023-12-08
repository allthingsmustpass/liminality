package com.project.liminality.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.liminality.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query("SELECT i FROM User where i.id = :id")
    public User findbyId(@Param("id") String id);

}
