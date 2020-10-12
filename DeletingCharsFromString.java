import acm.program.ConsoleProgram;

public class DeletingCharsFromString extends ConsoleProgram{
	
	public void run() {
		
		String userStr = readLine("Enter a String with some special characters in it. : ");
		String userChoice = readLine("Enter a special character to remove from your string. : ");
		char userChar = userChoice.charAt(0);
		System.out.println(removeCommas(userStr, userChar));
	}

	private String removeCommas(String userStr, char userChar) {
		String result = "";
		for (int i = 0; i < userStr.length(); i++) {
			if (userStr.charAt(i) != userChar) 
			result += userStr.charAt(i);
		}
		return result;
		}
}
