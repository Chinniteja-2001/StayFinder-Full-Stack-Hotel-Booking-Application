package com.stayfinderWebsite.repository;

import com.stayfinderWebsite.model.Usersubject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Usersubject,Long> {
    boolean existsByEmail(String email);

    void deleteByEmail(String email);

    Optional<Usersubject> findByEmail(String email);
}
