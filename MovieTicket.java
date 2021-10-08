class MovieTicket{
	String movieName;
	String theatre;
	float price;
	int noOfSeats;
	String type;
	
	
	MovieTicket(String movieName,String theatre,float price,int noOfSeats,String type){
		this.movieName=movieName;
		this.theatre=theatre;
		this.price=price;
		this.noOfSeats=noOfSeats;
		this.type=type;
	
	}

void displayDetails()
{
	
	System.out.println(movieName);
	System.out.println(theatre);
	System.out.println(price);
	System.out.println(noOfSeats);
	System.out.println(type);

}

void printTotalPrice()
{
	float totalPrice=price*noOfSeats;
	System.out.println(totalPrice);

}
}