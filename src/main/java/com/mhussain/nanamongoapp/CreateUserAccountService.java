package com.mhussain.nanamongoapp;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class CreateUserAccountService implements InitializingBean {

    private final UserAccountRepository userAccountRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        userAccountRepository.deleteAll();
        for (int i = 0; i < 100; i++) {
            var account = new UserAccount();
            account.setName("Name_" + i);
            account.setEmail("user_" + i + "@email.com");
            userAccountRepository.save(account);
        }

        log.info("Created {} user accounts.", userAccountRepository.count());
    }

}