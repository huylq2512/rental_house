package com.project.rental_house.service;

import com.project.rental_house.model.Account;
import com.project.rental_house.repository.AccountRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> findAll() {
        List<Account> list = accountRepository.findAll();
        if (list.isEmpty()) throw new ResourceNotFoundException("Khong co tai khoan nao");
        return list;
    }
}

