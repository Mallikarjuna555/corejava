class Product1{
	String name;
	String type;
	float price;
	int quantity;
	String vendor;
	static float totalProductsCost;
	
	
	Product1(String name,String type,float price,int quantity,String vendor){
		this.name=name;
		this.type=type;
		this.price=price;
		this.quantity=quantity;
		this.vendor=vendor;
	}
	
	Product1(float price,int quantity){
		this.price=price;
		this.quantity=quantity;
	}
	
	void displayDetails()
	{
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.vendor);
	}
		void printTotalCost()
		{
			float total=this.price*this.quantity;
			System.out.println("total:"+total);
			totalProductsCost=totalProductsCost+total;
		}
		
	void printTotalProductsCost()
		{
			System.out.println(totalProductsCost);	
		}
}
	