package test;

import java.io.*;

public class WriteRemoveOneWord {
	public static void main(String[] args) throws IOException { 
		ReadText.getWords();
		String[] newWords = new String[ReadText.words.size()];
		
		try {
	////////////////////////////////////////////////////////////////
	      BufferedWriter out = new BufferedWriter
	    		  (new FileWriter("C:/files/words_without_one_word.txt"));
	      
	      for (int i=0; i<newWords.length; i++) {
		      if (ReadText.words.get(i).length()>1) 
	    	  { out.write(ReadText.words.get(i)); out.newLine(); }
	      }
	      out.close();
	////////////////////////////////////////////////////////////////
		 } catch (IOException e) {
		      System.err.println(e); // ������ �ִٸ� �޽��� ���
		      System.exit(1);
		 }
		
	}
}
