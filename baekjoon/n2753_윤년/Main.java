package n2753_윤년;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 입력클래스
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 입력변수생성
		int a = Integer.parseInt(st.nextToken());
		
		// 조건문
		if(a%4==0 && a%100!=0 || a%400==0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
