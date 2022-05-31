package n1110_더하기사이클;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 입력클래스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력변수 생성
		int N = Integer.parseInt(br.readLine());
	
		// 입력변수 복사(나중에 계산된 입력변수와 비교하기위해)
		int copy = N;
		
		// 회전수
		int cnt = 0;
		
		// 반복문
		do {// 알고리즘
			N = (N%10)*10 +	(((N/10)+(N%10)))%10 ;
			cnt++;
		} while(copy!=N);
		
		System.out.println(cnt);
	}

}
