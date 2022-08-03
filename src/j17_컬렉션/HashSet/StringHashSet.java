package j17_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class StringHashSet {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		// 입력 순서에 상관없이 출력. 자료구조 -> 해시 공부

		set.add("java");
		set.add("java1");
		set.add("python");
		set.add("python");
		set.add("python");
		set.add("1");

		System.out.println(set);

		Iterator<String> ir = set.iterator();
		ir.hasNext();

//		System.out.println(ir.hasNext()); // 다음을 확인
//		System.out.println(ir.next());
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());		
//		System.out.println(ir.hasNext()); // 다 비었다.

		System.out.println();
		System.out.println(set);

		// 값 조회
		while (ir.hasNext()) {
			String str = ir.next();
			if (str.equals("java")) {
				System.out.println(str);
			}
		}
		
		
		
		
		// set의 수정 : 값 삭제 -> add로 새 값 추가.
		// 특정 값의 변경 불가능.
		
		
		
		
	}

}
