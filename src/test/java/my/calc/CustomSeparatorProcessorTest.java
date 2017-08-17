package my.calc;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CustomSeparatorProcessorTest {
	
	private CustomSeparatorProcessor processor = new CustomSeparatorProcessor();
	
	@Test
	public void processTestSimpleCase(){
		String input = "2,5";
		List<String> expected = Arrays.asList(new String[] {"2", "5"});
		assertEquals(expected, processor.process(input));
	}
	
	@Test
	public void processTest(){
		String input = "//;\n1;3";
		List<String> expected = Arrays.asList(new String[] {"1", "3"});
		assertEquals(expected, processor.process(input));
	}
	
	@Test
	public void processTestCustomSeparator(){
		String input = "//;\n1;3\n5";
		List<String> expected = Arrays.asList(new String[] {"1", "3", "5"});
		assertEquals(expected, processor.process(input));
	}
}
