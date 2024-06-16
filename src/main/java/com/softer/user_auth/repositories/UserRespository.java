package com.softer.user_auth.repositories;

import com.softer.user_auth.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<User, Long> {
    User findByEmailAndPassword(String email, String password);
}
