package com.returnorder.managment.authorizationservice.repository;

import com.returnorder.managment.authorizationservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User,Long> {

    Optional<User> findByUsername(String username);

    boolean existsUserByUsername(String username);

    boolean existsUserByEmail(String email);

    @Query(value = "SELECT password  FROM USER where username = ?1",nativeQuery = true)
    String findPasswordByUsername(String username);
}
