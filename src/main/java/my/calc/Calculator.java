package my.calc;

import java.util.List;

public class Calculator extends AbstractCalculator implements ICalculator {
	/* (non-Javadoc)
	 * @see my.calc.ICalculator#add(java.lang.String)
	 */
	@Override
	public int add(String input) {
		if (isEmptyList(input)) return 0;
		
		List<String> numbers = getNumbersFromString(input);
		if(numbers.size() == 1) {
			return new Integer(numbers.get(0));
		} else if (numbers.size() == 2){
			return new Integer(numbers.get(0)) + new Integer(numbers.get(1));
		}
		throw new RuntimeException("Wrong argument");
	}

}
