package test;

public class TestToLowerCaseNSpace {
	public static void main(String[] args) {
		String test = "CAPITAL";
		System.out.println(test.toLowerCase());
		
		String space = "s p a c e";
		System.out.println(ifTheresSpace(space));
	}
	
	public static String ifTheresSpace(String input) {
		for(int i=0; i<input.length(); i++) {
			if(input.substring(i, i+1).equals(" ")) {
				input = "여백이 있습니다";
			}
		}
		return input;
	}
}
