package com.bankDetails.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankDetails.Dao.BankDao;
import com.bankDetails.Entity.Bank;
@Service
public class BankService {
	@Autowired BankDao bd;
	public String postAll( List<Bank>a){
		return bd.postAll(a);
		
		
	}
	public String  GetBranchByIfscCode(String a) {
		return bd.GetBranchByIfscCode( a);
	}
	public List<Bank>GetAll(){
		return bd.GetAll();
	}


}
