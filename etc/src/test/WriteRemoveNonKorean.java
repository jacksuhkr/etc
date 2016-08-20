package test;

import java.io.*;

public class WriteRemoveNonKorean {
	public static void main(String[] args) throws IOException { 
		ReadText.getWords();
		boolean noSpace = true;
		String space;
		String[] newWords = new String[ReadText.words.size()];
		
		try {
	////////////////////////////////////////////////////////////////
	      BufferedWriter out = new BufferedWriter
	    		  (new FileWriter("C:/files/without_nonkorean.txt"));
	      
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
		      System.err.println(e); // ¿¡·¯°¡ ÀÖ´Ù¸é ¸Þ½ÃÁö Ãâ·Â
		      System.exit(1);
		 }
	}
	
	public static boolean theresNoSpace(String input) {
		for(int i=0; i<input.length(); i++) {
			char subString = input.charAt(i);
//			if(input.substring(i, i+1).equals("?")) {
//				System.out.println("?ÀÌ ÀÖ¾î¼­ Á¦°Å");
//				return false;
//			}
			if('°¡' > subString || subString > 'ÆR') {
				System.out.println(subString + "°¡ ÀÖ¾î¼­ Á¦°Å");
				return false;
			}
		}
		return true;
	}
}
