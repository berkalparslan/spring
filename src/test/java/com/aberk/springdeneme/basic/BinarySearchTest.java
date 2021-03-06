package com.aberk.springdeneme.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


//Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringdenemeBasicApplication.class)
public class BinarySearchTest {

	// Get this bean from the context
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBasicScenario() {
		
		// call method on binarySearch
		String actualResult = binarySearch.binarySearch(new int[] {}, 5);

		// check if the value is correct
		assertEquals("binarysearch", actualResult);

	}

}