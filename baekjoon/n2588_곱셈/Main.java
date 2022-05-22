package n2588_곱셈;

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
		
		// 출력값
		System.out.println(a*(b%10));
		System.out.println(a*((b%100)/10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
	}

}
