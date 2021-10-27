package com.xworkz.java;

import com.xworkz.java.dao.BucketDAO;
import com.xworkz.java.dto.BucketDTO;

public class BucketStarterDTO {

	public static void main(String[] args) {
		
		BucketDTO bucketDTO=new BucketDTO();
		bucketDTO.setColour("red");
		bucketDTO.setCompany("xpro");
		bucketDTO.setPrice(55.0f);
		bucketDTO.setQuantity(2.0f);
		bucketDTO.setSize("large");
		bucketDTO.setWeight(18.0f);
		
		BucketDTO bucketDTO1=new BucketDTO("green","small",80.0f,9.0f,12.0f,"vaibhav");
		BucketDTO bucketDTO2=new BucketDTO("purple","big",80.0f,9.0f,12.0f,"wipro");
		BucketDTO bucketDTO3=new BucketDTO("blue","medium",80.0f,9.0f,12.0f,"lauras");
		BucketDTO bucketDTO4=new BucketDTO("violet","large",80.0f,9.0f,12.0f,"aarti");
		
		BucketDAO bucketDAO=new BucketDAO();
		//crud
		bucketDAO.save(bucketDTO1);
		bucketDAO.save(bucketDTO2);
		bucketDAO.save(bucketDTO4);
		bucketDAO.save(bucketDTO3);
		
		bucketDAO.delete(2);
		bucketDAO.update(2, bucketDTO4);
		
		BucketDTO[] ref=bucketDAO.getDto();
		for (int i = 0; i < ref.length; i++) {
			BucketDTO fig=ref[i];
			System.out.println("~~~~~~~~~~~~~");
			if(fig!=null) {
				System.out.println("colour:".concat(fig.getColour()));
				System.out.println("company:"+fig.getCompany());
				System.out.println("price:"+fig.getPrice());
				System.out.println("quantity:"+fig.getQuantity());
				System.out.println("size:"+fig.getSize());
				System.out.println("weight:"+fig.getWeight());
			}else {
			System.err.println("index is empty");
		}
		}

	}

	}


