package n2439_별찍기_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 입력클래스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트케이스 입력변수 생성
		int N = Integer.parseInt(br.readLine());
		
		// 반복문(이중반복문)
		for(int i=0; i<N; i++) {
			//공백의개수
			for(int j=0; j<=N-i-2; j++) {
				System.out.print(" ");
			}
			//별(*)의개수
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
