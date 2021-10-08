class FoodItemRunner{
	public static void main (String[] args){
	
	FoodItem foodItem=new FoodItem("panner butter masala",250.0f,"food land",250,5);
		System.out.println(foodItem.name);
		System.out.println(foodItem.price);
		
		foodItem.displayDetails();
		foodItem.printTotalPrice();
		
	FoodItem foodItem1=new FoodItem(20.0f,10);
		foodItem1.printTotalFoodItemsPrice();
		foodItem.printHotelName();
	
	
	}


}