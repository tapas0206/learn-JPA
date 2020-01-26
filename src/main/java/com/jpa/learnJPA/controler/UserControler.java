package com.jpa.learnJPA.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.learnJPA.dao.UserDAO;
import com.jpa.learnJPA.repository.UserRepository;

@RestController
public class UserControler {
	
	@Autowired
	private UserRepository userRepo;
	
	
	@GetMapping("/TestJpaApi")
	private UserDAO fetchUserId() {
		
		UserDAO userDao=new UserDAO();
		userDao.setName("Tapas");
		userDao.setAddress("Dubai");
		long id =userRepo.insert(userDao);
		
		userDao.setId(id);
		return userDao;
	}


}
