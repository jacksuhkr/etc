package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

// �ܾ��� �����ڰ� ų�������� ù���ڶ� ������ ���� �ܾ�鸸 ������
// ���� �����, ���� ���� �ܾ �갡 �޾��ĺ��� ������ �ܾ�� ����

public class SafeWord {
	public static void main(String[] args) throws IOException { 
		// �ؽ�Ʈ������ �ҷ��ͼ� word�� ����
		ArrayList<String> words = new ArrayList<String>();
		try {
			BufferedReader in = new BufferedReader(new FileReader("c:/files/korean_body_words.txt"));
			String s;
			while ((s = in.readLine()) != null) { words.add(s); }
		
			// ����� �ҷ��Գ� ����غ�
			for (int i=0; i<words.size(); i++) {
				System.out.println("words.get(" + i + ") : " + words.get(i));
				i++;
			}
		} catch(IOException e) {
			System.out.println("����� ����");
		}
		
		// �ؽ�Ʈ������ �ҷ��ͼ� word�� ����
		ArrayList<String> killerWords = new ArrayList<String>();
		try {
			BufferedReader in = new BufferedReader(new FileReader("c:/files/korean_killer_words.txt"));
			String s;
			while ((s = in.readLine()) != null) { killerWords.add(s); }
		
			// ����� �ҷ��Գ� ����غ�
			for (int i=0; i<killerWords.size(); i++) {
				System.out.println("killerWords.get(" + i + ") : " + killerWords.get(i));
				i++;
			}
		} catch(IOException e) {
			System.out.println("����� ����");
		}
		
		
		// livingWords�� ����
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
		  }	//for��
	  }		//try
	      
	      out.close();
	      
		 } catch (IOException e) {
		      System.err.println(e); // ������ �ִٸ� �޽��� ���
		      System.exit(1);
		 }
	}
}
