package com.meradevs.msvc_users.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meradevs.msvc_users.models.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
