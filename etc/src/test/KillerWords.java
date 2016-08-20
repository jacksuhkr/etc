package test;

import java.io.*;
import java.util.ArrayList;
import java.lang.String;

// 이유는 모르겠지만 계속 글씨길이가 0인게 섞여있을때만 가능한 오류가 뜸

public class KillerWords {
	
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
		
		// killerWords를 정의
		ArrayList<String> killerWords = new ArrayList<String>();
		boolean checkKiller;
		 
		try {
	      BufferedWriter out = new BufferedWriter
	    		  (new FileWriter("C:/files/korean_killer_words.txt"));
	      
	      for (int i=0; i<words.size(); i++) {
	    	  String word = words.get(i);
		  	  int k = word.length();
		  	  
		  	  if (k>0) {
		  		String last = word.substring(k-1, k);
		  	      
	  	      	checkKiller = true;
		  		for (int l=0; l<words.size(); l++) {
		  			String chkWord = words.get(l);
					if (chkWord.length()>0) {
			  			String first = chkWord.substring(0, 1);
						if (last.equals(first)) {
							 checkKiller = false;
						}
					}
				}
		  		
			  if (checkKiller) { 
				  killerWords.add(word); 
				  System.out.println("killerWords.get(" + killerWords.size() + ") : " + word); 
				  out.write(word); 
				  out.newLine();	
			  }
		  }	//for문
	  }		//try

	      
/*	      for (int i=0; i<killerWords.size(); i++) {
	    	  System.out.println("killerWords.get(" + i + ") : " + killerWords.get(i));
		      out.write(killerWords.get(i)); 
		      out.newLine();
	      }*/
	      
	      out.close();
	      
		 } catch (IOException e) {
		      System.err.println(e); // 에러가 있다면 메시지 출력
		      System.exit(1);
		 }
	}
	
	/*public boolean checkKillerWord(String lastLetter) {
		for (int k=0; k<words.size(); k++) {
			String first = firstLetter(lastLetter);
			if (lastLetter.equals(first)) {
				return true;  
			}
		}
		return false;  
	}
	  
	public String firstLetter(String input) {
	    String first = input.substring(0, 1);
	    return first;
	}
	    
	public String lastLetter(String input) {
		int i = input.length();
	    String last = input.substring(i-1, i);
	    return last;
	}*/
}

