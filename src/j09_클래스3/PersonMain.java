package j09_클래스3;

public class PersonMain {

	public static void main(String[] args) {
		
		String[] names = {"ㅇㅇㅇ", "ㅁㅁㅁ", "ㄴㄴㄴ"};
		int[] ages = {29, 25, 23};
		
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(i + 1 + "번 사람(이름): " + names[i]);
			System.out.println(i + 1 + "번 사람(나이): " + ages[i]);
		}
		
		System.out.println();
		
		
		String name1 = "AAA";
		String name2 = "BBB";
		String name3 = "CCC";
		int age1 = 25;
		int age2 = 26;
		int age3 = 27;
		
		System.out.println("1번 사람(이름): " + name1);
		System.out.println("2번 사람(이름): " + name2);
		System.out.println("3번 사람(이름): " + name3);
		System.out.println("1번 사람(나이): " + age1);
		System.out.println("2번 사람(나이): " + age2);
		System.out.println("3번 사람(나이): " + age3);
		
		
	
	}

}
