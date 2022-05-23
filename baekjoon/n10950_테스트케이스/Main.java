package n10950_테스트케이스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 입력클래스
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트케이스 입력변수생성(한줄만 작성)
		int t = Integer.parseInt(br.readLine());
		
		// 더할숫자 입력변수생성(한줄에 여러개 작성하기 위해 조각)
		StringTokenizer st;
		
		// 조각된 숫자를 한줄에 작성
		StringBuilder sb = new StringBuilder();
		
		// 반복문
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
		
		System.out.println(sb);
	}	
}
