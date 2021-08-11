package com.project.rental_house.controller;

import com.project.rental_house.model.Account;
import com.project.rental_house.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/account")
public class AccountController {
    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("")
    public ResponseEntity<List<Account>> findAll() {
        List<Account> list = accountService.findAll();
        return ResponseEntity.ok(list);
    }
}
