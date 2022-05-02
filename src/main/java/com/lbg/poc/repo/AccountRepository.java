package com.lbg.poc.repo;

import com.lbg.poc.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Accounts,String> {
    Accounts findByUsername(String username);
}
