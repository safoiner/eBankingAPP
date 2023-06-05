package com.memety.ma.demo.repositories;

import com.memety.ma.demo.entities.AccountOperations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository<AccountOperations,Long> {
}
