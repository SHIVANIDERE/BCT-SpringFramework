package com.blueconch.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blueconch.ecommerce.model.User;
@Repository
public interface UserRepo extends JpaRepository<User, Long> {
	Optional<User> findByMobile(String mobile);
}