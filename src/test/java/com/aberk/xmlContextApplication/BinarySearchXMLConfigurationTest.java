package com.aberk.xmlContextApplication;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.aberk.springdeneme.basic.BinarySearchImpl;

//Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(locations="/testContext.xml")
public class BinarySearchXMLConfigurationTest {

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