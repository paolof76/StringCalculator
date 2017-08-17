package my.calc;

public class ProcessorFactory {

	public IProcessor getProcessor(String input) {
		if(!input.matches("\\/\\/(.*)\\n")) {
			return new SimpleProcessor();
		} else {
			return new CustomSeparatorProcessor();
		}
	}
	
}
