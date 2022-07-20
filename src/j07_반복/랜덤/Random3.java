package j07_반복.랜덤;

import java.util.Random;

public class Random3 {

	public static void main(String[] args) {

		/*
		 * Random 클래스 nextBoolean() nextInt() double, float ...
		 * 
		 */

		Random random = new Random();

		int i = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int max = 0;

		while (i < 20) {
			a = random.nextInt(50);
			b = random.nextInt(50);
			c = random.nextInt(50);

			System.out.println();
			System.out.println(i + 1 + "번");
			System.out.println("a: " + a);
			System.out.println("b: " + b);
			System.out.println("c: " + c);

			if (a > b) {
				if (max < a) {
					max = a;
				}
			} else {
				if (max < b) {
					max = b;
				}
			}
			
			//else면 실행이 안됨
			if (max < c) {
				max = c;
			}
			System.out.println("현재 max: " + max);
			i++;
		}

		System.out.println("최대값: " + max);
	}
}
