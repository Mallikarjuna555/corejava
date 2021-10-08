class Product1Runner{

	public static void main(String[] args){
	
	Product1 product=new Product1("trimmer","gadgets",555.0f,5,"jeff");
		product.displayDetails();
		product.printTotalCost();
		
	Product1 ref=new Product1(600.0f,10);	
		ref.printTotalCost();
		ref.printTotalProductsCost();
	
	} 

}