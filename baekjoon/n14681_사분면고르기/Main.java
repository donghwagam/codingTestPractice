package n14681_사분면고르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 입력클래스
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력변수생성
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		// 조건문
		if(a>0 && b>0) {
			System.out.println("1");
		} else if (a<0 && b>0) {
			System.out.println("2");
		} else if (a<0 && b<0) {
			System.out.println("3");
		} else if (a>0 && b<0) {
			System.out.println("4");
		}
	}

}
