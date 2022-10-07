package com.javainspires.springboot.example.repository;

import com.javainspires.springboot.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
