package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.model.User;

@Repository // yazmasak da uygulama ayağa kalkacaktır
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsUserByUsername(String username);

}
