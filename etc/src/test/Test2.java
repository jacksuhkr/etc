package test;

import java.util.Scanner;
import java.lang.String;

public class Test2 {
	
	
	public static void main(String[] args) {
		int sum=0;
		for (int i = 0; i<100; i++) {
			if (i>10) {break;}
			sum += i;
			System.out.println(sum);
		}
	}
}
