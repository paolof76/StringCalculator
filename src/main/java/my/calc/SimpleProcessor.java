package my.calc;

import java.util.Arrays;
import java.util.List;

public class SimpleProcessor implements IProcessor {

	public static final String SEPARATOR = ",";

	@Override
	public List<String> process(String input) {
		String updatedInput = input;
		updatedInput = normalizeNewLines(updatedInput, SEPARATOR);
		return splitInput(updatedInput, SEPARATOR);
	}

	protected String normalizeNewLines(String input, String separator) {
		return input.replace("\n", separator);
	}

	protected List<String> splitInput(String updatedInput, String separator) {
		return Arrays.asList(updatedInput.split(separator));
	}

}
