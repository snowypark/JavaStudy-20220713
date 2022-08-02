package j14_lombok.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class Product {


	private int productCode; 			// 제품코드
	private String productName; 		// 제품명
	private String productCategory; 	// 제품 카테고리
	private String createDate; 			// 생산일자

	/*
	 * 20220802 스타벅스 텀블러 텀블러 2022-08-02
	 */

	public static Product builder() {
		return new Product();
	}

	public Product build() {
		return this;
	}

	public Product productCode(int productCode) {
		this.productCode = productCode;
		return this;
	}

	public Product productName(String productName) {
		this.productName = productName;
		return this;
	}

	public Product productCategory(String productCategroy) {
		this.productCategory = productCategroy;
		return this;
	}

	public Product createDate(String createDate) {
		this.createDate = createDate;
		return this;
	}

	public Product(int productCode, String productName, String productCategory, String createDate) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productCategory = productCategory;
		this.createDate = createDate;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

}
