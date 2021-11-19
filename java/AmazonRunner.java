package com.xworkz;

import com.xworkz.java.AmazonBusiness;
import com.xworkz.java.AmazonCartDAO;
import com.xworkz.java.ArrayAmazonCartDAO;
import com.xworkz.java.CartDTO;

public class AmazonRunner {

	public static void main(String[] args) {

		
				
				CartDTO cartDTORef=new CartDTO("gadgets",2,5000.0f,10);
				AmazonCartDAO amzonCartDAORef=new ArrayAmazonCartDAO();
				AmazonBusiness business=new AmazonBusiness(amzonCartDAORef);
				business.saveCart(cartDTORef);
				business.findCartByName(null);
				business.displayCart();

			}

		
	}


