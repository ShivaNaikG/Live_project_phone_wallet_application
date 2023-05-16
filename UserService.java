package com.jsp.PWAPP.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.PWAPP.dao.UserDao;
import com.jsp.PWAPP.dto.Login;
import com.jsp.PWAPP.dto.User;
@Service
public class UserService {
@Autowired
UserDao dao;
//save
public User saveService(User user)
{
	return dao.save(user);
}
//getbyall
public List<User> getAllUseService()
{
	return dao.getAllUser();
}
//getbyId
public User getByIdUserService(int id)
{
	return dao.getByIdUser(id);
}
//update
public User updateUserService(User user)
{
	return dao.updateUser(user);
}
//delete
public User deleteService(int id)
{
	
	return dao.delete(id);
}
//login
public User validateUserloginService(Login login)
{
	return dao.validateUserlogin(login);
}
}
