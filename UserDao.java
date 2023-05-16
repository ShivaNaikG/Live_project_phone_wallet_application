package com.jsp.PWAPP.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.PWAPP.dto.Login;
import com.jsp.PWAPP.dto.User;
import com.jsp.PWAPP.respository.UserRepository;

@Repository
public class UserDao {
@Autowired
UserRepository repository;
//save
public User save(User user)
{
	return repository.save(user);
	}
//getbyall
public List<User> getAllUser()
{
	return repository.findAll();
}
//getbyId
public User getByIdUser(int id)
{
	Optional<User>optional=repository.findById(id);
	if(optional.isPresent())
	{
		return optional.get();
	}
	else
	{
		return null;
	}
}
//update
public User updateUser(User user)
{
	Optional<User>optional=repository.findById(user.getId());
	if(optional.isPresent())
	{
		return repository.save(user);
	}
	else
	{
		return null;
	}
}
//delete
public User delete(int id)
{
Optional<User>optional=repository.findById(id);
if(optional.isPresent())
{
	 repository.delete(optional.get());
}
return null;
}

//login
public User validateUserlogin(Login login)
{
return repository.validateUser(login.getEmail(),login.getPassword());	
}
}
