package com.bankDetails.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bankDetails.Entity.Bank;
import com.bankDetails.Repository.BankRepository;
@Repository
public class BankDao {
	@Autowired BankRepository br;
	public String postAll( List<Bank>a){
		br.saveAll(a);
		return "posted Successfully";
		
		
	}
	public String  GetBranchByIfscCode(String a) {
		return br.GetBranchByIfscCode( a);
	}
	
}
