package com.memety.ma.demo.repositories;

import com.memety.ma.demo.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
