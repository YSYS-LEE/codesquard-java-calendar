package honux.calender;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		String[] num = number.split(" ");
		
		int first = Integer.parseInt(num[0]);
		int second = Integer.parseInt(num[1]);
		
		System.out.println("두 수의 합은" + (first + second)  + "입니다");
		scanner.close();
	}

}
