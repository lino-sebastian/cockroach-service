package com.lbg.poc.controller;

import com.lbg.poc.model.Accounts;
import com.lbg.poc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class APIController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/listAll")
    public List<Accounts> findAllAccounts() {
        return accountService.findAllAccounts();
    }

    @GetMapping("/account/{username}")
    public Accounts findAccount(@PathVariable String username) {
        return accountService.findAccount(username);
    }

    @GetMapping("/")
    public String init() {
        return "Happy Coding...";
    }

    @DeleteMapping("/clean-slate")
    public String deleteAllAccounts() {
        return accountService.deleteAllAccount();
    }

    @PostMapping("/save")
    public String saveAccount(@RequestBody Accounts accounts) {
        return accountService.saveAccount(accounts);
    }

    @PostMapping("/saveAll")
    public String saveAllAccounts(@RequestBody List<Accounts> accountsList) {
        return accountService.saveAllAccounts(accountsList);
    }
}
