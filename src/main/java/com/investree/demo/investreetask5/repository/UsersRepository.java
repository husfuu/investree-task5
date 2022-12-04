package com.investree.demo.investreetask5.repository;

import com.investree.demo.investreetask5.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
