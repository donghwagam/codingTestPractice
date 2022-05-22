package n2525_오븐시계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 입력클래스
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		// 입력생성변수
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
	
		a=a+(c/60);
		b=b+(c%60);
		
		if(b>=60) {
			a=a+(b/60);
			b=b%60;
			if(a>=24) {
				System.out.print((a=a-24)+" "+b);
			} else {
				System.out.print(a+" "+b);
			}
		} else {
			if(a>=24) {
				System.out.print((a=a-24)+" "+b);
			} else {
				System.out.print(a+" "+b);
			}
		}
	}

}
