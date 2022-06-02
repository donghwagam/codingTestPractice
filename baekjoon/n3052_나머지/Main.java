package n3052_나머지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 입력클래스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 중복원소제거 집합 생성
		HashSet<Integer> h = new HashSet<>();
		
		// 반복문
		for(int i=0; i<10; i++) {
			h.add(Integer.parseInt(br.readLine())%42);
		}
		
		// 출력
		System.out.println(h.size());
	}

}


