package com.itheima;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.apache.ibatis.javassist.ClassPath;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.InputStream;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMybatisDao {

    @Autowired
    AccountDao accountDao;

    @Test
    public void test() {


       /* InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("applicationContext.xml");

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sessionFactory.openSession();

        AccountDao accountDao = session.getMapper(AccountDao.class);*/

        List<Account> accountList = accountDao.findAll();

        for (Account account : accountList) {
            System.out.println(account.getUsername());
        }
        System.out.println("你好");


    }
}
