package com.arjun.h2.h2db.dao;

import com.arjun.h2.h2db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
}
