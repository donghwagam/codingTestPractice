package n10871_X보다작은수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 입력클래스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// String 쪼갤클래스 생성
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		// 입력케이스 입력변수 생성
		int N = Integer.parseInt(st.nextToken());
		
		// 기준케이스 입력변수 생성
		int X = Integer.parseInt(st.nextToken());
		
		// 새로 String 쪼갤클래스 생성
		st = new StringTokenizer(br.readLine()," ");
		
		// 출력시 String 합칠 클래스 생성
		StringBuilder sb = new StringBuilder();
		
		// 반복문
		for(int i=0; i<N; i++) {
			
			// 입력값이자 기준케이스와 비교될 숫자
			int value = Integer.parseInt(st.nextToken());
			
			// 기준케이스와 비교하여 그 수 들만 합치기
			if(value < X) {
				sb.append(value).append(' ');
			}
		}
		System.out.println(sb);
		
	}
	
}


