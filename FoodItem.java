class FoodItem{
	String name;
	float price;
	String hotelName;
	int quantity;
	int rating;
	static float totalFoodItemsPrice;
	
enum orderType{
	ONLINE,DINEIN,TAKEWAY;
}

enum type{
	STARTERS,MAINCOURSE,DESSERTS;
}

FoodItem(String name,float price,String hotelName,int quantity,int rating){
	this.name=name;
	this.price=price;
	this.hotelName=hotelName;
	this.quantity=quantity;
	this.rating=rating;

}

FoodItem(float price,int quantity){
		this.price=price;
		this.quantity=quantity;
}

void displayDetails()
{
	System.out.println(this.name);
	System.out.println(this.price);
	System.out.println(this.hotelName);
	System.out.println(this.quantity);
	System.out.println(this.rating);
	type ref=type.STARTERS;
	System.out.println(ref);
	orderType ref1=orderType.ONLINE;
	System.out.println(ref1);
}

void printTotalPrice()
{
	float totalPrice=this.price*this.quantity;
	System.out.println(totalPrice);
	totalFoodItemsPrice=totalFoodItemsPrice+totalPrice;
}

void printTotalFoodItemsPrice()
{
	
	System.out.println(totalFoodItemsPrice);
	
}

void printHotelName()
{
	
	System.out.println(this.hotelName);
}
}