package com.memety.ma.demo.repositories;

import com.memety.ma.demo.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customer,Long> {
}
