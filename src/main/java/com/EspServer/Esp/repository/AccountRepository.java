package com.EspServer.Esp.repository;

import com.EspServer.Esp.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccountRepository extends JpaRepository<Account, UUID> {
    public Account findAccountByAccountName(String username);
}
