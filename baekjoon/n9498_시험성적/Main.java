package n9498_시험성적;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 입력클래스
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 입력변수생성
		int a = Integer.parseInt(st.nextToken());
		
		// 조건문
		if(a>=90 && a<=100) {
			System.out.println("A");
		} else if(a>=80 && a<=89) {
			System.out.println("B");
		} else if(a>=70 && a<=79) {
			System.out.println("C");
		} else if(a>=60 && a<=69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
