package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

// 단어의 끝글자가 킬링워드의 첫글자랑 같은게 없는 단어들만 모은것
// 쉽게 얘기해, 내가 말한 단어에 얘가 받아쳐봤자 끝내는 단어는 없음

public class SafeWord {
	public static void main(String[] args) throws IOException { 
		// 텍스트파일을 불러와서 word를 정의
		ArrayList<String> words = new ArrayList<String>();
		try {
			BufferedReader in = new BufferedReader(new FileReader("c:/files/korean_body_words.txt"));
			String s;
			while ((s = in.readLine()) != null) { words.add(s); }
		
			// 제대로 불러왔나 출력해봄
			for (int i=0; i<words.size(); i++) {
				System.out.println("words.get(" + i + ") : " + words.get(i));
				i++;
			}
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
		
		// 텍스트파일을 불러와서 word를 정의
		ArrayList<String> killerWords = new ArrayList<String>();
		try {
			BufferedReader in = new BufferedReader(new FileReader("c:/files/korean_killer_words.txt"));
			String s;
			while ((s = in.readLine()) != null) { killerWords.add(s); }
		
			// 제대로 불러왔나 출력해봄
			for (int i=0; i<killerWords.size(); i++) {
				System.out.println("killerWords.get(" + i + ") : " + killerWords.get(i));
				i++;
			}
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
		
		
		// livingWords를 정의
		ArrayList<String> safeWords = new ArrayList<String>();
		boolean checkSafe;
		 
		try {
	      BufferedWriter out = new BufferedWriter
	    		  (new FileWriter("C:/files/korean_safe_words.txt"));
	      
	      for (int i=0; i<words.size(); i++) {
	    	  String word = words.get(i);
		  	  int k = word.length();
		  	  
		  	  if (k>0) {
		  		String last = word.substring(k-1, k);
		  	      
	  	      	checkSafe = true;
		  		for (int l=0; l<killerWords.size(); l++) {
		  			String chkWord = killerWords.get(l);
					if (chkWord.length()>0) {
			  			String first = chkWord.substring(0, 1);
						if (last.equals(first)) {
							 checkSafe = false;
						}
					}
				}
		  		
			  if (checkSafe) { 
				  safeWords.add(word); 
				  System.out.println("safeWords.get(" + safeWords.size() + ") : " + word); 
				  out.write(word); 
				  out.newLine();	
			  }
		  }	//for문
	  }		//try
	      
	      out.close();
	      
		 } catch (IOException e) {
		      System.err.println(e); // 에러가 있다면 메시지 출력
		      System.exit(1);
		 }
	}
}
