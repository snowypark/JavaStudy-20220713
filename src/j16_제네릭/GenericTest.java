package j16_제네릭;

import lombok.Data;

@Data


public class GenericTest<T, E> {
			// T = (type)타입, E = (elements)객체, 요소
	private E key;
	private T value;
			 //타입 지정
	
}
