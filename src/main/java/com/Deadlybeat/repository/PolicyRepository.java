package com.Deadlybeat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Deadlybeat.repository.model.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Integer>{

	//Policy findByFolioNumber(int folioNumber);

	//void deleteByFolioNumber(int folioNumber);
	//Policy deleteByFolioNumber(int folioNumber);
	
}
