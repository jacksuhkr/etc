package test;

import java.io.*;

public class WriteRemoveSpace {
	public static void main(String[] args) throws IOException { 
		ReadText.getWords();
		boolean noSpace = true;
		String space;
		String[] newWords = new String[ReadText.words.size()];
		
		try {
	////////////////////////////////////////////////////////////////
	      BufferedWriter out = new BufferedWriter
	    		  (new FileWriter("C:/files/english_without_space.txt"));
	      
	      for (int i=0; i<ReadText.words.size(); i++) {
		      newWords[i] = ReadText.words.get(i);
	      }
	      
	      for (int i=0; i<newWords.length; i++) {
		      if(theresNoSpace(newWords[i])) {
		    	  out.write(newWords[i]); 
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
	
	public static boolean theresNoSpace(String input) {
		for(int i=0; i<input.length(); i++) {
			if(input.substring(i, i+1).equals(" ")) {
				System.out.println("여백이 있어서 제거");
				return false;
			} else if (input.substring(i, i+1).equals("'")) {
				System.out.println("작은 따옴표가 있어서 제거");
				return false;
			}
		}
		return true;
	}
}
