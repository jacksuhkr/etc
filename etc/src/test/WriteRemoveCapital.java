package test;

import java.io.*;

public class WriteRemoveCapital {
	public static void main(String[] args) throws IOException { 
		ReadText.getWords();
		String[] newWords = new String[ReadText.words.size()];
		
		try {
	////////////////////////////////////////////////////////////////
	      BufferedWriter out = new BufferedWriter
	    		  (new FileWriter("C:/files/words_without_capital.txt"));
	      
	      for (int i=0; i<newWords.length; i++) {
		      if (ReadText.words.get(i).length()>1) { 
		    	  String wordWithoutCapital = ReadText.words.get(i).toLowerCase();
		    	  out.write(wordWithoutCapital); 
		    	  out.newLine(); 
		      }
	      }
	      out.close();
	////////////////////////////////////////////////////////////////
		 } catch (IOException e) {
		      System.err.println(e); // 에러가 있다면 메시지 출력
		      System.exit(1);
		 }
		
	}
}
