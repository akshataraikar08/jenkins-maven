package com.akshata.training;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JenkinsCalTest {

	
	@Test
	public void test ()
	
	{
		JenkinsCal myCal= new  JenkinsCal();
		assertEquals(10, myCal.addnumber(5, 5));
		
	}
	

	@Test
	public void test1 ()
	
	{
		JenkinsCal myCal= new  JenkinsCal();
		assertEquals(15, myCal.addnumber(10, 5));
		
	}
}
