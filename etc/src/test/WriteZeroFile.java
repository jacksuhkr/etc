package test;

import java.io.*;

public class WriteZeroFile {
	public static void main(String[] args) throws IOException { 
		ReadText.getWords();
		String[] newWords = new String[ReadText.words.size()];
		
		try {
	////////////////////////////////////////////////////////////////
	      BufferedWriter out = new BufferedWriter
	    		  (new FileWriter("C:/files/numbers_of_used.txt"));
	      
	      for (int i=0; i<newWords.length; i++) {
		      out.write("0"); out.newLine();
	      }

	      out.close();
	////////////////////////////////////////////////////////////////
		 } catch (IOException e) {
		      System.err.println(e); // 에러가 있다면 메시지 출력
		      System.exit(1);
		 }
	}
}
