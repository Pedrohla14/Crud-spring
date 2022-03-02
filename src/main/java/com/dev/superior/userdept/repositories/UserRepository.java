package com.dev.superior.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.superior.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
