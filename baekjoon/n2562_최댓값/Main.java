package n2562_최댓값;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 입력클래스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 배열생성
		int[] arr = new int[9];
		
		// 반복문
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		// 카운트 변수생성
		int cnt = 0;
		
		// 최댓갑 변수생성
		int max = 0;
		
		// 최댓값이 몇번째인지 변수생성
		int index = 0;
		
		// 반복문
		for(int value : arr) {
			cnt++;
			if(value > max) {
				max = value;
				index = cnt;
			}
		}
		
		// 출력
		System.out.println(max);
		System.out.println(index);
		
		
	}

}
