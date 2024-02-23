package com.shareurthoughts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shareurthoughts.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmailId(String emailId);

}
