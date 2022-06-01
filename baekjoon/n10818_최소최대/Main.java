package n10818_최소최대;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 입력클래스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트케이스 입력변수 생성
		int N = Integer.parseInt(br.readLine());
		
		// 테스트케이스만큼 배열개수 생성
		int[] arr = new int[N];
		
		// String 쪼갤클래스 생성(띄워쓰기단위로 쪼개기)
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		// 반복문
		for(int i=0; i<N; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		// 배열 오름차순으로 정렬
		Arrays.sort(arr);
		
		// 출력
		System.out.print(arr[0]+" "+arr[N-1]);
	}

}
