package com.yy.ctrl;

import com.yy.pojo.Account;
import com.yy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

/**
 * AUTHOR: yy
 * CREATED_DATE: 2018/3/6 22:10
 */
@Controller
@RequestMapping("account")
@SessionAttributes("account")

public class AccountCtrl {

    @Autowired
    private AccountService accountService;

    @RequestMapping("account")
    public String getAllAccountList(ModelMap model ,String value){
        System.out.print(value);
        List<Account> accList = accountService.getAllAccountList();
        model.put("account",accList);
        return "jsp/account/account";
    }

    @RequestMapping("vilidateAcc")
    public String vilidateAccount(ModelMap model,Account acc){
        Account account = accountService.vilidateAcc(acc);
        if(acc != null){
            model.put("account",account);
            return "login/success";
        }
        else {
            return "login/fail";
        }

    }
}
