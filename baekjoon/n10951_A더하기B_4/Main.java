package n10951_A더하기B_4;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// 입력클래스 생성
		Scanner in = new Scanner(System.in);
		
		// in에 다음 숫자가 있다면
		while (in.hasNextInt()) {
			
			int a = in.nextInt();
			int b = in.nextInt();
			
			System.out.println(a+b);
		}
		
	}

}
