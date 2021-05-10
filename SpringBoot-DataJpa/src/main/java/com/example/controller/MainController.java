package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Account;
import com.example.service.AccountService;

@Controller
@RequestMapping(path = "/")
public class MainController {

	@Autowired
	AccountService accountService;
	
	@GetMapping
	public String viewMain() {
		return "Main";
	}
	
	@PostMapping(path = "/findAccount")
	public String viewAccount(@ModelAttribute("id") String id, Model model) {
		Account account = accountService.findOne(id);
		model.addAttribute("name", account.getName());
		return "Sub";
	}
}
