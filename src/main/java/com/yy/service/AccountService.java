package com.yy.service;

import com.yy.pojo.Account;

import java.util.List;

public interface AccountService {

   List<Account> getAllAccountList();

   Account vilidateAcc(Account acc);
}
