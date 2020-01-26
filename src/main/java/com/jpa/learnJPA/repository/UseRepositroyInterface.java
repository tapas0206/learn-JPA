package com.jpa.learnJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.learnJPA.dao.UserDAO;

public interface UseRepositroyInterface extends JpaRepository<UserDAO, Long> {

}
