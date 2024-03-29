package com.sp.curd.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sp.curd.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findByName(String name);
}
