package n2577_숫자의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 입력클래스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력변수 생성
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		// 곱한값 생성
		int mp = A*B*C;
		
		// String 형태로 변경
		String str = Integer.toString(mp);
		
		// 배열로 생성
		int[] arr = new int[str.length()];
		
		// 반복문(이중)
		for(int i=0; i<10; i++) {
			// 카운트 변수생성
			int cnt = 0;
			for(int j=0; j<str.length(); j++) {
				if((str.charAt(j)-'0') == i) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

}
