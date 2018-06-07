package com.yy.dao;

import com.yy.pojo.Account;

import java.util.List;

public interface AccountDao {

    List<Account> getAllAccountList();

    Account vilidateAcc(Account acc);
}
