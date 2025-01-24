package com.cjc.main.crud.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.crud.model.Account;
import com.cjc.main.crud.model.Transaction;
import com.cjc.main.crud.service.AccountService;

@Controller
public class Accountontroller {

	List<Transaction> tl = new ArrayList<Transaction>();
	Transaction tr;

	@Autowired
	AccountService as;

	String type;
	double tramt;

	@RequestMapping("/")
	public String logggg() {
		return "login";
	}

	@RequestMapping("/reg")
	public String registerrrr() {
		return "register";
	}

	@RequestMapping("/backLog")
	public String backToLogin(@ModelAttribute Account a) {
		as.saveData(a);
		return "login";
	}

	@RequestMapping("/log")
	public String loginToSuccess(@RequestParam("uname") String un, @RequestParam("pass") String ps, Model m) {
		Account a = as.findByUnameAndPass(un, ps);
		m.addAttribute("data", a);
		return "success";
	}

	@RequestMapping("/withdraw")
	public String withdrawPage(@RequestParam("accno") long ac, Model m) {
		Account a = as.findByAccno(ac);
		m.addAttribute("data", a);
		return "withdraw";
	}

	@RequestMapping("/withdrawToLogin")
	public String WithdrawToLoginnn(@RequestParam("accno") long ac, @RequestParam("balence") double balence) {
		tr = new Transaction();
		Account a = as.findByAccno(ac);
		double b = a.getBalence() - balence;
		a.setBalence(b);
		tr.setTraamt(balence);
		tr.setType("withdraw");
		tr.setLdt(LocalDateTime.now());
		tr.setRembal(b);
		tl.add(tr);
		as.saveData(a);
		return "login";
	}

	@RequestMapping("/diposite")
	public String dipositeee(@RequestParam("accno") long ac, Model m) {
		Account a = as.findByAccno(ac);
		m.addAttribute("data", a);
		return "diposite";
	}

	@RequestMapping("/dipositeToLogin")
	public String dipositeToLoginnn(@RequestParam("accno") long ac, @RequestParam("balence") double balence) {
		tr = new Transaction();
		Account a = as.findByAccno(ac);
		double b = a.getBalence() + balence;
		a.setBalence(b);
		tr.setTraamt(balence);
		tr.setType("diposite");
		tr.setLdt(LocalDateTime.now());
		tr.setRembal(b);
		tl.add(tr);

		as.saveData(a);
		return "login";
	}

	@RequestMapping("/transaction")
	public String transaction(Model m) {

		m.addAttribute("data", tl);

		return "transaction";
	}

}
