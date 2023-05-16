package com.jsp.PWAPP.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.PWAPP.dto.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

}
