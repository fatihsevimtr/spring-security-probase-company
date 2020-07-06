package com.probase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.probase.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);
}
