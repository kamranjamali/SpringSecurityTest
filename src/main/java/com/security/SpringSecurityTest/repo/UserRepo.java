package com.security.SpringSecurityTest.repo;

import com.security.SpringSecurityTest.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public interface UserRepo extends JpaRepository<User , UUID> {

    Optional<User> findByUsername(String username);
}
