package j14_lombok.builder;

public class Builder extends ProductBuilder{
	
	
	@Override
	public ProductBuilder productCode(int productcode) {
		product.setProductCode(productcode);
		return this;
	}
	
	@Override
	public ProductBuilder productName(String productname) {
		product.setProductName(productname);
		return this;
	}
	
	@Override
	public ProductBuilder productCategory(String productcategory) {
		product.setProductCategory(productcategory);
		return this;
	}
	
	@Override
	public ProductBuilder createDate(String createdate) {
		product.setCreateDate(createdate);
		return this;
	}
	


}
