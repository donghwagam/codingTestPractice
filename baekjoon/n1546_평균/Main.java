package n1546_평균;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 입력클래스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트케이스 수만큼 배열생성
		double[] arr = new double[Integer.parseInt(br.readLine())];

		// String 쪼갤클래스 생성
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
				
		// 반복문
		for(int i=0; i<arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		// 합계 변수생성
		double sum = 0;

		// 배열 일렬로 정렬
		Arrays.sort(arr);
		
		// 합계구하는 반복문 생성
		for(int i=0; i<arr.length; i++) {
			sum = sum + ((arr[i] / arr[arr.length-1]) * 100);
		}
		
		System.out.println(sum/arr.length);
	}

}
