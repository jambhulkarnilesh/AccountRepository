package com.mp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mp.demo.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

}
