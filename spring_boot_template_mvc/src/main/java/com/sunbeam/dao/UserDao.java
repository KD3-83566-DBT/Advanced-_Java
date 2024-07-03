package com.sunbeam.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.User;

//import org.apache.catalina.startup.ClassLoaderFactory.Repository;

public interface UserDao extends JpaRepository<User, Long> {
	Optional<User>findByEmailAndPassword(String email,String password);
}