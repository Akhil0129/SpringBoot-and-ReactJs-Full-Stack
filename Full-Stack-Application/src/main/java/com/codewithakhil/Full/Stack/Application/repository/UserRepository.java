package com.codewithakhil.Full.Stack.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithakhil.Full.Stack.Application.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
