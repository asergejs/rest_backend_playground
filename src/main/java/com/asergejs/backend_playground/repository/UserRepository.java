package com.asergejs.backend_playground.repository;

import com.asergejs.backend_playground.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {


}
