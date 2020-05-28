package com.Deadlybeat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Deadlybeat.repository.PolicyRepository;
import com.Deadlybeat.repository.model.Policy;

@Service
public class PolicyService {

	@Autowired
	private PolicyRepository repository;
	
	public List<Policy> fetchPolicyList(){
		return repository.findAll();	
	}
	
	public Policy savePolicy(Policy policy) {
		return repository.save(policy);
	}
	
	public Optional<Policy> fetchPolicyById(int id){
		return repository.findById(id);
	}

	public String deletePolicyById(int folioNumber) {

		String result;
		try 
		{
			repository.deleteById(folioNumber);
			//repository.deleteByFolioNumber(folioNumber);
			result="Policy with Folio Number:-"+folioNumber+" deleted successfully!";
		} 
		catch (Exception e) {
			result="Policy with Folio Number:-"+folioNumber+" Not found!";
			System.out.println("exception"+e);
		}
		return result;
	}
	
}
