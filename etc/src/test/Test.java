package test;

import java.util.Scanner;
import java.lang.String;

public class Test {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*int i;
		String input, inputFirst, inputFinal;
		
		
		// ���� �Է�
		System.out.println("������ ��� ���� ���ڸ� �Է��ϼ���");
		input = scanner.nextLine();
		
		// ���� ���� ���
		i = input.length();
		System.out.println("�Է��Ͻ� ������ ���̴� " + i + "�Դϴ�.");
		
		// ������ ù���� ���
		inputFirst = input.substring(0, 1);
		System.out.println("�Է��Ͻ� ������ ù��° ���ڴ� " + inputFirst + "�Դϴ�.");
		
		// ������ ������ ���� ���
		inputFinal = input.substring(i-1, i);
		System.out.println("�Է��Ͻ� ������ ������ ���ڴ� " + inputFinal + "�Դϴ�.");
		*/
		
		String testring = "��";
//		char letter = testring.charAt(0);
//		int unicode = letter;
		int unicode = testring.hashCode();
		System.out.println(unicode);
		
		String test = "";
		if(checkAcceptable(test)) {
			System.out.println(test + "�� ������ �ܾ �ƴմϴ�");
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
	
    // ������ �ܾ �־����� Ȯ��
    public static boolean checkAcceptable(String input) {
        try {
//            int inputFirstLetterNum = WordFinder.firstLetter(input).hashCode();
            char inputFirstLetterNum = input.charAt(0);
            if ('��' <= inputFirstLetterNum && inputFirstLetterNum <= '�R') { return false;}
        } catch (Exception e) { }
         return true;
    }
}
