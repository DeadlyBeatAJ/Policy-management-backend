package com.Deadlybeat.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Deadlybeat.repository.model.Policy;
import com.Deadlybeat.service.PolicyService;

@RestController
@CrossOrigin
public class PolicyController {

	@Autowired
	private PolicyService service;
	
	@GetMapping("/getAllPolicies")
	public List<Policy>fetchPolicyList()
	{
		List<Policy> policies= new ArrayList<>();
		policies= service.fetchPolicyList();
		return policies;
	}
	
	@PostMapping("/addPolicy")
	public Policy savePolicy(@RequestBody Policy policy)
	{
		return service.savePolicy(policy);	
	}
	
	@GetMapping("/getPolicyByFolio/{id}")
	public Optional<Policy> fetchPolicyByFolioNumber(@PathVariable int id)
	{
		return service.fetchPolicyById(id);
	}
	
	@DeleteMapping("/deletePolicyByFolio/{id}")
	public String deletePolicyByFolioNumber(@PathVariable int id)
	{
		return service.deletePolicyById(id);
	}
}
