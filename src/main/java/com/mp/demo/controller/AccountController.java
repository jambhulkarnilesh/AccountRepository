package com.mp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mp.demo.entity.Account;
import com.mp.demo.service.AccountService;

import io.swagger.annotations.ApiOperation;

@RestController
public class AccountController {
	
@Autowired
private AccountService accountService;


@ApiOperation(value="say add account details",notes = "This is note about account details")
@PostMapping("/addAccountDetails")
public void addAccountInfor(Account account)
{
	accountService.addAccountDetails(account);
}
}
