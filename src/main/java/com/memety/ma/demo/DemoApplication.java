package com.memety.ma.demo;

import com.memety.ma.demo.entities.CurrentAccount;
import com.memety.ma.demo.entities.Customer;
import com.memety.ma.demo.entities.SavingAccount;
import com.memety.ma.demo.enums.AccountStatus;
import com.memety.ma.demo.repositories.AccountOperationRepository;
import com.memety.ma.demo.repositories.BankAccountRepository;
import com.memety.ma.demo.repositories.CustomersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);



    }

    @Bean

    CommandLineRunner start(CustomersRepository customersRepository,
                            BankAccountRepository bankAccountRepository,
                            AccountOperationRepository accountOperationRepository){
        return args -> {
            Stream.of("Hassan");
            Customer customer=new Customer();
            String name;
            customer.setName(name);
            customer.setEmail(name+"@gmail.com");
            customersRepository.save(customer);

        };

        customersRepository.findAll().forEach(cust->{
            CurrentAccount currentAccount =new CurrentAccount();
            currentAccount.setBalance(Math.random()*9000);
            currentAccount.setCreatedAt(new Date());
            currentAccount.setStatus(AccountStatus.CREATED);
            currentAccount.setCustomer(cust);
            currentAccount.setOverDraft(90080);
            bankAccountRepository.save(currentAccount);


            SavingAccount savingAccount =new SavingAccount();
            savingAccount.setBalance(Math.random()*9000);
            savingAccount.setCreatedAt(new Date());
            savingAccount.setCustomer(cust);
            savingAccount.setInterestRate(5.5);
            bankAccountRepository.save(savingAccount);



        });
    }

}
