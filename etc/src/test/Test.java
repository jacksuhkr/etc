package test;

import java.util.Scanner;
import java.lang.String;

public class Test {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*int i;
		String input, inputFirst, inputFinal;
		
		
		// 문자 입력
		System.out.println("정보를 얻고 싶은 글자를 입력하세요");
		input = scanner.nextLine();
		
		// 문자 길이 출력
		i = input.length();
		System.out.println("입력하신 문자의 길이는 " + i + "입니다.");
		
		// 문자의 첫글자 출력
		inputFirst = input.substring(0, 1);
		System.out.println("입력하신 문자의 첫번째 글자는 " + inputFirst + "입니다.");
		
		// 문자의 마지막 글자 출력
		inputFinal = input.substring(i-1, i);
		System.out.println("입력하신 문자의 마지막 글자는 " + inputFinal + "입니다.");
		*/
		
		String testring = "나";
//		char letter = testring.charAt(0);
//		int unicode = letter;
		int unicode = testring.hashCode();
		System.out.println(unicode);
		
		String test = "";
		if(checkAcceptable(test)) {
			System.out.println(test + "는 적절한 단어가 아닙니다");
		}
		
		float testFloat = 1;
		String floatToString = Float.toString(testFloat);
		System.out.println(floatToString);
		
		
		float zero = 0;
		float divideZero = 5/zero;
		float multiplyOnInfinity = 0*divideZero;
		System.out.println(divideZero);
		System.out.println(multiplyOnInfinity);
		System.out.println(divideZero==10);
	}
	
    // 적절한 단어를 넣었는지 확인
    public static boolean checkAcceptable(String input) {
        try {
//            int inputFirstLetterNum = WordFinder.firstLetter(input).hashCode();
            char inputFirstLetterNum = input.charAt(0);
            if ('가' <= inputFirstLetterNum && inputFirstLetterNum <= '힣') { return false;}
        } catch (Exception e) { }
         return true;
    }
}
