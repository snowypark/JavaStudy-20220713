package j19_익명클래스.람다식;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DefaultFunction {

	public static void main(String[] args) {

		Runnable runnable = () -> {
			System.out.println("runnable 인터페이스를 활용한 람다식");
			System.out.println("중괄호 안에 여러 실행문을 작성할 수 있다.");
		};

		runnable.run();

		Supplier<Integer> supplier = () -> 100;
		Supplier<Integer> supplier2 = () -> {
			System.out.println("다른 실행문 추가");
			return 100;
		};

		System.out.println(supplier.get());
		System.out.println(supplier2.get());

		Consumer<String> consumer = (name) -> {
			System.out.println("이름: " + name);
		};

		consumer.accept("김ㅇㅇ");

		Function<Integer, Integer> function = (num) -> num * num;
		System.out.println(function.apply(10));

		Predicate<String> predicate = (str) -> str == null || str.isBlank();
		// bool 공백 확인
		System.out.println(predicate.test("ㄴ"));

		System.out.println(predicate.test(null));

		// 매개변수 2개 () 생략불가
		BiConsumer<Integer, Integer> biConsumer = (num1, num2) -> {
			System.out.println("num1 + num2 = " + (num1 + num2));
		};

		UnaryOperator<Integer> operator = num -> num * num * num;
		System.out.println(operator.apply(2));

		BinaryOperator<Integer> operator2 = (num1, num2) -> num1 * num2;
		System.out.println(operator2.apply(10, 20));

	}

}
