package j14_lombok.builder;

public class ProductMain {

	public static void main(String[] args) {

		Product product = Product.builder().createDate("2020").
				productCategory("텀블러")
				.build();
		
		System.out.println(product);

	}
}
