package com.jsp.PWAPP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.PWAPP.dto.Login;
import com.jsp.PWAPP.dto.User;
import com.jsp.PWAPP.service.UserService;

@RestController
public class UserController {
@Autowired
UserService service;
//save
@PostMapping("/user")
public User saveUser(@RequestBody User user)
{
	return service.saveService(user);
}
//getall
@GetMapping("/user")
public List<User>getAllUser()
{
	return service.getAllUseService();
}
//getbyid
@GetMapping("/user/{id}")
public User getById(@PathVariable int id)
{
	return service.getByIdUserService(id);
}
//update
@PutMapping("/user")
public User UpdateUser(@RequestBody User user)
{
	return service.updateUserService(user);
}
//delete
@DeleteMapping("/user/{id}")
public User deleteUser(@PathVariable int id)
{
	return service.deleteService(id);
}
//login
@GetMapping("/user/email/password")
public User login(Login login)
{
return service.validateUserloginService(login);
	
}
}
