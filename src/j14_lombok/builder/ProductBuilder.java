package j14_lombok.builder;

public abstract class ProductBuilder {
		
		protected Product product;
		
		public Product build() {
			return product;
		}
		
		public ProductBuilder builder() {
			product = new Product();
			return this;
			
		}
		
		public abstract ProductBuilder productCode(int productcode);
		public abstract ProductBuilder productName(String productname);
		public abstract ProductBuilder productCategory(String productcategory);
		public abstract ProductBuilder createDate(String createdate);

		

		
		

	

}
