package test;

import org.junit.*;

public class JunitTest4{
	@Test(timeout = 1000)  
	public void infinity() {  
		while (true);  
	}  
}
