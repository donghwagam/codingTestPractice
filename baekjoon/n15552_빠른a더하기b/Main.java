package n15552_빠른a더하기b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 입력클래스
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트케이스 변수생성
		int a = Integer.parseInt(br.readLine());
		
		// 더할숫자 입력변수생성(한줄에 여러개 작성하기 위해 조각)
		StringTokenizer st;
		
		// 조각된 숫자를 한줄에 작성
		StringBuilder sb = new StringBuilder();
		
		// 반복문
		for(int i=0; i<a; i++) {
			st = new StringTokenizer(br.readLine()," "); 
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
		
		// 출력
		System.out.println(sb);
	}

}
