package test;

import java.util.Scanner;
import java.lang.String;

public class Test {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*int i;
		String input, inputFirst, inputFinal;
		
		
		// ¹®ÀÚ ÀÔ·Â
		System.out.println("Á¤º¸¸¦ ¾ò°í ½ÍÀº ±ÛÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		input = scanner.nextLine();
		
		// ¹®ÀÚ ±æÀÌ Ãâ·Â
		i = input.length();
		System.out.println("ÀÔ·ÂÇÏ½Å ¹®ÀÚÀÇ ±æÀÌ´Â " + i + "ÀÔ´Ï´Ù.");
		
		// ¹®ÀÚÀÇ Ã¹±ÛÀÚ Ãâ·Â
		inputFirst = input.substring(0, 1);
		System.out.println("ÀÔ·ÂÇÏ½Å ¹®ÀÚÀÇ Ã¹¹øÂ° ±ÛÀÚ´Â " + inputFirst + "ÀÔ´Ï´Ù.");
		
		// ¹®ÀÚÀÇ ¸¶Áö¸· ±ÛÀÚ Ãâ·Â
		inputFinal = input.substring(i-1, i);
		System.out.println("ÀÔ·ÂÇÏ½Å ¹®ÀÚÀÇ ¸¶Áö¸· ±ÛÀÚ´Â " + inputFinal + "ÀÔ´Ï´Ù.");
		*/
		
		String testring = "³ª";
//		char letter = testring.charAt(0);
//		int unicode = letter;
		int unicode = testring.hashCode();
		System.out.println(unicode);
		
		String test = "";
		if(checkAcceptable(test)) {
			System.out.println(test + "´Â ÀûÀıÇÑ ´Ü¾î°¡ ¾Æ´Õ´Ï´Ù");
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
	
    // ÀûÀıÇÑ ´Ü¾î¸¦ ³Ö¾ú´ÂÁö È®ÀÎ
    public static boolean checkAcceptable(String input) {
        try {
//            int inputFirstLetterNum = WordFinder.firstLetter(input).hashCode();
            char inputFirstLetterNum = input.charAt(0);
            if ('°¡' <= inputFirstLetterNum && inputFirstLetterNum <= 'ÆR') { return false;}
        } catch (Exception e) { }
         return true;
    }
}
