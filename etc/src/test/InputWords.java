package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputWords {
	private static BufferedReader in;

	public static void main(String[] args) throws IOException {

	int i = 0;
		
	//��ο� ���ϸ�
	final String PATH = "c:/files/";
	final String FILENAME = "korean_3467words.txt";

	//readline ���� String����
	String line = "";

	//���� ������ ���� ��Ʈ��
	in = new BufferedReader(new FileReader(PATH + FILENAME));

	//������ ��� ����
	ArrayList<String> words = new ArrayList<String>();

	//���� ���κ��� ����
	while (words.get(i) != null) {
		//���
		for(i = 0; i < words.size(); i ++) {
		System.out.println(words.get(i));
		}
		//��Ʈ�� ����
		in.close();
		}
	}
}
