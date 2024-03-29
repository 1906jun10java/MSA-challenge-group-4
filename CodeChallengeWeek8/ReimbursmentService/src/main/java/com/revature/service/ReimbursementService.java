package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.*;
import com.revature.daos.*;

@Service
public class ReimbursementService {

private ReimbursementRepository reimbursementRepository;
	
	@Autowired
	public ReimbursementService(ReimbursementRepository reimbursementRepository) {
		this.reimbursementRepository = reimbursementRepository;
	}
	
	public List<Reimbursement> getAllReimbursements(){
		return  reimbursementRepository.findAll();
	}
}
