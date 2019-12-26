package com.inti.formation.service;

import java.util.List;


import com.inti.formation.entity.User;

public interface IUserService {

	public User add(User user);
	public User update(User user);
	public void delete(int id);
	public User getOne(int id);
	public List<User> getAll();

}
