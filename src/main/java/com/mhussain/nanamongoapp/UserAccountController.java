package com.mhussain.nanamongoapp;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/resources/user-accounts")
@RequiredArgsConstructor
public class UserAccountController {

    private final UserAccountRepository userAccountRepository;

    @GetMapping
    List<UserAccount> userAccounts() {
        return userAccountRepository.findAll();
    }

}