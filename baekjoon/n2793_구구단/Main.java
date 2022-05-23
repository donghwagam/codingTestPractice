package n2793_구구단;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 입력클래스
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력변수생성
		int a = Integer.parseInt(br.readLine());
		
		// 반복문
		for(int i=1 ; i<10; i++) {
			System.out.println(a+" * "+i +" = "+ a*i); 
		}
	}

}
