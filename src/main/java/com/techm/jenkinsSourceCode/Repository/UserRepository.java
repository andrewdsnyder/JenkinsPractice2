package com.techm.jenkinsSourceCode.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techm.jenkinsSourceCode.Models.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
