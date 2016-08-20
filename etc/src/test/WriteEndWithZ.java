package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteEndWithZ {
	public static void main(String[] args) throws IOException { 
		ReadText.getWords();
		String[] newWords = new String[ReadText.words.size()];
		
		try {
	////////////////////////////////////////////////////////////////
	      BufferedWriter out = new BufferedWriter
	    		  (new FileWriter("C:/files/words_end_with_z.txt"));
	      
	      for (int i=0; i<newWords.length; i++) {
	    	  int wordLength = ReadText.words.get(i).length();
	    	  String last = ReadText.words.get(i).substring(wordLength-1, wordLength);
		      if (last.equals("y") || last.equals("z")) 
	    	  { out.write(ReadText.words.get(i)); out.newLine(); }
	      }
	      out.close();
	////////////////////////////////////////////////////////////////
		 } catch (IOException e) {
		      System.err.println(e); // 에러가 있다면 메시지 출력
		      System.exit(1);
		 }
		
	}
}
