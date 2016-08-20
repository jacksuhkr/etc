package test;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadText {
	public static ArrayList<String> words = new ArrayList<String>();
	
	public static void getWords() {
		int i = 0;
		
		try {
		//get the file data
//		BufferedReader in = new BufferedReader(new FileReader("c:/files/korean_3467words.txt"));
//		BufferedReader in = new BufferedReader(new FileReader("c:/files/english_medium_words.txt"));
//		BufferedReader in = new BufferedReader(new FileReader("c:/files/word_storage.txt"));
		BufferedReader in = new BufferedReader
				(new InputStreamReader(new FileInputStream("c:/files/normal_words.txt"),"EUC-KR"));
		
		// 체언 단어장 불러옴
//		BufferedReader in = new BufferedReader(new FileReader("c:/files/korean_safe_words.txt"));
		
//		// 체언 단어장 불러옴
//		BufferedReader in = new BufferedReader(new FileReader("c:/files/wordChain/easy_words/korean_easy_words.txt"));


		String s;
			  
		System.out.println("-----------txt파일의 데이터----------");

		while ((s = in.readLine()) != null) {
			words.add(s);
		}
		
		for (i=0; i<words.size(); i++) {
			System.out.println( /*"words.get(" + i + ") : " +*/ words.get(i));
		}
		
		System.out.println("-------------------------------");

		in.close();		//file close

		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
	};
}
