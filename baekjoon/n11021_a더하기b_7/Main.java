package n11021_a더하기b_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 입력클래스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력할 테스트케이스 변수생성
		int a = Integer.parseInt(br.readLine());
		
		// 토크나이징클래스 생성
		StringTokenizer st;
		
		// 스트링빌더클래스 생성
		StringBuilder sb = new StringBuilder();
		
		// 반복문
		for(int i=1; i<=a; i++) {
			//입력될 한줄을 토크나이징해서 읽기
			st = new StringTokenizer(br.readLine()," ");
			//각 스트링을 sb에 담기
			sb.append("Case #").append(i).append(": ").append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())).append('\n');
		}

		System.out.println(sb);
	}
}
