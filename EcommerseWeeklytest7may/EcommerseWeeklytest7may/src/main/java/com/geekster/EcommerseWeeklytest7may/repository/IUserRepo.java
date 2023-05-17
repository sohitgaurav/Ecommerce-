package com.geekster.EcommerseWeeklytest7may.repository;

import com.geekster.EcommerseWeeklytest7may.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Long> {
    User findByUserId(Long userId);
}
