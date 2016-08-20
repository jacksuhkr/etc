package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TestUniCode {
	public static void main(String args[]) {
		try {
			// Writer 선언
			BufferedWriter out = new BufferedWriter
					(new FileWriter("C:/files/letter_unicode.txt"));
			      
			// 파일에 내용작성
			int uniCodeNum;
			for (uniCodeNum=44032; uniCodeNum<=55203; uniCodeNum++) {
				char letter = (char) uniCodeNum;
				System.out.println(uniCodeNum + " : " + letter);
//				out.write(uniCodeNum + "\t" + letter); 
				out.write(letter); 
				out.newLine();
			}
			
	      out.close();

		} catch (IOException e) {
		      System.err.println(e); // 에러가 있다면 메시지 출력
		      System.exit(1);
		}
	}
}
