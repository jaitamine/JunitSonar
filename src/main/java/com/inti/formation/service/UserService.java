package com.inti.formation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.entity.User;
import com.inti.formation.repository.UserRepository;

@Service
public class UserService implements IUserService{

	@Autowired
	UserRepository userRepo;
	@Override
	public User add(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public void delete(int id) {
		userRepo.deleteById(id);;		
	}

	@Override
	public User getOne(int id) {
		// TODO Auto-generated method stub
		return userRepo.getOne(id);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

}
