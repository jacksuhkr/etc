package test;

import java.io.*;

public class WriteRemoveNumber {
	public static void main(String[] args) throws IOException { 
		ReadText.getWords();
		boolean noNum = true;
		int lastNum;
		String[] newWords = new String[ReadText.words.size()];
		
		try {
	////////////////////////////////////////////////////////////////
	      BufferedWriter out = new BufferedWriter
	    		  (new FileWriter("C:/files/korean_3467words_without_number.txt"));
	      
	      for (int i=0; i<ReadText.words.size(); i++) {
		      newWords[i] = ReadText.words.get(i);
	      }

	      
	      for (int i=0; i<newWords.length; i++) {
	    	  noNum = true;
		      while(noNum) {
		    	  try {
		    		  String last = newWords[i].substring
		    				  (newWords[i].length()-1, newWords[i].length());
		    		  lastNum = Integer.parseInt(last);
		    		  newWords[i] = newWords[i].substring
		    				  (0, newWords[i].length()-1);
		    	  } catch (Exception e){
		    		  noNum = false;
		    		  String last = newWords[i].substring
		    				  (newWords[i].length()-1, newWords[i].length());
		    		  System.out.println(i + "번째 단어의 마지막 글자 " + last + "는 수가 아니다");
		    	  }
		      }
		      
//		      System.out.println(newWords[i]);
	      }

	      
	      for (int i=0; i<newWords.length; i++) {
		      out.write(newWords[i]); out.newLine();
	      }

	      out.close();
	////////////////////////////////////////////////////////////////
		 } catch (IOException e) {
		      System.err.println(e); // 에러가 있다면 메시지 출력
		      System.exit(1);
		 }
	}
}
