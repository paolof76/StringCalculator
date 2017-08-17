package my.calc;

import java.util.List;

public class GeneralCalculator extends Calculator implements ICalculator {

	@Override
	public int add(String input) {
		List<String> numbers = getNumbersFromString(input);
		if(isEmptyList(input) || numbers.size() <= 2) {
			return super.add(input);
		}
		return addAllElements(numbers);
	}

	private int addAllElements(List<String> numbers) {
		int sum = 0;
		for(String elem: numbers) {
			sum += new Integer(elem);
		}
		return sum;
	}

}
