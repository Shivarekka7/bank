package com.bankDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankDetails.Entity.Bank;
import com.bankDetails.Service.BankService;

@RestController
public class BankController {
	@Autowired BankService bs;
	@PostMapping(value="/PostAll")
	public String postAll(@RequestBody List<Bank>a){
		return bs.postAll(a);
		
	}
	@GetMapping(value="/GetBranchByIfscCode/{a}")
	public  String GetBranchByIfscCode(@PathVariable String a) {
		return bs.GetBranchByIfscCode(a);
	}
	@GetMapping(value="/GetAll")
	public List<Bank>GetAll(){
		return bs.GetAll();
	}
		
	

}
