package com.sunbeam.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sunbeam.custom_exceptions.AuthenticationException;
import com.sunbeam.dao.UserDao;
import com.sunbeam.entities.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	@Override
	public User authenticateUser(String email, String password) {
		return dao.findByEmailAndPassword(email, password)
				.orElseThrow(() -> new AuthenticationException("Invalid Email or Password !!!!!"));
	}

}
