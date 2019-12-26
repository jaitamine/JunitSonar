package com.inti.formation.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.entity.User;
import com.inti.formation.service.IUserService;
import com.inti.formation.service.UserService;

@RestController
@RequestMapping("/userApi")
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/add", method= RequestMethod.PUT)
	public  User add(@RequestBody User user) {

		User us = userService.add(user);
		return us;
	}

	@RequestMapping(value = "/delete/{id}", method= RequestMethod.DELETE)
	public  void delete(@PathVariable  int id) {

		userService.delete(id);

	}


	@RequestMapping(value = "/getOne/{id}", method= RequestMethod.GET)
	public  User getOneUser(@PathVariable int id) {

		User us = userService.getOne(id);

		return us;
	}

	@RequestMapping(value = "/getAll", method= RequestMethod.GET)
	public  List<User>  getAll() {

		List<User> users= userService.getAll();

		return users;
	}
}
