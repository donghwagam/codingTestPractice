package n8393_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 입력클래스
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트케이스 입력변수생성
		int a = Integer.parseInt(br.readLine());
		
		// 합계변수생성
		int sum = 0;
		
		// 반복문
		for(int i=1; i<=a; i++) {
			sum = sum +i; 
		}
		
		// 출력
		System.out.println(sum);
	}

}
