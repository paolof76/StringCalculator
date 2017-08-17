package my.calc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	ICalculator calc;
	
	@Before
	public void init() {
		calc = new GeneralCalculator();
	}
	
	@Test
	public void addTest_EmptyString(){
		int expected = 0;
		int result = calc.add("");
		assertEquals(expected, result);
	}
	
	@Test(expected = NumberFormatException.class)
	public void addTest_NoNumber(){
		calc.add("er");
	}
	
	@Test
	public void addTest_SingleNumber(){
		int expected = 2;
		int result = calc.add("2");
		assertEquals(expected, result);
	}
	
	@Test
	public void addTest_TwoNumbers(){
		int expected = 10;
		int result = calc.add("3,7");
		assertEquals(expected, result);
	}
	
	@Test(expected = NumberFormatException.class)
	public void addTest_TwoNonNumericElems_1(){
		calc.add("a,7");
	}
	
	@Test(expected = NumberFormatException.class)
	public void addTest_TwoNonNumericElems_2(){
		calc.add("3,y");
	}
	
	@Test
	public void addTest_MoreThanTwo(){
		int expected = 13;
		int result = calc.add("3,4,6");
		assertEquals(expected, result);
	}
	
	@Test
	public void addTest_WithDifferentSeparators(){
		int expected = 13;
		int actual = calc.add("1\n3,5\n4");
		assertEquals(expected, actual);
	}
	
	@Test
	public void addTest_WithCustomSeparator(){
		int expected = 13;
		int actual = calc.add("1\n3,5\n4");
		assertEquals(expected, actual);
	}


}
