package honux.calender;

import java.util.Scanner;

public class Sum_video {
	public static void main(String[] args) {
		// int 설정, 외부입력 값 받아오기
		int a, b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("두 수를 입력해주세요");
		
		// s1을 String으로 변환, a를 Integer로 변환
		s1 = scanner.next();
		s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		// 출력, scanner 닫기
		System.out.printf("%d과 %d의 값은 %d 입니다", a, b, a+b);
		scanner.close();
	}

}
