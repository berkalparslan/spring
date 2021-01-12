package com.aberk.springdeneme.scope;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ScopeTestMockito {

	//InjectMock
	@InjectMocks
	PersonDAO personDao;
	
	@Mock
	JDBCConnection dbData;
	
	@Test
	public void testPersonDao() {
		when(dbData.getDataFromDB()).thenReturn(new int[] {2,3,56});
		assertEquals(56,personDao.findGreatest());
	}
	
	@Test
	public void testBasicScenario_NoElements() {
		when(dbData.getDataFromDB()).thenReturn(new int[] { });
		assertEquals(Integer.MIN_VALUE, personDao.findGreatest());
	}

	@Test
	public void testBasicScenario_EqualElements() {
		when(dbData.getDataFromDB()).thenReturn(new int[] { 2,2});
		assertEquals(2, personDao.findGreatest());
	}
	
	
}
