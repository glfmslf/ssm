package com.yy.service.impl;

import com.yy.dao.AccountDao;
import com.yy.pojo.Account;
import com.yy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * AUTHOR: yy
 * CREATED_DATE: 2018/3/6 22:05
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> getAllAccountList() {
        List<Account> accList = accountDao.getAllAccountList();
        return accList;
    }


    @Override
    public Account vilidateAcc(Account acc) {
        return accountDao.vilidateAcc(acc);
    }
}
