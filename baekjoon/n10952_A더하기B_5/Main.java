package n10952_A더하기B_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		// 입력클래스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// String 쪼갤클래스 생성
		StringTokenizer st;
		
		// String 합칠클래스 생성
		StringBuilder sb = new StringBuilder();
		
		// 반복문
		while(true) {
			// String 쪼갤클래스 객체생성
			st = new StringTokenizer(br.readLine()," ");
			
			// 입력변수 생성
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a==0 && b==0) {
				break;
			}
			
			sb.append(a+b).append('\n');
		}
		
		System.out.println(sb);
	}

}
