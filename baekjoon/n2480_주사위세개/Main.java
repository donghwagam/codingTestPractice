package n2480_주사위세개;

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
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		// 조건문
		if(a==b && b==c) {
			System.out.println(10000 + (a*1000));
		} else if(a==b && b!=c) {
			System.out.println(1000 + (a*100));
		} else if(b==c && c!=a) {
			System.out.println(1000 + (b*100));
		} else if(c==a && a!=b) {
			System.out.println(1000 + (c*100));
		} else if((a>b && b>c) || (a>c && c>b)) {
			System.out.println(a*100);
		} else if((b>a && a>c) || (b>c && c>a)) {
			System.out.println(b*100);
		} else if((c>a && a>b) || (c>b && b>a)) {
			System.out.println(c*100);
		}
	}

}
