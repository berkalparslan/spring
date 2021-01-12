package com.aberk.springdeneme.basic;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringdenemeBasicApplication {

	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringdenemeBasicApplication.class)){
		

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
	//	BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		SortAlgorithm bubbleSortAlgorithm = applicationContext.getBean(SortAlgorithm.class);
		System.out.println(bubbleSortAlgorithm);
		System.out.println(binarySearch);

	//	System.out.println(binarySearch1);
		String result = binarySearch.binarySearch(new int[] { 4, 2, 3 }, 3);

		System.out.println(result);
		}
	}
}
