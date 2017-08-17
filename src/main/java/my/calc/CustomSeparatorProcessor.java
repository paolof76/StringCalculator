package my.calc;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomSeparatorProcessor extends SimpleProcessor {

	@Override
	public List<String> process(String input) {
		Pattern pattern = Pattern.compile("\\/\\/(.*)\\n.*");
		Matcher matcher = pattern.matcher(input);
		if (!matcher.find())
		{
			return super.process(input);
		}
		return processInternal(input);
	}

	private List<String> processInternal(String input) {
		Pattern pattern = Pattern.compile("\\/\\/(.*)\\n.*");
		Matcher matcher = pattern.matcher(input);
		if (matcher.find())
		{
			String separator = matcher.group(1);
			String theInput = input.substring(input.indexOf("\n")+1);
			String normalized = theInput;
			normalized = super.normalizeNewLines(normalized, separator);

		    return splitInput(normalized, separator);
		}
		throw new RuntimeException("Input not compliant");
	}

}
