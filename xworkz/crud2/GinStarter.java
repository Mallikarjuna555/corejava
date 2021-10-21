package com.xworkz.crud2;

import com.xworkz.Operator.Gin;

public class GinStarter {

	public static void main(String[] args) {
		
		Gin gin=new Gin();
		gin.getPrice();
		
		gin.brandNames("tanqureray");
		gin.brandNames("hendricks");
		gin.brandNames("san mighel");
		gin.brandNames("bombay sapphire");
		gin.brandNames("sapphire");
		
		gin.dispalyBrandNames();
		
	}

}
