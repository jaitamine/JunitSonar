package com.inti.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.formation.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	
}
