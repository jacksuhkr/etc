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
		    		  System.out.println(i + "��° �ܾ��� ������ ���� " + last + "�� ���� �ƴϴ�");
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
		      System.err.println(e); // ������ �ִٸ� �޽��� ���
		      System.exit(1);
		 }
	}
}
