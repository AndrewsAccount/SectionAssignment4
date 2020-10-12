import acm.program.ConsoleProgram;

public class Commas extends ConsoleProgram{
	
	public void run() {
		
		while (true) {
			 String digits = readLine("Enter a numeric string: ");
			 if (digits.length() == 0) break;
			 println(addCommasToNumericString(digits));
			 }

	}
	
	private String addCommasToNumericString(String digits) {
		
		String formatted = "";
		int length = digits.length();
		int commaSeparater = 0;
		for(int i = length - 1; i >=0; i--) {
			formatted = digits.charAt(i) + formatted;
			commaSeparater++;
			if (commaSeparater % 3 == 0 && commaSeparater < length) {
				formatted = ',' + formatted;
			}
			
		}
		return formatted;
	}

}
