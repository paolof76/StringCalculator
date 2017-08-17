package my.calc;

import java.util.List;

public class AbstractCalculator {

	public AbstractCalculator() {
		super();
	}

	protected boolean isEmptyList(String input) {
		if("".equals(input)) {
			return true;
		}
		return false;
	}

	protected List<String> getNumbersFromString(String input) {
		IProcessor processor = new ProcessorFactory().getProcessor(input);
		return processor.process(input);
	}

}