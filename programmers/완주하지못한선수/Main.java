package 완주하지못한선수;

import java.util.Arrays;

public class Main {

	public String solution(String[] participant, String[] completion) {
		// 1. 두 배열을 정렬한다.
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		// 2. 두 배열이 다를때까지 찾는다.
		int i = 0;
		for(i=0; i<completion.length;i++) {
			if(!participant[i].equals(completion[i])) {
				break;
			}
		}
		
		// 3. 여기까지 왔다는 것은 마지막 주자가 완주하지 못했다는 의미이다.
		return participant[i];
	}
	
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		Main main = new Main();
		System.out.println(main.solution(participant, completion));
		
	}

}
