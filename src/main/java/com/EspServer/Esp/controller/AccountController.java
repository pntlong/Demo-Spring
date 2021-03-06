package com.EspServer.Esp.controller;

import com.EspServer.Esp.domain.AccountDTO;
import com.EspServer.Esp.entities.Account;
import com.EspServer.Esp.repository.AccountRepository;
import com.EspServer.Esp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/api/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @Autowired
    private AccountRepository accountRepository;

    @PostMapping("create-account")
    public void addAccount(@RequestBody AccountDTO accountDTO) {
        accountService.createAccount(accountDTO);
    }

    @PutMapping("update-account")
    public void updateAccount(@RequestBody AccountDTO accountDTO){
        accountService.updateAccount(accountDTO.getAccountName(),accountDTO);
    }

    @DeleteMapping("delete-account/{accountName}")
    public void deleteAccount(@PathVariable("accountName") String accountName){
        accountService.deleteAccount(accountName);
    }
}
