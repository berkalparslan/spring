package com.aberk.springdeneme.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	public String binarySearch(int[] numbers, int numberToSearchFor) {
		
		String ali = sortAlgorithm.sort(numbers);
		System.out.println(ali);
		
		System.out.println(sortAlgorithm);
		String result="binarysearch";
		
		return result;
	}
	
	@PostConstruct
	public void postConstruct() {
		LOGGER.info(" Post Constructed ");
	}
	
	@PreDestroy
	public void preDestroy() {
		LOGGER.info(" Pre Destroyed ");
	}
}
