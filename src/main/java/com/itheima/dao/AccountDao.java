package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {
    /**
     * 查询全部
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Account findById(Integer id);

    /**
     * 保存用户
     * @param account
     */
    public void save(Account account);

    /**
     * 更新用户
     * @param account
     */
    public void updata(Account account);

    /**
     * 根据id删除用户
     * @param id
     */
    public void deleteById(Integer id);
}
