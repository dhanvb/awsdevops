package com.dhanveerit.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhanveerit.account.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
