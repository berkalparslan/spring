package com.aberk.springdeneme.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm{
	
	public String sort(int[] numbers) {
		return "Ben bubble sort";
	}

}
