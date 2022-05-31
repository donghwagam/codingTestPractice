package n11022_a더하기b_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 입력클래스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트케이스입력변수 생성
		int c = Integer.parseInt(br.readLine());
		
		// String토크나이징클래스 생성
		StringTokenizer st;
		
		// String합칠클래스 생성
		StringBuilder sb = new StringBuilder();
		
		// 반복문
		for(int i=1; i<=c; i++) {
			// 토크나이징클래스 객체생성
			st = new StringTokenizer(br.readLine());
			// 첫번째입력 변수생성
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			// 출력
			sb.append("Case #").append(i).append(": ").append(a).append(" + ").append(b).append(" = ").append(a+b).append('\n');
		}
		System.out.println(sb);
	}
}

