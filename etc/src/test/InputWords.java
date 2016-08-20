package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputWords {
	private static BufferedReader in;

	public static void main(String[] args) throws IOException {

	int i = 0;
		
	//경로와 파일명
	final String PATH = "c:/files/";
	final String FILENAME = "korean_3467words.txt";

	//readline 읽을 String변수
	String line = "";

	//파일 데이터 저장 스트림
	in = new BufferedReader(new FileReader(PATH + FILENAME));

	//저장할 어레이 선언
	ArrayList<String> words = new ArrayList<String>();

	//파일 라인별로 읽음
	while (words.get(i) != null) {
		//출력
		for(i = 0; i < words.size(); i ++) {
		System.out.println(words.get(i));
		}
		//스트림 종료
		in.close();
		}
	}
}
