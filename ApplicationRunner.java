class ApplicationRunner{

	public static void main(String[] args){
	
	Application application=new Application();
		application.name="FB LITE";
		application.version=338.0f;
		application.displayDetails();
		
		
	Company company=new Company();
		company.name="FACEBOOK";
		company.country="US";
		company.ceo="mark zukerberg";
		company.cfo="adam";
		company.displayDetails();
	}
}