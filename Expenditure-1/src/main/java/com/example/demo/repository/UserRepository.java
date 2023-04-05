package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.User;
@Repository
@Transactional
public interface UserRepository extends JpaRepository<User,Long>{

	void deleteById(int id);

	Optional<User> findById(int id);

	 

	

	

}
