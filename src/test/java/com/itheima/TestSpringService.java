package com.itheima;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpringService {

    @Autowired
    AccountService accountService;

    @Test
    public void test() {

        List<Account> accountList = accountService.findAll();
        for (Account account : accountList) {
            System.out.println(account.getId()+"--"+account.getUsername()+"--"+account.getMoney());
        }

    }

    @Test
    public void test1() {
        accountService.deleteById(1);
    }

}
