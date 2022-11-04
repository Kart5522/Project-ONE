package org.alpha;

import org.testng.annotations.Test;

public class Atest {
	@Test(groups= {"Sanity","regression"})
	private void testA1() {
	System.out.println("Test A1");
	}
	@Test(groups= {"Sanity","Testing"})
	private void testA2() {
	System.out.println("Test A2");
	}
	@Test(groups="Sanity")
	private void testA3() {
	System.out.println("Test A3");
	}
	@Test(groups="Sandan")
	private void testA4() {
	System.out.println("Test A4");
	}
	@Test(groups="regression")
	private void testA5() {
	System.out.println("Test A5");
	}
	@Test(groups="regression")
	private void testA6() {
	System.out.println("Test A6");
	}
	@Test
	private void testA7() {
	System.out.println("Test A7");
	}
	@Test(groups= {"Sanity","Sandan"})
	private void testA8() {
	System.out.println("Test A8");
	}
	@Test
	private void testA9() {
	System.out.println("Test A9");
	}
	@Test
	private void testA10() {
	System.out.println("A10");
	}
	@Test
	private void testA11() {
	System.out.println("Test A11");
	}
	}
	
    

		
	
