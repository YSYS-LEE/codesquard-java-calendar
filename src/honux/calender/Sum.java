package honux.calender;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		
		// 외부 입력값 가져오기, string으로 변환해서 숫자 하나씩 나누기
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		String[] num = number.split(" ");
		
		// string을 Integer로 변환
		int first = Integer.parseInt(num[0]);
		int second = Integer.parseInt(num[1]);
		
		// 출력, scanner 닫기
		System.out.println("두 수의 합은" + (first + second)  + "입니다");
		scanner.close();
	}

}
