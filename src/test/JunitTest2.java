package test;

import org.junit.*;


public class JunitTest2 {
   
	@Test(expected = ArithmeticException.class)  
	public void divisionWithException() {  
	  int i = 1/0;
	}  
    
}
