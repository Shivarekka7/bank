package com.bankDetails.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bankDetails.Entity.Bank;

import jakarta.persistence.Id;

public interface BankRepository  extends JpaRepository<Bank, Id>{
	
@Query(value="select branch from bankdet where IFSCCode=?",nativeQuery=true)
public  String GetBranchByIfscCode(String a) ;
@Query(value="select *from  bankdet; ",nativeQuery=true)
public List<Bank>GetAll();


	


}
