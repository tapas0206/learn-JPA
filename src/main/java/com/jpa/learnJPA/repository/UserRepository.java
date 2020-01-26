package com.jpa.learnJPA.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.jpa.learnJPA.dao.UserDAO;

@Repository
@Transactional
public class UserRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(UserDAO users) {
		entityManager.persist(users);
		return users.getId();
	}

}
