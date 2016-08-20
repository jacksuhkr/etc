package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
	public static ArrayList<String> getWords() {
		ArrayList<String> words = new ArrayList<String>();
		
		try {
		BufferedReader in = new BufferedReader(new FileReader("c:/files/korean_body_words.txt"));

		String s;
		while ((s = in.readLine()) != null) { words.add(s); }
		
		for (int i=0; i<words.size(); i++) {
			System.out.println("words.get(" + i + ") : " + words.get(i));
			i++;
		}

		in.close();		//file close

		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
		
		return words;
	}
}
