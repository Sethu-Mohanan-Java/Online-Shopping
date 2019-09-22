package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}

