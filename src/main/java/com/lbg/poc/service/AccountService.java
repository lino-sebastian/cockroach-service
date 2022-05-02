package com.lbg.poc.service;

import com.lbg.poc.model.Accounts;
import com.lbg.poc.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Accounts> findAllAccounts() {
        return accountRepository.findAll();
    }

    public Accounts findAccount(String username) {
        return accountRepository.findByUsername(username);
    }

    public String saveAccount(Accounts accounts){
        accountRepository.save(accounts);
        return "Account saved";
    }

    public String saveAllAccounts(List<Accounts> accountsList){
        accountRepository.saveAll(accountsList);
        return "Accounts saved";
    }

    public String deleteAllAccount(){
        accountRepository.deleteAll();
        return "Clean Slate executed";
    }
}
