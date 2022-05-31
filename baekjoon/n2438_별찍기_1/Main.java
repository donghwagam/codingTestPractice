package n2438_별찍기_1;

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
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			// 한줄작성하면 다음칸으로 이동하여 작성
			System.out.println();
		}
	}

}
