package n2742_기찍n;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 입력클래스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력한 테스트케이스변수 생성
		int a = Integer.parseInt(br.readLine());
		
		// 반복문
		for(int i=a; i>0; i--) {
			System.out.println(i);
		}
	}

}
